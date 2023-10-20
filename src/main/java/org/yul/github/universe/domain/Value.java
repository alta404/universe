
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
    "rf_attribute_id",
    "attributevalue_code",
    "dataForm",
    "published",
    "viewAccessPublic",
    "viewAccess",
    "scheduleAccess",
    "attribute",
    "displayorder",
    "id",
    "name",
    "checked",
    "hourEpochMilliseconds",
    "date",
    "time"
})
@Generated("jsonschema2pojo")
public class Value {

    @JsonProperty("rf_attributevalue_id")
    public String rfAttributevalueId;
    @JsonProperty("rf_attribute_id")
    public String rfAttributeId;
    @JsonProperty("attributevalue_code")
    public String attributevalueCode;
    @JsonProperty("dataForm")
    public String dataForm;
    @JsonProperty("published")
    public Double published;
    @JsonProperty("viewAccessPublic")
    public Boolean viewAccessPublic;
    @JsonProperty("viewAccess")
    public List<String> viewAccess = new ArrayList<String>();
    @JsonProperty("scheduleAccess")
    public List<String> scheduleAccess = new ArrayList<String>();
    @JsonProperty("attribute")
    public String attribute;
    @JsonProperty("displayorder")
    public Double displayorder;
    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("checked")
    public Boolean checked;
    @JsonProperty("hourEpochMilliseconds")
    public String hourEpochMilliseconds;
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
