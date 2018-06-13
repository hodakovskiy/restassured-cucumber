
package babysdays.api.models.predefined_room;

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
    "adminRoom",
    "capacity",
    "childRoom",
    "from",
    "id",
    "image",
    "ordering",
    "published",
    "ratio",
    "title",
    "to"
})
public class RoomList {

    @JsonProperty("adminRoom")
    private String adminRoom;
    @JsonProperty("capacity")
    private String capacity;
    @JsonProperty("childRoom")
    private String childRoom;
    @JsonProperty("from")
    private String from;
    @JsonProperty("id")
    private String id;
    @JsonProperty("image")
    private String image;
    @JsonProperty("ordering")
    private String ordering;
    @JsonProperty("published")
    private String published;
    @JsonProperty("ratio")
    private String ratio;
    @JsonProperty("title")
    private String title;
    @JsonProperty("to")
    private String to;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adminRoom")
    public String getAdminRoom() {
        return adminRoom;
    }

    @JsonProperty("adminRoom")
    public void setAdminRoom(String adminRoom) {
        this.adminRoom = adminRoom;
    }

    @JsonProperty("capacity")
    public String getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("childRoom")
    public String getChildRoom() {
        return childRoom;
    }

    @JsonProperty("childRoom")
    public void setChildRoom(String childRoom) {
        this.childRoom = childRoom;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("ordering")
    public String getOrdering() {
        return ordering;
    }

    @JsonProperty("ordering")
    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    @JsonProperty("published")
    public String getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(String published) {
        this.published = published;
    }

    @JsonProperty("ratio")
    public String getRatio() {
        return ratio;
    }

    @JsonProperty("ratio")
    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
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
