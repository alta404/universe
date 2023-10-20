
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
    "responseCode",
    "responseMessage",
    "sections",
    "nestedSections",
    "totalSearchItems",
    "sectionList",
    "attributes",
    "searchTimestamp"
})
@Generated("jsonschema2pojo")
@Data
public class GithubUniverseSchedule implements Serializable {

    @JsonProperty("responseCode")
    public String responseCode;
    @JsonProperty("responseMessage")
    public String responseMessage;
    @JsonProperty("sections")
    public Boolean sections;
    @JsonProperty("nestedSections")
    public Boolean nestedSections;
    @JsonProperty("totalSearchItems")
    public Integer totalSearchItems;
    @JsonProperty("sectionList")
    public List<Section> sectionList = new ArrayList<Section>();
    @JsonProperty("attributes")
    public List<Attribute> attributes = new ArrayList<Attribute>();
    @JsonProperty("searchTimestamp")
    public Long searchTimestamp;
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
