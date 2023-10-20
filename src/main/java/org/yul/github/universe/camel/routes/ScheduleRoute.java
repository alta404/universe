package org.yul.github.universe.camel.routes;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.yul.github.universe.domain.GithubUniverseSchedule;
import org.yul.github.universe.domain.Section;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
@ConfigurationProperties("universe.routes.schedule")
@Slf4j
public class ScheduleRoute extends RouteBuilder {

    public static final String SCHEDULE_ROUTE = "direct:schedule-route";
    private static final String SCHEDULE_ROUTE_ID = "schedule-route";
    private static final String RESOURCE_PATH = ScheduleRoute.class.getClassLoader().getResource("").getPath();

    private String endpoint;
    private String wiretap;
    private ScheduleConfig scheduleConfig;

    record ScheduleConfig(String host, String port){}

    @Override
    public void configure() throws Exception {
        from(SCHEDULE_ROUTE)
                .routeId(SCHEDULE_ROUTE_ID)
                .process(e -> log.debug("headers: Rfapiprofileid -> {}", e.getIn().getHeader("Rfapiprofileid")))
                .process(e -> log.debug("headers: rfWidgetId -> {}", e.getIn().getHeader("Rfapiprofileid")))
                .to(endpoint)
                .wireTap(format("file:///%s/?fileName=%s", RESOURCE_PATH, wiretap))
                .unmarshal()
                .json(JsonLibrary.Jackson, GithubUniverseSchedule.class)
                .setBody(e -> extractItems(e.getIn().getBody(GithubUniverseSchedule.class)))
                .process(e -> log.debug("body: {}", e.getIn().getBody()))
        ;
    }

    public record SessionSummary(String code, String type, String title, String dateStr, String startTime, String endTime){}

    private Map<String, Map<String, List<SessionSummary>>> extractItems(GithubUniverseSchedule schedule) {
        return schedule.getSectionList().stream()
                .map(Section::getItems)
                .flatMap(List::stream)
                .map(item -> new SessionSummary(item.getCode(),
                        item.getType(),
                        item.getTitle(),
                        item.getTimes().getFirst().date,
                        item.getTimes().getFirst().startTime,
                        item.getTimes().getFirst().endTime))
                .collect(Collectors.groupingBy(SessionSummary::dateStr, TreeMap::new, sessionCollectorByType()));
    }

    private Collector<SessionSummary, ?, Map<String, List<SessionSummary>>> sessionCollectorByType() {
        return Collectors.groupingBy(SessionSummary::type, TreeMap::new, toList());
        //return Collectors.groupingBy(SessionSummary::type);
    }
}
