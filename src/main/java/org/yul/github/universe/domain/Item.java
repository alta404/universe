
package org.yul.github.universe.domain;

import java.io.Serializable;
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
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type_displayorder",
    "sessionTimeID",
    "code",
    "codeParts",
    "hasWebinarChatProfile",
    "externalID",
    "language",
    "sessionID",
    "title",
    "type",
    "code_id",
    "scheduleAccess",
    "times",
    "utcEndTime",
    "timeViewAccess",
    "hasWebinarProfile",
    "waitlistAccess",
    "modified",
    "eventName",
    "participants",
    "viewFileAccess",
    "eventId",
    "length",
    "title_sort",
    "attendAccess",
    "abstract",
    "published",
    "type_displayorder_string",
    "abbreviation",
    "useWaitingList",
    "waitlistLimit",
    "testRecord",
    "attributevalues",
    "eventCode",
    "utcStartTime",
    "publicViewPrivateSchedule",
    "featured_value",
    "useDoubleBooking",
    "viewAccess",
    "viewAccessPublic",
    "status"
})
@Generated("jsonschema2pojo")
@Data
public class Item implements Serializable {

    @JsonProperty("type_displayorder")
    public Double typeDisplayorder;
    @JsonProperty("sessionTimeID")
    public String sessionTimeID;
    @JsonProperty("code")
    public String code;
    @JsonProperty("codeParts")
    public CodeParts codeParts;
    @JsonProperty("hasWebinarChatProfile")
    public Boolean hasWebinarChatProfile;
    @JsonProperty("externalID")
    public String externalID;
    @JsonProperty("language")
    public String language;
    @JsonProperty("sessionID")
    public String sessionID;
    @JsonProperty("title")
    public String title;
    @JsonProperty("type")
    public String type;
    @JsonProperty("code_id")
    public String codeId;
    @JsonProperty("scheduleAccess")
    public List<String> scheduleAccess = new ArrayList<String>();
    @JsonProperty("times")
    public List<Time> times = new ArrayList<Time>();
    @JsonProperty("utcEndTime")
    public String utcEndTime;
    @JsonProperty("timeViewAccess")
    public List<String> timeViewAccess = new ArrayList<String>();
    @JsonProperty("hasWebinarProfile")
    public Boolean hasWebinarProfile;
    @JsonProperty("waitlistAccess")
    public List<Object> waitlistAccess = new ArrayList<Object>();
    @JsonProperty("modified")
    public String modified;
    @JsonProperty("eventName")
    public String eventName;
    @JsonProperty("participants")
    public List<Participant> participants = new ArrayList<Participant>();
    @JsonProperty("viewFileAccess")
    public List<String> viewFileAccess = new ArrayList<String>();
    @JsonProperty("eventId")
    public String eventId;
    @JsonProperty("length")
    public Double length;
    @JsonProperty("title_sort")
    public String titleSort;
    @JsonProperty("attendAccess")
    public List<String> attendAccess = new ArrayList<String>();
    @JsonProperty("abstract")
    public String _abstract;
    @JsonProperty("published")
    public Double published;
    @JsonProperty("type_displayorder_string")
    public String typeDisplayorderString;
    @JsonProperty("abbreviation")
    public String abbreviation;
    @JsonProperty("useWaitingList")
    public String useWaitingList;
    @JsonProperty("waitlistLimit")
    public String waitlistLimit;
    @JsonProperty("testRecord")
    public Boolean testRecord;
    @JsonProperty("attributevalues")
    public List<Attributevalue__1> attributevalues = new ArrayList<Attributevalue__1>();
    @JsonProperty("eventCode")
    public String eventCode;
    @JsonProperty("utcStartTime")
    public String utcStartTime;
    @JsonProperty("publicViewPrivateSchedule")
    public List<Object> publicViewPrivateSchedule = new ArrayList<Object>();
    @JsonProperty("featured_value")
    public Double featuredValue;
    @JsonProperty("useDoubleBooking")
    public Boolean useDoubleBooking;
    @JsonProperty("viewAccess")
    public List<String> viewAccess = new ArrayList<String>();
    @JsonProperty("viewAccessPublic")
    public Boolean viewAccessPublic;
    @JsonProperty("status")
    public String status;
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
