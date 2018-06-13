
package babysdays.api.models.progress;

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
    "age",
    "birthday",
    "first_name",
    "id",
    "last_name",
    "parents",
    "photograph",
    "room_id",
    "room_title"
})
public class ChildList {

    @JsonProperty("age")
    private String age;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("parents")
    private String parents;
    @JsonProperty("photograph")
    private String photograph;
    @JsonProperty("room_id")
    private String roomId;
    @JsonProperty("room_title")
    private String roomTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("birthday")
    public String getBirthday() {
        return birthday;
    }

    @JsonProperty("birthday")
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("parents")
    public String getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(String parents) {
        this.parents = parents;
    }

    @JsonProperty("photograph")
    public String getPhotograph() {
        return photograph;
    }

    @JsonProperty("photograph")
    public void setPhotograph(String photograph) {
        this.photograph = photograph;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
