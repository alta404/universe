
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
    "rf_attributevalue_id",
    "attributevalue_id",
    "published",
    "displayorder",
    "attributevalue_code",
    "scheduleAccess",
    "rf_attribute_id",
    "dataForm",
    "attribute_id",
    "attribute",
    "value",
    "viewAccess",
    "viewAccessPublic",
    "date",
    "time"
})
@Generated("jsonschema2pojo")
public class Attributevalue__1 {

    @JsonProperty("rf_attributevalue_id")
    public String rfAttributevalueId;
    @JsonProperty("attributevalue_id")
    public String attributevalueId;
    @JsonProperty("published")
    public Double published;
    @JsonProperty("displayorder")
    public Double displayorder;
    @JsonProperty("attributevalue_code")
    public String attributevalueCode;
    @JsonProperty("scheduleAccess")
    public List<String> scheduleAccess = new ArrayList<String>();
    @JsonProperty("rf_attribute_id")
    public String rfAttributeId;
    @JsonProperty("dataForm")
    public String dataForm;
    @JsonProperty("attribute_id")
    public String attributeId;
    @JsonProperty("attribute")
    public String attribute;
    @JsonProperty("value")
    public String value;
    @JsonProperty("viewAccess")
    public List<String> viewAccess = new ArrayList<String>();
    @JsonProperty("viewAccessPublic")
    public Boolean viewAccessPublic;
    @JsonProperty("date")
    public String date;
    @JsonProperty("time")
    public String time;
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
