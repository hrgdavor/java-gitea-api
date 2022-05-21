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
import java.util.ArrayList;
import java.util.List;

/**
 * RepoTopicOptions a collection of repo topic names
 */
@ApiModel(description = "RepoTopicOptions a collection of repo topic names")

public class RepoTopicOptions {
  @SerializedName("topics")
  private List<String> topics = null;

  public RepoTopicOptions topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public RepoTopicOptions addTopicsItem(String topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<String>();
    }
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * list of topic names
   * @return topics
  **/
  @ApiModelProperty(value = "list of topic names")
  public List<String> getTopics() {
    return topics;
  }

  public void setTopics(List<String> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoTopicOptions repoTopicOptions = (RepoTopicOptions) o;
    return Objects.equals(this.topics, repoTopicOptions.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoTopicOptions {\n");
    
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

