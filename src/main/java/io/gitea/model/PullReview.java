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
import io.gitea.model.Team;
import io.gitea.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * PullReview represents a pull request review
 */
@ApiModel(description = "PullReview represents a pull request review")

public class PullReview {
  @SerializedName("body")
  private String body = null;

  @SerializedName("comments_count")
  private Long commentsCount = null;

  @SerializedName("commit_id")
  private String commitId = null;

  @SerializedName("dismissed")
  private Boolean dismissed = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("official")
  private Boolean official = null;

  @SerializedName("pull_request_url")
  private String pullRequestUrl = null;

  @SerializedName("stale")
  private Boolean stale = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("submitted_at")
  private OffsetDateTime submittedAt = null;

  @SerializedName("team")
  private Team team = null;

  @SerializedName("user")
  private User user = null;

  public PullReview body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public PullReview commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

   /**
   * Get commentsCount
   * @return commentsCount
  **/
  @ApiModelProperty(value = "")
  public Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public PullReview commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @ApiModelProperty(value = "")
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  public PullReview dismissed(Boolean dismissed) {
    this.dismissed = dismissed;
    return this;
  }

   /**
   * Get dismissed
   * @return dismissed
  **/
  @ApiModelProperty(value = "")
  public Boolean isDismissed() {
    return dismissed;
  }

  public void setDismissed(Boolean dismissed) {
    this.dismissed = dismissed;
  }

  public PullReview htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @ApiModelProperty(value = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public PullReview id(Long id) {
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

  public PullReview official(Boolean official) {
    this.official = official;
    return this;
  }

   /**
   * Get official
   * @return official
  **/
  @ApiModelProperty(value = "")
  public Boolean isOfficial() {
    return official;
  }

  public void setOfficial(Boolean official) {
    this.official = official;
  }

  public PullReview pullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

   /**
   * Get pullRequestUrl
   * @return pullRequestUrl
  **/
  @ApiModelProperty(value = "")
  public String getPullRequestUrl() {
    return pullRequestUrl;
  }

  public void setPullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }

  public PullReview stale(Boolean stale) {
    this.stale = stale;
    return this;
  }

   /**
   * Get stale
   * @return stale
  **/
  @ApiModelProperty(value = "")
  public Boolean isStale() {
    return stale;
  }

  public void setStale(Boolean stale) {
    this.stale = stale;
  }

  public PullReview state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PullReview submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }

  public PullReview team(Team team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @ApiModelProperty(value = "")
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public PullReview user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullReview pullReview = (PullReview) o;
    return Objects.equals(this.body, pullReview.body) &&
        Objects.equals(this.commentsCount, pullReview.commentsCount) &&
        Objects.equals(this.commitId, pullReview.commitId) &&
        Objects.equals(this.dismissed, pullReview.dismissed) &&
        Objects.equals(this.htmlUrl, pullReview.htmlUrl) &&
        Objects.equals(this.id, pullReview.id) &&
        Objects.equals(this.official, pullReview.official) &&
        Objects.equals(this.pullRequestUrl, pullReview.pullRequestUrl) &&
        Objects.equals(this.stale, pullReview.stale) &&
        Objects.equals(this.state, pullReview.state) &&
        Objects.equals(this.submittedAt, pullReview.submittedAt) &&
        Objects.equals(this.team, pullReview.team) &&
        Objects.equals(this.user, pullReview.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, commentsCount, commitId, dismissed, htmlUrl, id, official, pullRequestUrl, stale, state, submittedAt, team, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullReview {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    dismissed: ").append(toIndentedString(dismissed)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    official: ").append(toIndentedString(official)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    stale: ").append(toIndentedString(stale)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

