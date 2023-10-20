package org.yul.github.universe.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.yul.github.universe.camel.routes.ScheduleRoute;
import org.yul.github.universe.service.ContentService;

import java.util.List;
import java.util.Map;

@Route("schedule")
public class MainView extends VerticalLayout {



    public MainView(@Autowired ContentService contentService) {
        var schedule = contentService.fetchSchedule("lUapEjlZDqHeL7TB5wqnlEbg2gEP4xNB", "03JSiuv3O8eGJe2pUkphdRuxgrkRGUmg");


        //date,      Time,                  Type
        //dateStr    startTine - endTime,   Title
        //grid per date
        //schedule.forEach((key, value) -> add(createGridPerDate(key, value)));
        add(new Text(schedule.toString()));
    }

    Grid<String[]> createGridPerDate(String date, Map<String, List<ScheduleRoute.SessionSummary>> dateSchedule) {
        var grid = new Grid<String[]>();
        //Time, Type for each type
        dateSchedule.keySet().forEach(
                sessionType -> {
                    grid.addColumn("time-" + sessionType);
                    grid.addColumn(sessionType);
                    var sessionsPerType = dateSchedule.get(sessionType);

                }
        );

        return grid;
    }

}
