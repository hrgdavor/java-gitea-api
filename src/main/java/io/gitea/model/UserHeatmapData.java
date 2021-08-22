/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.15.0
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

/**
 * UserHeatmapData represents the data needed to create a heatmap
 */
@ApiModel(description = "UserHeatmapData represents the data needed to create a heatmap")

public class UserHeatmapData {
  @SerializedName("contributions")
  private Long contributions = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  public UserHeatmapData contributions(Long contributions) {
    this.contributions = contributions;
    return this;
  }

   /**
   * Get contributions
   * @return contributions
  **/
  @ApiModelProperty(value = "")
  public Long getContributions() {
    return contributions;
  }

  public void setContributions(Long contributions) {
    this.contributions = contributions;
  }

  public UserHeatmapData timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserHeatmapData userHeatmapData = (UserHeatmapData) o;
    return Objects.equals(this.contributions, userHeatmapData.contributions) &&
        Objects.equals(this.timestamp, userHeatmapData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributions, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserHeatmapData {\n");
    
    sb.append("    contributions: ").append(toIndentedString(contributions)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

