
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
    "attributeDisplayName",
    "rf_attributevalue_id",
    "rf_attribute_id",
    "dataForm",
    "attribute_id",
    "attributevalue_id",
    "attribute",
    "published",
    "value"
})
@Generated("jsonschema2pojo")
public class Attributevalue {

    @JsonProperty("attributeDisplayName")
    public String attributeDisplayName;
    @JsonProperty("rf_attributevalue_id")
    public String rfAttributevalueId;
    @JsonProperty("rf_attribute_id")
    public String rfAttributeId;
    @JsonProperty("dataForm")
    public String dataForm;
    @JsonProperty("attribute_id")
    public String attributeId;
    @JsonProperty("attributevalue_id")
    public String attributevalueId;
    @JsonProperty("attribute")
    public String attribute;
    @JsonProperty("published")
    public Double published;
    @JsonProperty("value")
    public String value;
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
