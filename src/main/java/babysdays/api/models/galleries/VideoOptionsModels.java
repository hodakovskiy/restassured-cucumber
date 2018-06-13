/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysdays.api.models.galleries;

/**
 *
 * @author sergey
 */

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
"aid",
"available_size",
"gallery_type",
"host",
"maxFileSize",
"maxFileSizeParse",
"total_size",
"total_size_html",
"upload_dir",
"video_path"
})
public class VideoOptionsModels {

@JsonProperty("aid")
private String aid;
@JsonProperty("available_size")
private Long availableSize;
@JsonProperty("gallery_type")
private String galleryType;
@JsonProperty("host")
private String host;
@JsonProperty("maxFileSize")
private Long maxFileSize;
@JsonProperty("maxFileSizeParse")
private String maxFileSizeParse;
@JsonProperty("total_size")
private String totalSize;
@JsonProperty("total_size_html")
private String totalSizeHtml;
@JsonProperty("upload_dir")
private String uploadDir;
@JsonProperty("video_path")
private String videoPath;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("aid")
public String getAid() {
return aid;
}

@JsonProperty("aid")
public void setAid(String aid) {
this.aid = aid;
}

@JsonProperty("available_size")
public Long getAvailableSize() {
return availableSize;
}

@JsonProperty("available_size")
public void setAvailableSize(Long availableSize) {
this.availableSize = availableSize;
}

@JsonProperty("gallery_type")
public String getGalleryType() {
return galleryType;
}

@JsonProperty("gallery_type")
public void setGalleryType(String galleryType) {
this.galleryType = galleryType;
}

@JsonProperty("host")
public String getHost() {
return host;
}

@JsonProperty("host")
public void setHost(String host) {
this.host = host;
}

@JsonProperty("maxFileSize")
public Long getMaxFileSize() {
return maxFileSize;
}

@JsonProperty("maxFileSize")
public void setMaxFileSize(Long maxFileSize) {
this.maxFileSize = maxFileSize;
}

@JsonProperty("maxFileSizeParse")
public String getMaxFileSizeParse() {
return maxFileSizeParse;
}

@JsonProperty("maxFileSizeParse")
public void setMaxFileSizeParse(String maxFileSizeParse) {
this.maxFileSizeParse = maxFileSizeParse;
}

@JsonProperty("total_size")
public String getTotalSize() {
return totalSize;
}

@JsonProperty("total_size")
public void setTotalSize(String totalSize) {
this.totalSize = totalSize;
}

@JsonProperty("total_size_html")
public String getTotalSizeHtml() {
return totalSizeHtml;
}

@JsonProperty("total_size_html")
public void setTotalSizeHtml(String totalSizeHtml) {
this.totalSizeHtml = totalSizeHtml;
}

@JsonProperty("upload_dir")
public String getUploadDir() {
return uploadDir;
}

@JsonProperty("upload_dir")
public void setUploadDir(String uploadDir) {
this.uploadDir = uploadDir;
}

@JsonProperty("video_path")
public String getVideoPath() {
return videoPath;
}

@JsonProperty("video_path")
public void setVideoPath(String videoPath) {
this.videoPath = videoPath;
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
