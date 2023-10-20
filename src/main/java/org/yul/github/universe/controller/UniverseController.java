package org.yul.github.universe.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Produce;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yul.github.universe.camel.routes.ScheduleRoute;
import org.yul.github.universe.service.ScheduleService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import static org.yul.github.universe.camel.routes.ScheduleRoute.SCHEDULE_ROUTE;

@RestController("/github")
@Slf4j
public class UniverseController {

    @Produce(SCHEDULE_ROUTE)
    private ScheduleService scheduleService;

    @PostMapping("/schedule")
    public Map<String, Map<String, List<ScheduleRoute.SessionSummary>>> fetchSchedule(@RequestParam(value = "apiProfileId", defaultValue = "lUapEjlZDqHeL7TB5wqnlEbg2gEP4xNB") String apiProfileId,
                                                                                      @RequestParam(value = "widgetId", defaultValue = "03JSiuv3O8eGJe2pUkphdRuxgrkRGUmg") String widgetId) {

        var schedule = scheduleService.retrieveSchedule(apiProfileId, widgetId);
       // log.debug("schedule: {}", schedule);
        return schedule;
    }
}
