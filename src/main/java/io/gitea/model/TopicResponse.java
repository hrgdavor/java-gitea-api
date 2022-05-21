/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.16.8
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * TopicResponse for returning topics
 */
@ApiModel(description = "TopicResponse for returning topics")

public class TopicResponse {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("repo_count")
  private Long repoCount = null;

  @SerializedName("topic_name")
  private String topicName = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  public TopicResponse created(OffsetDateTime created) {
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

  public TopicResponse id(Long id) {
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

  public TopicResponse repoCount(Long repoCount) {
    this.repoCount = repoCount;
    return this;
  }

   /**
   * Get repoCount
   * @return repoCount
  **/
  @ApiModelProperty(value = "")
  public Long getRepoCount() {
    return repoCount;
  }

  public void setRepoCount(Long repoCount) {
    this.repoCount = repoCount;
  }

  public TopicResponse topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @ApiModelProperty(value = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public TopicResponse updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicResponse topicResponse = (TopicResponse) o;
    return Objects.equals(this.created, topicResponse.created) &&
        Objects.equals(this.id, topicResponse.id) &&
        Objects.equals(this.repoCount, topicResponse.repoCount) &&
        Objects.equals(this.topicName, topicResponse.topicName) &&
        Objects.equals(this.updated, topicResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, repoCount, topicName, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repoCount: ").append(toIndentedString(repoCount)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

