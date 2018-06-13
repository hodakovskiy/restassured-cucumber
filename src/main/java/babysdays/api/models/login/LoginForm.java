package babysdays.api.models.login;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import utilities.DefaultParams;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "android",
  "api_vers",
  "build",
  "device",
  "password",
  "token",
  "username"
})
public class LoginForm {

  DefaultParams params;
  private String urlGet = "?option=com_sted_mobile&controller=login&task=login";

  public String getUrlGet() {
    return urlGet;
  }
  
  @JsonProperty("android")
  private String android;
  @JsonProperty("api_vers")
  private String apiVers;
  @JsonProperty("build")
  private String build;
  @JsonProperty("device")
  private String device;
  @JsonProperty("password")
  private String password;
  @JsonProperty("token")
  private String token;
  @JsonProperty("username")
  private String username;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public LoginForm(String INIKey) {
    this.params = new DefaultParams();

    this.username = params.loadData(INIKey, "loginAdmin");
    this.password = params.loadData(INIKey, "loginPass");
    this.android = params.loadData(INIKey, "android");
    this.apiVers = params.loadData(INIKey, "api_vers");
    this.build = params.loadData(INIKey, "build");
    this.device = params.loadData(INIKey, "device");
    this.token = params.loadData(INIKey, "token");
  }

  @Override
  public String toString() {
    return "LoginForm{" + "params=" + params + ", android=" + android + ", apiVers=" + apiVers + ", build=" + build + ", device=" + device + ", password=" + password + ", token=" + token + ", username=" + username + ", additionalProperties=" + additionalProperties + '}';
  }

  @JsonProperty("android")
  public String getAndroid() {
    return android;
  }

  @JsonProperty("android")
  public void setAndroid(String android) {
    this.android = android;
  }

  @JsonProperty("api_vers")
  public String getApiVers() {
    return apiVers;
  }

  @JsonProperty("api_vers")
  public void setApiVers(String apiVers) {
    this.apiVers = apiVers;
  }

  @JsonProperty("build")
  public String getBuild() {
    return build;
  }

  @JsonProperty("build")
  public void setBuild(String build) {
    this.build = build;
  }

  @JsonProperty("device")
  public String getDevice() {
    return device;
  }

  @JsonProperty("device")
  public void setDevice(String device) {
    this.device = device;
  }

  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }

  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  @JsonProperty("token")
  public void setToken(String token) {
    this.token = token;
  }

  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
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
