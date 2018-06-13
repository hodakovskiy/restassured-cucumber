
package babysdays.api.models.login;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "system",
    "manage",
    "setting",
    "daily",
    "children",
    "parents",
    "staff",
    "progress",
    "medical",
    "legal",
    "galleries",
    "communicate"
})
public class Options {

    @JsonProperty("system")
    private List<String> system = null;
    @JsonProperty("manage")
    private List<String> manage = null;
    @JsonProperty("setting")
    private List<String> setting = null;
    @JsonProperty("daily")
    private List<String> daily = null;
    @JsonProperty("children")
    private List<String> children = null;
    @JsonProperty("parents")
    private List<String> parents = null;
    @JsonProperty("staff")
    private List<String> staff = null;
    @JsonProperty("progress")
    private List<String> progress = null;
    @JsonProperty("medical")
    private List<String> medical = null;
    @JsonProperty("legal")
    private List<String> legal = null;
    @JsonProperty("galleries")
    private List<String> galleries = null;
    @JsonProperty("communicate")
    private List<String> communicate = null;

    @JsonProperty("system")
    public List<String> getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(List<String> system) {
        this.system = system;
    }

    @JsonProperty("manage")
    public List<String> getManage() {
        return manage;
    }

    @JsonProperty("manage")
    public void setManage(List<String> manage) {
        this.manage = manage;
    }

    @JsonProperty("setting")
    public List<String> getSetting() {
        return setting;
    }

    @JsonProperty("setting")
    public void setSetting(List<String> setting) {
        this.setting = setting;
    }

    @JsonProperty("daily")
    public List<String> getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(List<String> daily) {
        this.daily = daily;
    }

    @JsonProperty("children")
    public List<String> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<String> children) {
        this.children = children;
    }

    @JsonProperty("parents")
    public List<String> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    @JsonProperty("staff")
    public List<String> getStaff() {
        return staff;
    }

    @JsonProperty("staff")
    public void setStaff(List<String> staff) {
        this.staff = staff;
    }

    @JsonProperty("progress")
    public List<String> getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(List<String> progress) {
        this.progress = progress;
    }

    @JsonProperty("medical")
    public List<String> getMedical() {
        return medical;
    }

    @JsonProperty("medical")
    public void setMedical(List<String> medical) {
        this.medical = medical;
    }

    @JsonProperty("legal")
    public List<String> getLegal() {
        return legal;
    }

    @JsonProperty("legal")
    public void setLegal(List<String> legal) {
        this.legal = legal;
    }

    @JsonProperty("galleries")
    public List<String> getGalleries() {
        return galleries;
    }

    @JsonProperty("galleries")
    public void setGalleries(List<String> galleries) {
        this.galleries = galleries;
    }

    @JsonProperty("communicate")
    public List<String> getCommunicate() {
        return communicate;
    }

    @JsonProperty("communicate")
    public void setCommunicate(List<String> communicate) {
        this.communicate = communicate;
    }

}
