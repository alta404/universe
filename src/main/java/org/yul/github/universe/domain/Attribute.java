
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
    "id",
    "name",
    "rf_attribute_id",
    "displayorder",
    "dataForm",
    "viewAccessPublic",
    "viewAccess",
    "scheduleAccess",
    "published",
    "values",
    "eventId",
    "language",
    "es_metadata_id",
    "highlight"
})
@Generated("jsonschema2pojo")
public class Attribute {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("rf_attribute_id")
    public String rfAttributeId;
    @JsonProperty("displayorder")
    public Double displayorder;
    @JsonProperty("dataForm")
    public String dataForm;
    @JsonProperty("viewAccessPublic")
    public Boolean viewAccessPublic;
    @JsonProperty("viewAccess")
    public List<String> viewAccess = new ArrayList<String>();
    @JsonProperty("scheduleAccess")
    public List<String> scheduleAccess = new ArrayList<String>();
    @JsonProperty("published")
    public Double published;
    @JsonProperty("values")
    public List<Value> values = new ArrayList<Value>();
    @JsonProperty("eventId")
    public String eventId;
    @JsonProperty("language")
    public String language;
    @JsonProperty("es_metadata_id")
    public String esMetadataId;
    @JsonProperty("highlight")
    public Highlight highlight;
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
