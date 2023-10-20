package org.yul.github.universe.service;

import org.apache.camel.Header;
import org.yul.github.universe.camel.routes.ScheduleRoute;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface ScheduleService {

    Map<String, Map<String, List<ScheduleRoute.SessionSummary>>> retrieveSchedule(@Header("Rfapiprofileid") String apiProfileId, @Header("rfWidgetId") String widgetId);
}
