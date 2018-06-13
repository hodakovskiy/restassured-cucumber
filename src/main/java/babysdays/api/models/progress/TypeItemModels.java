package babysdays.api.models.progress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
  "Admin",
  "AlertStatus",
  "DateAchieved",
  "NSStatus",
  "NextStep",
  "ObsNotes",
  "Photo",
  "StartPoint",
  "Video"
})
public class TypeItemModels {

  @JsonProperty("Admin")
  private String admin;
  @JsonProperty("AlertStatus")
  private String alertStatus;
  @JsonProperty("DateAchieved")
  private String dateAchieved;
  @JsonProperty("NSStatus")
  private String nSStatus;
  @JsonIgnore
  @JsonProperty("NextStep")
  private List<NextStep> nextStep = new ArrayList<NextStep>();
  @JsonIgnore
  @JsonProperty("ObsNotes")
  private List<ObsNote> obsNotes = new ArrayList<ObsNote>();
  @JsonProperty("Photo")
  private int photo;
  @JsonProperty("StartPoint")
  private String startPoint;
  @JsonProperty("Video")
  private int video;
 
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("Admin")
  public String getAdmin() {
    return admin;
  }

  @JsonProperty("Admin")
  public void setAdmin(String admin) {
    this.admin = admin;
  }

  @JsonProperty("AlertStatus")
  public String getAlertStatus() {
    return alertStatus;
  }

  @JsonProperty("AlertStatus")
  public void setAlertStatus(String alertStatus) {
    this.alertStatus = alertStatus;
  }

  @JsonProperty("DateAchieved")
  public String getDateAchieved() {
    return dateAchieved;
  }

  @JsonProperty("DateAchieved")
  public void setDateAchieved(String dateAchieved) {
    this.dateAchieved = dateAchieved;
  }

  @JsonProperty("NSStatus")
  public String getNSStatus() {
    return nSStatus;
  }

  @JsonProperty("NSStatus")
  public void setNSStatus(String nSStatus) {
    this.nSStatus = nSStatus;
  }

  @JsonIgnore
  @JsonProperty("NextStep")
  public List<NextStep> getNextStep() {
    return nextStep;
  }

  @JsonIgnore
  @JsonProperty("NextStep")
  public void setNextStep(List<NextStep> nextStep) {
    this.nextStep = nextStep;
  }

  @JsonIgnore
  @JsonProperty("ObsNotes")
  public List<ObsNote> getObsNotes() {
    return obsNotes;
  }

  @JsonIgnore
  @JsonProperty("ObsNotes")
  public void setObsNotes(List<ObsNote> obsNotes) {
    this.obsNotes = obsNotes;
  }

  @JsonProperty("Photo")
  public int getPhoto() {
    return photo;
  }

  @JsonProperty("Photo")
  public void setPhoto(int photo) {
    this.photo = photo;
  }

  @JsonProperty("StartPoint")
  public String getStartPoint() {
    return startPoint;
  }

  @JsonProperty("StartPoint")
  public void setStartPoint(String startPoint) {
    this.startPoint = startPoint;
  }

  @JsonProperty("Video")
  public int getVideo() {
    return video;
  }

  @JsonProperty("Video")
  public void setVideo(int video) {
    this.video = video;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    if("NextStep".equals(name) && "".equals(value) ){
       this.additionalProperties.put(name, null);
    } else  if("ObsNotes".equals(name) && "".equals(value)){
       this.additionalProperties.put(name, null);
    } else {
        this.additionalProperties.put(name, value);
    }
//    System.out.print(value + " --------------------------------------------------" + name);
   
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("admin", admin).append("alertStatus", alertStatus).append("dateAchieved", dateAchieved).append("nSStatus", nSStatus).append("nextStep", nextStep).append("obsNotes", obsNotes).append("photo", photo).append("startPoint", startPoint).append("video", video).append("additionalProperties", additionalProperties).toString();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(additionalProperties).append(admin).append(dateAchieved).append(photo).append(obsNotes).append(nextStep).append(nSStatus).append(video).append(startPoint).append(alertStatus).toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof TypeItemModels) == false) {
      return false;
    }
    TypeItemModels rhs = ((TypeItemModels) other);
    return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(admin, rhs.admin).append(dateAchieved, rhs.dateAchieved).append(photo, rhs.photo).append(obsNotes, rhs.obsNotes).append(nextStep, rhs.nextStep).append(nSStatus, rhs.nSStatus).append(video, rhs.video).append(startPoint, rhs.startPoint).append(alertStatus, rhs.alertStatus).isEquals();
  }

}
