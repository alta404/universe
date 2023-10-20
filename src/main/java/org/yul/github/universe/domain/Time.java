
package org.yul.github.universe.domain;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "webinarRequiresEnrollment",
    "sessionTimeID",
    "virtualScheduleCapacity",
    "dayName",
    "longMonth",
    "dayTimeHour",
    "sessionID",
    "endTimeFormatted",
    "dayTimeSort",
    "roomId",
    "capacity",
    "scheduleAccess",
    "endTimeMin",
    "utcEndTime",
    "startTime",
    "virtualTime",
    "day",
    "hasWebinarId",
    "daySort",
    "inPersonTime",
    "dayDisplayName",
    "length",
    "startTimeMin",
    "attendAccess",
    "waitlistLimit",
    "room",
    "hasWebinarChatId",
    "isHidden",
    "startTimeFormatted",
    "shortMonth",
    "utcStartTime",
    "replayable",
    "dayId",
    "time",
    "endTime",
    "viewAccess",
    "viewAccessPublic",
    "startEndTimeSort",
    "endDate",
    "dateFormatted"
})
@Generated("jsonschema2pojo")
public class Time {

    @JsonProperty("date")
    public String date;
    @JsonProperty("webinarRequiresEnrollment")
    public Boolean webinarRequiresEnrollment;
    @JsonProperty("sessionTimeID")
    public String sessionTimeID;
    @JsonProperty("virtualScheduleCapacity")
    public String virtualScheduleCapacity;
    @JsonProperty("dayName")
    public String dayName;
    @JsonProperty("longMonth")
    public String longMonth;
    @JsonProperty("dayTimeHour")
    public String dayTimeHour;
    @JsonProperty("sessionID")
    public String sessionID;
    @JsonProperty("endTimeFormatted")
    public String endTimeFormatted;
    @JsonProperty("dayTimeSort")
    public String dayTimeSort;
    @JsonProperty("roomId")
    public String roomId;
    @JsonProperty("capacity")
    public String capacity;
    @JsonProperty("scheduleAccess")
    public List<String> scheduleAccess = new ArrayList<String>();
    @JsonProperty("endTimeMin")
    public Double endTimeMin;
    @JsonProperty("utcEndTime")
    public String utcEndTime;
    @JsonProperty("startTime")
    public String startTime;
    @JsonProperty("virtualTime")
    public Boolean virtualTime;
    @JsonProperty("day")
    public String day;
    @JsonProperty("hasWebinarId")
    public Boolean hasWebinarId;
    @JsonProperty("daySort")
    public String daySort;
    @JsonProperty("inPersonTime")
    public Boolean inPersonTime;
    @JsonProperty("dayDisplayName")
    public String dayDisplayName;
    @JsonProperty("length")
    public Double length;
    @JsonProperty("startTimeMin")
    public Double startTimeMin;
    @JsonProperty("attendAccess")
    public List<String> attendAccess = new ArrayList<String>();
    @JsonProperty("waitlistLimit")
    public String waitlistLimit;
    @JsonProperty("room")
    public String room;
    @JsonProperty("hasWebinarChatId")
    public Boolean hasWebinarChatId;
    @JsonProperty("isHidden")
    public Boolean isHidden;
    @JsonProperty("startTimeFormatted")
    public String startTimeFormatted;
    @JsonProperty("shortMonth")
    public String shortMonth;
    @JsonProperty("utcStartTime")
    public String utcStartTime;
    @JsonProperty("replayable")
    public Boolean replayable;
    @JsonProperty("dayId")
    public String dayId;
    @JsonProperty("time")
    public String time;
    @JsonProperty("endTime")
    public String endTime;
    @JsonProperty("viewAccess")
    public List<String> viewAccess = new ArrayList<String>();
    @JsonProperty("viewAccessPublic")
    public Boolean viewAccessPublic;
    @JsonProperty("startEndTimeSort")
    public String startEndTimeSort;
    @JsonProperty("endDate")
    public String endDate;
    @JsonProperty("dateFormatted")
    public String dateFormatted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
