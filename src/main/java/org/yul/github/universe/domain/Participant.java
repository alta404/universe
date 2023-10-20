
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
    "lastName",
    "session",
    "companyName",
    "jobTitle",
    "roles",
    "bio",
    "speakerId",
    "language",
    "globalFullName",
    "globalPhotoURL",
    "photoURL",
    "twitter",
    "globalLastname",
    "modified",
    "globalFirstname",
    "eventId",
    "es_metadata_id",
    "globalCompany",
    "fullName",
    "linkedIn",
    "published",
    "displayorder",
    "testRecord",
    "attributevalues",
    "firstName",
    "userRef",
    "Speaker-Photo-Published",
    "globalBio",
    "globalJobtitle"
})
@Generated("jsonschema2pojo")
public class Participant {

    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("session")
    public List<Session> session = new ArrayList<Session>();
    @JsonProperty("companyName")
    public String companyName;
    @JsonProperty("jobTitle")
    public String jobTitle;
    @JsonProperty("roles")
    public String roles;
    @JsonProperty("bio")
    public String bio;
    @JsonProperty("speakerId")
    public String speakerId;
    @JsonProperty("language")
    public String language;
    @JsonProperty("globalFullName")
    public String globalFullName;
    @JsonProperty("globalPhotoURL")
    public String globalPhotoURL;
    @JsonProperty("photoURL")
    public String photoURL;
    @JsonProperty("twitter")
    public String twitter;
    @JsonProperty("globalLastname")
    public String globalLastname;
    @JsonProperty("modified")
    public String modified;
    @JsonProperty("globalFirstname")
    public String globalFirstname;
    @JsonProperty("eventId")
    public String eventId;
    @JsonProperty("es_metadata_id")
    public String esMetadataId;
    @JsonProperty("globalCompany")
    public String globalCompany;
    @JsonProperty("fullName")
    public String fullName;
    @JsonProperty("linkedIn")
    public String linkedIn;
    @JsonProperty("published")
    public Double published;
    @JsonProperty("displayorder")
    public Double displayorder;
    @JsonProperty("testRecord")
    public Boolean testRecord;
    @JsonProperty("attributevalues")
    public List<Attributevalue> attributevalues = new ArrayList<Attributevalue>();
    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("userRef")
    public String userRef;
    @JsonProperty("Speaker-Photo-Published")
    public String speakerPhotoPublished;
    @JsonProperty("globalBio")
    public String globalBio;
    @JsonProperty("globalJobtitle")
    public String globalJobtitle;
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
