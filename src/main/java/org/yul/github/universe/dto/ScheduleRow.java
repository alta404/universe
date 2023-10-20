package org.yul.github.universe.dto;

import java.util.List;

public class ScheduleRow {

    String date;

    List<Session> sessions;
    record Session(String slot, String title){}
}
