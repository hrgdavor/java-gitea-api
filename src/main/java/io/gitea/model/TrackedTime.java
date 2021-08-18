/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.16.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gitea.model.Issue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * TrackedTime worked time for an issue / pr
 */
@ApiModel(description = "TrackedTime worked time for an issue / pr")

public class TrackedTime {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issue")
  private Issue issue = null;

  @SerializedName("issue_id")
  private Long issueId = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("user_name")
  private String userName = null;

  public TrackedTime created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public TrackedTime id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TrackedTime issue(Issue issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @ApiModelProperty(value = "")
  public Issue getIssue() {
    return issue;
  }

  public void setIssue(Issue issue) {
    this.issue = issue;
  }

  public TrackedTime issueId(Long issueId) {
    this.issueId = issueId;
    return this;
  }

   /**
   * deprecated (only for backwards compatibility)
   * @return issueId
  **/
  @ApiModelProperty(value = "deprecated (only for backwards compatibility)")
  public Long getIssueId() {
    return issueId;
  }

  public void setIssueId(Long issueId) {
    this.issueId = issueId;
  }

  public TrackedTime time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Time in seconds
   * @return time
  **/
  @ApiModelProperty(value = "Time in seconds")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public TrackedTime userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * deprecated (only for backwards compatibility)
   * @return userId
  **/
  @ApiModelProperty(value = "deprecated (only for backwards compatibility)")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public TrackedTime userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedTime trackedTime = (TrackedTime) o;
    return Objects.equals(this.created, trackedTime.created) &&
        Objects.equals(this.id, trackedTime.id) &&
        Objects.equals(this.issue, trackedTime.issue) &&
        Objects.equals(this.issueId, trackedTime.issueId) &&
        Objects.equals(this.time, trackedTime.time) &&
        Objects.equals(this.userId, trackedTime.userId) &&
        Objects.equals(this.userName, trackedTime.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, issue, issueId, time, userId, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedTime {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

