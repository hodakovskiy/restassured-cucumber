
package babysdays.api.models.progress;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Activ",
    "Age",
    "Aval",
    "Birth",
    "Fist_name",
    "Id",
    "Last_name",
    "Parents",
    "Photograph",
    "Room_id",
    "Room_title"
})
public class ViewIndividualListModel {

    @JsonProperty("Activ")
    private int activ;
    @JsonProperty("Age")
    private int age;
    @JsonProperty("Aval")
    private int aval;
    @JsonProperty("Birth")
    private String birth;
    @JsonProperty("Fist_name")
    private String fistName;
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Last_name")
    private String lastName;
    @JsonProperty("Parents")
    private boolean parents;
    @JsonProperty("Photograph")
    private String photograph;
    @JsonProperty("Room_id")
    private String roomId;
    @JsonProperty("Room_title")
    private String roomTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Activ")
    public int getActiv() {
        return activ;
    }

    @JsonProperty("Activ")
    public void setActiv(int activ) {
        this.activ = activ;
    }

    @JsonProperty("Age")
    public int getAge() {
        return age;
    }

    @JsonProperty("Age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("Aval")
    public int getAval() {
        return aval;
    }

    @JsonProperty("Aval")
    public void setAval(int aval) {
        this.aval = aval;
    }

    @JsonProperty("Birth")
    public String getBirth() {
        return birth;
    }

    @JsonProperty("Birth")
    public void setBirth(String birth) {
        this.birth = birth;
    }

    @JsonProperty("Fist_name")
    public String getFistName() {
        return fistName;
    }

    @JsonProperty("Fist_name")
    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    @JsonProperty("Id")
    public int getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("Last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("Last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("Parents")
    public boolean isParents() {
        return parents;
    }

    @JsonProperty("Parents")
    public void setParents(boolean parents) {
        this.parents = parents;
    }

    @JsonProperty("Photograph")
    public String getPhotograph() {
        return photograph;
    }

    @JsonProperty("Photograph")
    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }

    @JsonProperty("Room_id")
    public String getRoomId() {
        return roomId;
    }

    @JsonProperty("Room_id")
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    @JsonProperty("Room_title")
    public String getRoomTitle() {
        return roomTitle;
    }

    @JsonProperty("Room_title")
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("activ", activ).append("age", age).append("aval", aval).append("birth", birth).append("fistName", fistName).append("id", id).append("lastName", lastName).append("parents", parents).append("photograph", photograph).append("roomId", roomId).append("roomTitle", roomTitle).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastName).append(parents).append(birth).append(photograph).append(roomTitle).append(roomId).append(fistName).append(activ).append(id).append(additionalProperties).append(age).append(aval).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViewIndividualListModel) == false) {
            return false;
        }
        ViewIndividualListModel rhs = ((ViewIndividualListModel) other);
        return new EqualsBuilder().append(lastName, rhs.lastName).append(parents, rhs.parents).append(birth, rhs.birth).append(photograph, rhs.photograph).append(roomTitle, rhs.roomTitle).append(roomId, rhs.roomId).append(fistName, rhs.fistName).append(activ, rhs.activ).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(age, rhs.age).append(aval, rhs.aval).isEquals();
    }

}
