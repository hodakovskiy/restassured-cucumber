
package babysdays.api.models.galleries;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chid",
    "first_name",
    "birth",
    "last_name",
    "child_image",
    "room_id",
    "room_title",
    "age"
})
public class VideoChild {

    @JsonProperty("chid")
    private String chid;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("birth")
    private String birth;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("child_image")
    private String childImage;
    @JsonProperty("room_id")
    private String roomId;
    @JsonProperty("room_title")
    private String roomTitle;
    @JsonProperty("age")
    private Integer age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("chid")
    public String getChid() {
        return chid;
    }

    @JsonProperty("chid")
    public void setChid(String chid) {
        this.chid = chid;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("birth")
    public String getBirth() {
        return birth;
    }

    @JsonProperty("birth")
    public void setBirth(String birth) {
        this.birth = birth;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("child_image")
    public String getChildImage() {
        return childImage;
    }

    @JsonProperty("child_image")
    public void setChildImage(String childImage) {
        this.childImage = childImage;
    }

    @JsonProperty("room_id")
    public String getRoomId() {
        return roomId;
    }

    @JsonProperty("room_id")
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    @JsonProperty("room_title")
    public String getRoomTitle() {
        return roomTitle;
    }

    @JsonProperty("room_title")
    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
