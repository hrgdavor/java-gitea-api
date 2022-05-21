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
import io.gitea.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * PullReviewComment represents a comment on a pull request review
 */
@ApiModel(description = "PullReviewComment represents a comment on a pull request review")

public class PullReviewComment {
  @SerializedName("body")
  private String body = null;

  @SerializedName("commit_id")
  private String commitId = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("diff_hunk")
  private String diffHunk = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("original_commit_id")
  private String originalCommitId = null;

  @SerializedName("original_position")
  private Integer originalPosition = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("pull_request_review_id")
  private Long pullRequestReviewId = null;

  @SerializedName("pull_request_url")
  private String pullRequestUrl = null;

  @SerializedName("resolver")
  private User resolver = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("user")
  private User user = null;

  public PullReviewComment body(String body) {
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

  public PullReviewComment commitId(String commitId) {
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

  public PullReviewComment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PullReviewComment diffHunk(String diffHunk) {
    this.diffHunk = diffHunk;
    return this;
  }

   /**
   * Get diffHunk
   * @return diffHunk
  **/
  @ApiModelProperty(value = "")
  public String getDiffHunk() {
    return diffHunk;
  }

  public void setDiffHunk(String diffHunk) {
    this.diffHunk = diffHunk;
  }

  public PullReviewComment htmlUrl(String htmlUrl) {
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

  public PullReviewComment id(Long id) {
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

  public PullReviewComment originalCommitId(String originalCommitId) {
    this.originalCommitId = originalCommitId;
    return this;
  }

   /**
   * Get originalCommitId
   * @return originalCommitId
  **/
  @ApiModelProperty(value = "")
  public String getOriginalCommitId() {
    return originalCommitId;
  }

  public void setOriginalCommitId(String originalCommitId) {
    this.originalCommitId = originalCommitId;
  }

  public PullReviewComment originalPosition(Integer originalPosition) {
    this.originalPosition = originalPosition;
    return this;
  }

   /**
   * Get originalPosition
   * @return originalPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getOriginalPosition() {
    return originalPosition;
  }

  public void setOriginalPosition(Integer originalPosition) {
    this.originalPosition = originalPosition;
  }

  public PullReviewComment path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PullReviewComment position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public PullReviewComment pullRequestReviewId(Long pullRequestReviewId) {
    this.pullRequestReviewId = pullRequestReviewId;
    return this;
  }

   /**
   * Get pullRequestReviewId
   * @return pullRequestReviewId
  **/
  @ApiModelProperty(value = "")
  public Long getPullRequestReviewId() {
    return pullRequestReviewId;
  }

  public void setPullRequestReviewId(Long pullRequestReviewId) {
    this.pullRequestReviewId = pullRequestReviewId;
  }

  public PullReviewComment pullRequestUrl(String pullRequestUrl) {
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

  public PullReviewComment resolver(User resolver) {
    this.resolver = resolver;
    return this;
  }

   /**
   * Get resolver
   * @return resolver
  **/
  @ApiModelProperty(value = "")
  public User getResolver() {
    return resolver;
  }

  public void setResolver(User resolver) {
    this.resolver = resolver;
  }

  public PullReviewComment updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PullReviewComment user(User user) {
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
    PullReviewComment pullReviewComment = (PullReviewComment) o;
    return Objects.equals(this.body, pullReviewComment.body) &&
        Objects.equals(this.commitId, pullReviewComment.commitId) &&
        Objects.equals(this.createdAt, pullReviewComment.createdAt) &&
        Objects.equals(this.diffHunk, pullReviewComment.diffHunk) &&
        Objects.equals(this.htmlUrl, pullReviewComment.htmlUrl) &&
        Objects.equals(this.id, pullReviewComment.id) &&
        Objects.equals(this.originalCommitId, pullReviewComment.originalCommitId) &&
        Objects.equals(this.originalPosition, pullReviewComment.originalPosition) &&
        Objects.equals(this.path, pullReviewComment.path) &&
        Objects.equals(this.position, pullReviewComment.position) &&
        Objects.equals(this.pullRequestReviewId, pullReviewComment.pullRequestReviewId) &&
        Objects.equals(this.pullRequestUrl, pullReviewComment.pullRequestUrl) &&
        Objects.equals(this.resolver, pullReviewComment.resolver) &&
        Objects.equals(this.updatedAt, pullReviewComment.updatedAt) &&
        Objects.equals(this.user, pullReviewComment.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, commitId, createdAt, diffHunk, htmlUrl, id, originalCommitId, originalPosition, path, position, pullRequestReviewId, pullRequestUrl, resolver, updatedAt, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullReviewComment {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    diffHunk: ").append(toIndentedString(diffHunk)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalCommitId: ").append(toIndentedString(originalCommitId)).append("\n");
    sb.append("    originalPosition: ").append(toIndentedString(originalPosition)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    pullRequestReviewId: ").append(toIndentedString(pullRequestReviewId)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    resolver: ").append(toIndentedString(resolver)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

