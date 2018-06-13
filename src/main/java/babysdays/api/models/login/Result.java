
package babysdays.api.models.login;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msg",
    "complete",
    "additional_info",
    "access_token",
    "acl",
    "aid",
    "room",
    "options",
    "v",
    "api",
    "app",
    "ios",
    "android",
    "section_block",
    "section_block_message",
    "version_system",
    "beta"
})
public class Result {

    @JsonProperty("msg")
    private String msg = "ddd";
    @JsonProperty("complete")
    private Boolean complete;
    @JsonProperty("additional_info")
    private String additionalInfo;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("acl")
    private String acl;
    @JsonProperty("aid")
    private String aid;
    @JsonProperty("room")
    private String room;
    @JsonProperty("options")
    private Options options;
    @JsonProperty("v")
    private Integer v;
    @JsonProperty("api")
    private String api;
    @JsonProperty("app")
    private Integer app;
    @JsonProperty("ios")
    private Integer ios;
    @JsonProperty("android")
    private Integer android;
    @JsonProperty("section_block")
    private Object sectionBlock;
    @JsonProperty("section_block_message")
    private String sectionBlockMessage;
    @JsonProperty("version_system")
    private String versionSystem;
    @JsonProperty("beta")
    private Boolean beta;

    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    @JsonProperty("msg")
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonProperty("complete")
    public Boolean getComplete() {
        return complete;
    }

    @JsonProperty("complete")
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    @JsonProperty("additional_info")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additional_info")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("acl")
    public String getAcl() {
        return acl;
    }

    @JsonProperty("acl")
    public void setAcl(String acl) {
        this.acl = acl;
    }

    @JsonProperty("aid")
    public String getAid() {
        return aid;
    }

    @JsonProperty("aid")
    public void setAid(String aid) {
        this.aid = aid;
    }

    @JsonProperty("room")
    public String getRoom() {
        return room;
    }

    @JsonProperty("room")
    public void setRoom(String room) {
        this.room = room;
    }

    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
    }

    @JsonProperty("v")
    public Integer getV() {
        return v;
    }

    @JsonProperty("v")
    public void setV(Integer v) {
        this.v = v;
    }

    @JsonProperty("api")
    public String getApi() {
        return api;
    }

    @JsonProperty("api")
    public void setApi(String api) {
        this.api = api;
    }

    @JsonProperty("app")
    public Integer getApp() {
        return app;
    }

    @JsonProperty("app")
    public void setApp(Integer app) {
        this.app = app;
    }

    @JsonProperty("ios")
    public Integer getIos() {
        return ios;
    }

    @JsonProperty("ios")
    public void setIos(Integer ios) {
        this.ios = ios;
    }

    @JsonProperty("android")
    public Integer getAndroid() {
        return android;
    }

    @JsonProperty("android")
    public void setAndroid(Integer android) {
        this.android = android;
    }

    @JsonProperty("section_block")
    public Object getSectionBlock() {
        return sectionBlock;
    }

    @JsonProperty("section_block")
    public void setSectionBlock(Object sectionBlock) {
        this.sectionBlock = sectionBlock;
    }

    @JsonProperty("section_block_message")
    public String getSectionBlockMessage() {
        return sectionBlockMessage;
    }

    @JsonProperty("section_block_message")
    public void setSectionBlockMessage(String sectionBlockMessage) {
        this.sectionBlockMessage = sectionBlockMessage;
    }

    @JsonProperty("version_system")
    public String getVersionSystem() {
        return versionSystem;
    }

    @JsonProperty("version_system")
    public void setVersionSystem(String versionSystem) {
        this.versionSystem = versionSystem;
    }

    @JsonProperty("beta")
    public Boolean getBeta() {
        return beta;
    }

    @JsonProperty("beta")
    public void setBeta(Boolean beta) {
        this.beta = beta;
    }

  @Override
  public String toString() {
    return "Result{" + "msg=" + msg + ", complete=" + complete + ", additionalInfo=" + additionalInfo + ", accessToken=" + accessToken + ", acl=" + acl + ", aid=" + aid + ", room=" + room + ", options=" + options + ", v=" + v + ", api=" + api + ", app=" + app + ", ios=" + ios + ", android=" + android + ", sectionBlock=" + sectionBlock + ", sectionBlockMessage=" + sectionBlockMessage + ", versionSystem=" + versionSystem + ", beta=" + beta + '}';
  }

}
