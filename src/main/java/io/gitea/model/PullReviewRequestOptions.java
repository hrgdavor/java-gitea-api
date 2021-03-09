/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.14.0&#43;dev-803-gf1da46622
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
 * PullReviewRequestOptions are options to add or remove pull review requests
 */
@ApiModel(description = "PullReviewRequestOptions are options to add or remove pull review requests")

public class PullReviewRequestOptions {
  @SerializedName("reviewers")
  private List<String> reviewers = null;

  @SerializedName("team_reviewers")
  private List<String> teamReviewers = null;

  public PullReviewRequestOptions reviewers(List<String> reviewers) {
    this.reviewers = reviewers;
    return this;
  }

  public PullReviewRequestOptions addReviewersItem(String reviewersItem) {
    if (this.reviewers == null) {
      this.reviewers = new ArrayList<String>();
    }
    this.reviewers.add(reviewersItem);
    return this;
  }

   /**
   * Get reviewers
   * @return reviewers
  **/
  @ApiModelProperty(value = "")
  public List<String> getReviewers() {
    return reviewers;
  }

  public void setReviewers(List<String> reviewers) {
    this.reviewers = reviewers;
  }

  public PullReviewRequestOptions teamReviewers(List<String> teamReviewers) {
    this.teamReviewers = teamReviewers;
    return this;
  }

  public PullReviewRequestOptions addTeamReviewersItem(String teamReviewersItem) {
    if (this.teamReviewers == null) {
      this.teamReviewers = new ArrayList<String>();
    }
    this.teamReviewers.add(teamReviewersItem);
    return this;
  }

   /**
   * Get teamReviewers
   * @return teamReviewers
  **/
  @ApiModelProperty(value = "")
  public List<String> getTeamReviewers() {
    return teamReviewers;
  }

  public void setTeamReviewers(List<String> teamReviewers) {
    this.teamReviewers = teamReviewers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullReviewRequestOptions pullReviewRequestOptions = (PullReviewRequestOptions) o;
    return Objects.equals(this.reviewers, pullReviewRequestOptions.reviewers) &&
        Objects.equals(this.teamReviewers, pullReviewRequestOptions.teamReviewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewers, teamReviewers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullReviewRequestOptions {\n");
    
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    teamReviewers: ").append(toIndentedString(teamReviewers)).append("\n");
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

