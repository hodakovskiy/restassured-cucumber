
package babysdays.api.models.galleries;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.temporal.ChronoField;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import helpers.MyDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "size",
    "type",
    "dateuploaded",
    "videodesc",
    "title",
    "option",
    "controller",
    "task",
    "gallery_type",
    "chid",
    "queueName",
    "queueCount",
    "access_token",
    "HTTP_ORIGIN",
    "date",
    "id",
    "deleteUrl",
    "updateUrl",
    "optionsUrl",
    "deleteType",
    "max_size_html",
    "max_size",
    "parseSize",
    "post_max_size_bytes",
    "post_max_size_html",
    "available_size_html",
    "total_size_html",
    "max_duration_video",
    "max_duration_video_parse",
    "logs",
    "video_info",
    "duration",
    "screenshot",
    "screenshot_big_url",
    "output_avi",
    "exec_video",
    "video",
    "send_client",
    "key_Token"
})
public class RequestVideoServer {
MyDateTime myDateTime = new MyDateTime();
    @JsonProperty("name")
    private String name;
    @JsonProperty("size")
    private int size;
    @JsonProperty("type")
    private String type;
    @JsonProperty("dateuploaded")
    private String dateuploaded;
    @JsonProperty("videodesc")
    private String videodesc;
    @JsonProperty("title")
    private String title;
    @JsonProperty("option")
    private String option;
    @JsonProperty("controller")
    private String controller;
    @JsonProperty("task")
    private String task;
    @JsonProperty("gallery_type")
    private String galleryType;
    @JsonProperty("chid")
    private String chid;
    @JsonProperty("queueName")
    private String queueName;
    @JsonProperty("queueCount")
    private String queueCount;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("HTTP_ORIGIN")
    private String hTTPORIGIN;
    @JsonProperty("date")
    private String date;
    @JsonProperty("id")
    private int id;
    @JsonProperty("deleteUrl")
    private String deleteUrl;
    @JsonProperty("updateUrl")
    private String updateUrl;
    @JsonProperty("optionsUrl")
    private String optionsUrl;
    @JsonProperty("deleteType")
    private String deleteType;
    @JsonProperty("max_size_html")
    private String maxSizeHtml;
    @JsonProperty("max_size")
    private int maxSize;
    @JsonProperty("parseSize")
    private String parseSize;
    @JsonProperty("post_max_size_bytes")
    private int postMaxSizeBytes;
    @JsonProperty("post_max_size_html")
    private String postMaxSizeHtml;
    @JsonProperty("available_size_html")
    private String availableSizeHtml;
    @JsonProperty("total_size_html")
    private String totalSizeHtml;
    @JsonProperty("max_duration_video")
    private String maxDurationVideo;
    @JsonProperty("max_duration_video_parse")
    private String maxDurationVideoParse;
    @JsonProperty("logs")
    private String logs;
    @JsonProperty("video_info")
    private String videoInfo;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("screenshot")
    private String screenshot;
    @JsonProperty("screenshot_big_url")
    private String screenshotBigUrl;
    @JsonProperty("output_avi")
    private String outputAvi;
    @JsonProperty("exec_video")
    private String execVideo;
    @JsonProperty("video")
    private String video;
    @JsonProperty("send_client")
    private String sendClient;
    @JsonProperty("key_Token")
    private String keyToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public RequestVideoServer (String galleryType, String hTTPORIGIN) {
      
    this.name = "general_"+ChronoField.INSTANT_SECONDS+"_"+(int) (Math.random() * 1000)+".mp4";
    this.size = 18539220;
    this.type = "video/mp4";
    this.dateuploaded =  myDateTime.getDateTimeUtfMysql();
    this.videodesc =  "Avtotest video descriptions";
    this.title = "Avtotest video title";
    this.option =  "com_sted_mobile";
    this.controller = "video_gallery";
    this.task = "ajax_html_upload";
    this.galleryType = galleryType;
    this.hTTPORIGIN = hTTPORIGIN;
    this.date =myDateTime.getDatej15();
    this.id = (int) (Math.random() * 1000);
    this.deleteUrl ="/index.php?option=com_sted&controller=video_gallery&task=ajax_delete_video&gallery_type=general&chid=125&file=general_1523891808_8789.mp4";
    this.updateUrl = "/index.php?option=com_sted&controller=video_gallery&task=update_video&gallery_type=general&file=general_1523891808_8789.mp4";
    this.optionsUrl = "options=com_sted&controller=video_gallery&task=ajax_html_upload";
    this.videoInfo = "{\"SourceFile\":\"\\/var\\/www\\/vhosts\\/mybabysdays.com\\/videovm9\\/video\\/j3.drib.tk\\/tmp\\/2018\\/02\\/general_1523891808_8789.mp4\",\"ExifToolVersion\":9.85,\"FileName\":\"general_1523891808_8789.mp4\",\"Directory\":\"\\/var\\/www\\/vhosts\\/mybabysdays.com\\/videovm9\\/video\\/j3.drib.tk\\/tmp\\/2018\\/02\",\"FileSize\":\"18 MB\",\"FileModifyDate\":\"2018:04:16 16:16:48+01:00\",\"FileAccessDate\":\"2018:04:16 16:16:43+01:00\",\"FileInodeChangeDate\":\"2018:04:16 16:16:48+01:00\",\"FilePermissions\":\"rw-r--r--\",\"FileType\":\"MP4\",\"MIMEType\":\"video\\/mp4\",\"MajorBrand\":\"MP4 v2 [ISO 14496-14]\",\"MinorVersion\":\"0.0.0\",\"CompatibleBrands\":[\"isom\",\"mp42\"],\"MovieHeaderVersion\":0,\"CreateDate\":\"2018:02:05 08:59:59\",\"ModifyDate\":\"2018:02:05 08:59:59\",\"TimeScale\":1000,\"Duration\":\"7.19 s\",\"PreferredRate\":1,\"PreferredVolume\":\"100.00%\",\"PreviewTime\":\"0 s\",\"PreviewDuration\":\"0 s\",\"PosterTime\":\"0 s\",\"SelectionTime\":\"0 s\",\"SelectionDuration\":\"0 s\",\"CurrentTime\":\"0 s\",\"NextTrackID\":3,\"ComAndroidVersion\":7,\"TrackHeaderVersion\":0,\"TrackCreateDate\":\"2018:02:05 08:59:59\",\"TrackModifyDate\":\"2018:02:05 08:59:59\",\"TrackID\":1,\"TrackDuration\":\"6.80 s\",\"TrackLayer\":0,\"TrackVolume\":\"0.00%\",\"ImageWidth\":1920,\"ImageHeight\":1080,\"GraphicsMode\":\"srcCopy\",\"OpColor\":\"0 0 0\",\"CompressorID\":\"avc1\",\"SourceImageWidth\":1920,\"SourceImageHeight\":1080,\"XResolution\":72,\"YResolution\":72,\"BitDepth\":24,\"PixelAspectRatio\":\"65536:65536\",\"ColorRepresentation\":\"nclx 1 1 1\",\"VideoFrameRate\":30.278,\"MatrixStructure\":\"1 0 0 0 1 0 0 0 1\",\"MediaHeaderVersion\":0,\"MediaCreateDate\":\"2018:02:05 08:59:59\",\"MediaModifyDate\":\"2018:02:05 08:59:59\",\"MediaTimeScale\":48000,\"MediaDuration\":\"7.19 s\",\"HandlerType\":\"Audio Track\",\"HandlerDescription\":\"SoundHandle\",\"Balance\":0,\"AudioFormat\":\"mp4a\",\"AudioChannels\":2,\"AudioBitsPerSample\":16,\"AudioSampleRate\":48000,\"MovieDataSize\":17728938,\"MovieDataOffset\":810282,\"AvgBitrate\":\"19.7 Mbps\",\"ImageSize\":\"1920x1080\",\"Megapixels\":2.1,\"Rotation\":90}";
    this.duration = "7.19 s";
    this.screenshot = "general_1523891808_8789.jpg";
    this.screenshotBigUrl ="https://videovm9.mybabysdays.com:443/video/j3.drib.tk/screen_path/2018/02/general_1523891808_8789_big.jpg";
    this.video = "{\"mp4\":\"general_1523891808_8789.mp4\",\"ogv\":\"general_1523891808_8789.ogv\",\"webm\":\"general_1523891808_8789.webm\"}";
    this.sendClient = hTTPORIGIN;
  }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(int size) {
        this.size = size;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("dateuploaded")
    public String getDateuploaded() {
        return dateuploaded;
    }

    @JsonProperty("dateuploaded")
    public void setDateuploaded(String dateuploaded) {
        this.dateuploaded = dateuploaded;
    }

    @JsonProperty("videodesc")
    public String getVideodesc() {
        return videodesc;
    }

    @JsonProperty("videodesc")
    public void setVideodesc(String videodesc) {
        this.videodesc = videodesc;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("option")
    public String getOption() {
        return option;
    }

    @JsonProperty("option")
    public void setOption(String option) {
        this.option = option;
    }

    @JsonProperty("controller")
    public String getController() {
        return controller;
    }

    @JsonProperty("controller")
    public void setController(String controller) {
        this.controller = controller;
    }

    @JsonProperty("task")
    public String getTask() {
        return task;
    }

    @JsonProperty("task")
    public void setTask(String task) {
        this.task = task;
    }

    @JsonProperty("gallery_type")
    public String getGalleryType() {
        return galleryType;
    }

    @JsonProperty("gallery_type")
    public void setGalleryType(String galleryType) {
        this.galleryType = galleryType;
    }

    @JsonProperty("chid")
    public String getChid() {
        return chid;
    }

    @JsonProperty("chid")
    public void setChid(String chid) {
        this.chid = chid;
    }

    @JsonProperty("queueName")
    public String getQueueName() {
        return queueName;
    }

    @JsonProperty("queueName")
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    @JsonProperty("queueCount")
    public String getQueueCount() {
        return queueCount;
    }

    @JsonProperty("queueCount")
    public void setQueueCount(String queueCount) {
        this.queueCount = queueCount;
    }

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("HTTP_ORIGIN")
    public String getHTTPORIGIN() {
        return hTTPORIGIN;
    }

    @JsonProperty("HTTP_ORIGIN")
    public void setHTTPORIGIN(String hTTPORIGIN) {
        this.hTTPORIGIN = hTTPORIGIN;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("deleteUrl")
    public String getDeleteUrl() {
        return deleteUrl;
    }

    @JsonProperty("deleteUrl")
    public void setDeleteUrl(String deleteUrl) {
        this.deleteUrl = deleteUrl;
    }

    @JsonProperty("updateUrl")
    public String getUpdateUrl() {
        return updateUrl;
    }

    @JsonProperty("updateUrl")
    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    @JsonProperty("optionsUrl")
    public String getOptionsUrl() {
        return optionsUrl;
    }

    @JsonProperty("optionsUrl")
    public void setOptionsUrl(String optionsUrl) {
        this.optionsUrl = optionsUrl;
    }

    @JsonProperty("deleteType")
    public String getDeleteType() {
        return deleteType;
    }

    @JsonProperty("deleteType")
    public void setDeleteType(String deleteType) {
        this.deleteType = deleteType;
    }

    @JsonProperty("max_size_html")
    public String getMaxSizeHtml() {
        return maxSizeHtml;
    }

    @JsonProperty("max_size_html")
    public void setMaxSizeHtml(String maxSizeHtml) {
        this.maxSizeHtml = maxSizeHtml;
    }

    @JsonProperty("max_size")
    public int getMaxSize() {
        return maxSize;
    }

    @JsonProperty("max_size")
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @JsonProperty("parseSize")
    public String getParseSize() {
        return parseSize;
    }

    @JsonProperty("parseSize")
    public void setParseSize(String parseSize) {
        this.parseSize = parseSize;
    }

    @JsonProperty("post_max_size_bytes")
    public int getPostMaxSizeBytes() {
        return postMaxSizeBytes;
    }

    @JsonProperty("post_max_size_bytes")
    public void setPostMaxSizeBytes(int postMaxSizeBytes) {
        this.postMaxSizeBytes = postMaxSizeBytes;
    }

    @JsonProperty("post_max_size_html")
    public String getPostMaxSizeHtml() {
        return postMaxSizeHtml;
    }

    @JsonProperty("post_max_size_html")
    public void setPostMaxSizeHtml(String postMaxSizeHtml) {
        this.postMaxSizeHtml = postMaxSizeHtml;
    }

    @JsonProperty("available_size_html")
    public String getAvailableSizeHtml() {
        return availableSizeHtml;
    }

    @JsonProperty("available_size_html")
    public void setAvailableSizeHtml(String availableSizeHtml) {
        this.availableSizeHtml = availableSizeHtml;
    }

    @JsonProperty("total_size_html")
    public String getTotalSizeHtml() {
        return totalSizeHtml;
    }

    @JsonProperty("total_size_html")
    public void setTotalSizeHtml(String totalSizeHtml) {
        this.totalSizeHtml = totalSizeHtml;
    }

    @JsonProperty("max_duration_video")
    public String getMaxDurationVideo() {
        return maxDurationVideo;
    }

    @JsonProperty("max_duration_video")
    public void setMaxDurationVideo(String maxDurationVideo) {
        this.maxDurationVideo = maxDurationVideo;
    }

    @JsonProperty("max_duration_video_parse")
    public String getMaxDurationVideoParse() {
        return maxDurationVideoParse;
    }

    @JsonProperty("max_duration_video_parse")
    public void setMaxDurationVideoParse(String maxDurationVideoParse) {
        this.maxDurationVideoParse = maxDurationVideoParse;
    }

    @JsonProperty("logs")
    public String getLogs() {
        return logs;
    }

    @JsonProperty("logs")
    public void setLogs(String logs) {
        this.logs = logs;
    }

    @JsonProperty("video_info")
    public String getVideoInfo() {
        return videoInfo;
    }

    @JsonProperty("video_info")
    public void setVideoInfo(String videoInfo) {
        this.videoInfo = videoInfo;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("screenshot")
    public String getScreenshot() {
        return screenshot;
    }

    @JsonProperty("screenshot")
    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    @JsonProperty("screenshot_big_url")
    public String getScreenshotBigUrl() {
        return screenshotBigUrl;
    }

    @JsonProperty("screenshot_big_url")
    public void setScreenshotBigUrl(String screenshotBigUrl) {
        this.screenshotBigUrl = screenshotBigUrl;
    }

    @JsonProperty("output_avi")
    public String getOutputAvi() {
        return outputAvi;
    }

    @JsonProperty("output_avi")
    public void setOutputAvi(String outputAvi) {
        this.outputAvi = outputAvi;
    }

    @JsonProperty("exec_video")
    public String getExecVideo() {
        return execVideo;
    }

    @JsonProperty("exec_video")
    public void setExecVideo(String execVideo) {
        this.execVideo = execVideo;
    }

    @JsonProperty("video")
    public String getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(String video) {
        this.video = video;
    }

    @JsonProperty("send_client")
    public String getSendClient() {
        return sendClient;
    }

    @JsonProperty("send_client")
    public void setSendClient(String sendClient) {
        this.sendClient = sendClient;
    }

    @JsonProperty("key_Token")
    public String getKeyToken() {
        return keyToken;
    }

    @JsonProperty("key_Token")
    public void setKeyToken(String keyToken) {
        this.keyToken = keyToken;
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
        return new ToStringBuilder(this).append("name", name).append("size", size).append("type", type).append("dateuploaded", dateuploaded).append("videodesc", videodesc).append("title", title).append("option", option).append("controller", controller).append("task", task).append("galleryType", galleryType).append("chid", chid).append("queueName", queueName).append("queueCount", queueCount).append("accessToken", accessToken).append("hTTPORIGIN", hTTPORIGIN).append("date", date).append("id", id).append("deleteUrl", deleteUrl).append("updateUrl", updateUrl).append("optionsUrl", optionsUrl).append("deleteType", deleteType).append("maxSizeHtml", maxSizeHtml).append("maxSize", maxSize).append("parseSize", parseSize).append("postMaxSizeBytes", postMaxSizeBytes).append("postMaxSizeHtml", postMaxSizeHtml).append("availableSizeHtml", availableSizeHtml).append("totalSizeHtml", totalSizeHtml).append("maxDurationVideo", maxDurationVideo).append("maxDurationVideoParse", maxDurationVideoParse).append("logs", logs).append("videoInfo", videoInfo).append("duration", duration).append("screenshot", screenshot).append("screenshotBigUrl", screenshotBigUrl).append("outputAvi", outputAvi).append("execVideo", execVideo).append("video", video).append("sendClient", sendClient).append("keyToken", keyToken).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(postMaxSizeHtml).append(optionsUrl).append(accessToken).append(outputAvi).append(maxDurationVideo).append(videoInfo).append(deleteUrl).append(date).append(type).append(maxSizeHtml).append(dateuploaded).append(id).append(title).append(name).append(queueName).append(screenshotBigUrl).append(keyToken).append(totalSizeHtml).append(video).append(maxSize).append(option).append(execVideo).append(hTTPORIGIN).append(screenshot).append(updateUrl).append(logs).append(task).append(queueCount).append(galleryType).append(chid).append(postMaxSizeBytes).append(maxDurationVideoParse).append(availableSizeHtml).append(videodesc).append(deleteType).append(size).append(duration).append(additionalProperties).append(parseSize).append(sendClient).append(controller).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestVideoServer) == false) {
            return false;
        }
        RequestVideoServer rhs = ((RequestVideoServer) other);
        return new EqualsBuilder().append(postMaxSizeHtml, rhs.postMaxSizeHtml).append(optionsUrl, rhs.optionsUrl).append(accessToken, rhs.accessToken).append(outputAvi, rhs.outputAvi).append(maxDurationVideo, rhs.maxDurationVideo).append(videoInfo, rhs.videoInfo).append(deleteUrl, rhs.deleteUrl).append(date, rhs.date).append(type, rhs.type).append(maxSizeHtml, rhs.maxSizeHtml).append(dateuploaded, rhs.dateuploaded).append(id, rhs.id).append(title, rhs.title).append(name, rhs.name).append(queueName, rhs.queueName).append(screenshotBigUrl, rhs.screenshotBigUrl).append(keyToken, rhs.keyToken).append(totalSizeHtml, rhs.totalSizeHtml).append(video, rhs.video).append(maxSize, rhs.maxSize).append(option, rhs.option).append(execVideo, rhs.execVideo).append(hTTPORIGIN, rhs.hTTPORIGIN).append(screenshot, rhs.screenshot).append(updateUrl, rhs.updateUrl).append(logs, rhs.logs).append(task, rhs.task).append(queueCount, rhs.queueCount).append(galleryType, rhs.galleryType).append(chid, rhs.chid).append(postMaxSizeBytes, rhs.postMaxSizeBytes).append(maxDurationVideoParse, rhs.maxDurationVideoParse).append(availableSizeHtml, rhs.availableSizeHtml).append(videodesc, rhs.videodesc).append(deleteType, rhs.deleteType).append(size, rhs.size).append(duration, rhs.duration).append(additionalProperties, rhs.additionalProperties).append(parseSize, rhs.parseSize).append(sendClient, rhs.sendClient).append(controller, rhs.controller).isEquals();
    }



}
