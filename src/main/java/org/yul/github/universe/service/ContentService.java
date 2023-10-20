package org.yul.github.universe.service;

import org.apache.camel.Produce;
import org.springframework.stereotype.Service;
import org.yul.github.universe.camel.routes.ScheduleRoute;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import static org.yul.github.universe.camel.routes.ScheduleRoute.SCHEDULE_ROUTE;

@Service
public class ContentService {

    @Produce(SCHEDULE_ROUTE)
    private ScheduleService scheduleService;

    public Map<String, Map<String, List<ScheduleRoute.SessionSummary>>> fetchSchedule(String apiProfileId, String widgetId) {
        var schedule = scheduleService.retrieveSchedule(apiProfileId, widgetId);
        // log.debug("schedule: {}", schedule);
        return schedule;
    }
}
