
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
    "sectionId",
    "total",
    "numItems",
    "from",
    "size",
    "items",
    "epochMilliseconds"
})
@Generated("jsonschema2pojo")
@Data
public class Section implements Serializable {

    @JsonProperty("sectionId")
    public String sectionId;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("numItems")
    public Integer numItems;
    @JsonProperty("from")
    public Integer from;
    @JsonProperty("size")
    public Integer size;
    @JsonProperty("items")
    public List<Item> items = new ArrayList<Item>();
    @JsonProperty("epochMilliseconds")
    public Long epochMilliseconds;
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
