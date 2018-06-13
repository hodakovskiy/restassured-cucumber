
package babysdays.api.models.predefined_room;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pagination",
    "result",
    "roomList"
})
public class Response {

    @JsonProperty("pagination")
    private String pagination;
    @JsonProperty("result")
    private Result result;
    @JsonProperty("roomList")
    private List<RoomList> roomList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pagination")
    public String getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("roomList")
    public List<RoomList> getRoomList() {
        return roomList;
    }

    @JsonProperty("roomList")
    public void setRoomList(List<RoomList> roomList) {
        this.roomList = roomList;
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
