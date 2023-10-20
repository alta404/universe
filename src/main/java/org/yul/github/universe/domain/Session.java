
package org.yul.github.universe.domain;

import java.util.LinkedHashMap;
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
    "speakerRole",
    "sessionID",
    "published",
    "abbreviation",
    "title",
    "status"
})
@Generated("jsonschema2pojo")
public class Session {

    @JsonProperty("speakerRole")
    public String speakerRole;
    @JsonProperty("sessionID")
    public String sessionID;
    @JsonProperty("published")
    public String published;
    @JsonProperty("abbreviation")
    public String abbreviation;
    @JsonProperty("title")
    public String title;
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
