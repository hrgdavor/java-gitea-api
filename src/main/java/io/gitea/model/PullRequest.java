/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.15.0-rc2
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
import io.gitea.model.Label;
import io.gitea.model.Milestone;
import io.gitea.model.PRBranchInfo;
import io.gitea.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * PullRequest represents a pull request
 */
@ApiModel(description = "PullRequest represents a pull request")

public class PullRequest {
  @SerializedName("assignee")
  private User assignee = null;

  @SerializedName("assignees")
  private List<User> assignees = null;

  @SerializedName("base")
  private PRBranchInfo base = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("closed_at")
  private OffsetDateTime closedAt = null;

  @SerializedName("comments")
  private Long comments = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("diff_url")
  private String diffUrl = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("head")
  private PRBranchInfo head = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("is_locked")
  private Boolean isLocked = null;

  @SerializedName("labels")
  private List<Label> labels = null;

  @SerializedName("merge_base")
  private String mergeBase = null;

  @SerializedName("merge_commit_sha")
  private String mergeCommitSha = null;

  @SerializedName("mergeable")
  private Boolean mergeable = null;

  @SerializedName("merged")
  private Boolean merged = null;

  @SerializedName("merged_at")
  private OffsetDateTime mergedAt = null;

  @SerializedName("merged_by")
  private User mergedBy = null;

  @SerializedName("milestone")
  private Milestone milestone = null;

  @SerializedName("number")
  private Long number = null;

  @SerializedName("patch_url")
  private String patchUrl = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("user")
  private User user = null;

  public PullRequest assignee(User assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")
  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }

  public PullRequest assignees(List<User> assignees) {
    this.assignees = assignees;
    return this;
  }

  public PullRequest addAssigneesItem(User assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<User>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @ApiModelProperty(value = "")
  public List<User> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<User> assignees) {
    this.assignees = assignees;
  }

  public PullRequest base(PRBranchInfo base) {
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @ApiModelProperty(value = "")
  public PRBranchInfo getBase() {
    return base;
  }

  public void setBase(PRBranchInfo base) {
    this.base = base;
  }

  public PullRequest body(String body) {
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

  public PullRequest closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Get closedAt
   * @return closedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  public PullRequest comments(Long comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public Long getComments() {
    return comments;
  }

  public void setComments(Long comments) {
    this.comments = comments;
  }

  public PullRequest createdAt(OffsetDateTime createdAt) {
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

  public PullRequest diffUrl(String diffUrl) {
    this.diffUrl = diffUrl;
    return this;
  }

   /**
   * Get diffUrl
   * @return diffUrl
  **/
  @ApiModelProperty(value = "")
  public String getDiffUrl() {
    return diffUrl;
  }

  public void setDiffUrl(String diffUrl) {
    this.diffUrl = diffUrl;
  }

  public PullRequest dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public PullRequest head(PRBranchInfo head) {
    this.head = head;
    return this;
  }

   /**
   * Get head
   * @return head
  **/
  @ApiModelProperty(value = "")
  public PRBranchInfo getHead() {
    return head;
  }

  public void setHead(PRBranchInfo head) {
    this.head = head;
  }

  public PullRequest htmlUrl(String htmlUrl) {
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

  public PullRequest id(Long id) {
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

  public PullRequest isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public PullRequest labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public PullRequest addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Label>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public PullRequest mergeBase(String mergeBase) {
    this.mergeBase = mergeBase;
    return this;
  }

   /**
   * Get mergeBase
   * @return mergeBase
  **/
  @ApiModelProperty(value = "")
  public String getMergeBase() {
    return mergeBase;
  }

  public void setMergeBase(String mergeBase) {
    this.mergeBase = mergeBase;
  }

  public PullRequest mergeCommitSha(String mergeCommitSha) {
    this.mergeCommitSha = mergeCommitSha;
    return this;
  }

   /**
   * Get mergeCommitSha
   * @return mergeCommitSha
  **/
  @ApiModelProperty(value = "")
  public String getMergeCommitSha() {
    return mergeCommitSha;
  }

  public void setMergeCommitSha(String mergeCommitSha) {
    this.mergeCommitSha = mergeCommitSha;
  }

  public PullRequest mergeable(Boolean mergeable) {
    this.mergeable = mergeable;
    return this;
  }

   /**
   * Get mergeable
   * @return mergeable
  **/
  @ApiModelProperty(value = "")
  public Boolean isMergeable() {
    return mergeable;
  }

  public void setMergeable(Boolean mergeable) {
    this.mergeable = mergeable;
  }

  public PullRequest merged(Boolean merged) {
    this.merged = merged;
    return this;
  }

   /**
   * Get merged
   * @return merged
  **/
  @ApiModelProperty(value = "")
  public Boolean isMerged() {
    return merged;
  }

  public void setMerged(Boolean merged) {
    this.merged = merged;
  }

  public PullRequest mergedAt(OffsetDateTime mergedAt) {
    this.mergedAt = mergedAt;
    return this;
  }

   /**
   * Get mergedAt
   * @return mergedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getMergedAt() {
    return mergedAt;
  }

  public void setMergedAt(OffsetDateTime mergedAt) {
    this.mergedAt = mergedAt;
  }

  public PullRequest mergedBy(User mergedBy) {
    this.mergedBy = mergedBy;
    return this;
  }

   /**
   * Get mergedBy
   * @return mergedBy
  **/
  @ApiModelProperty(value = "")
  public User getMergedBy() {
    return mergedBy;
  }

  public void setMergedBy(User mergedBy) {
    this.mergedBy = mergedBy;
  }

  public PullRequest milestone(Milestone milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @ApiModelProperty(value = "")
  public Milestone getMilestone() {
    return milestone;
  }

  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }

  public PullRequest number(Long number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public PullRequest patchUrl(String patchUrl) {
    this.patchUrl = patchUrl;
    return this;
  }

   /**
   * Get patchUrl
   * @return patchUrl
  **/
  @ApiModelProperty(value = "")
  public String getPatchUrl() {
    return patchUrl;
  }

  public void setPatchUrl(String patchUrl) {
    this.patchUrl = patchUrl;
  }

  public PullRequest state(String state) {
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

  public PullRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PullRequest updatedAt(OffsetDateTime updatedAt) {
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

  public PullRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PullRequest user(User user) {
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
    PullRequest pullRequest = (PullRequest) o;
    return Objects.equals(this.assignee, pullRequest.assignee) &&
        Objects.equals(this.assignees, pullRequest.assignees) &&
        Objects.equals(this.base, pullRequest.base) &&
        Objects.equals(this.body, pullRequest.body) &&
        Objects.equals(this.closedAt, pullRequest.closedAt) &&
        Objects.equals(this.comments, pullRequest.comments) &&
        Objects.equals(this.createdAt, pullRequest.createdAt) &&
        Objects.equals(this.diffUrl, pullRequest.diffUrl) &&
        Objects.equals(this.dueDate, pullRequest.dueDate) &&
        Objects.equals(this.head, pullRequest.head) &&
        Objects.equals(this.htmlUrl, pullRequest.htmlUrl) &&
        Objects.equals(this.id, pullRequest.id) &&
        Objects.equals(this.isLocked, pullRequest.isLocked) &&
        Objects.equals(this.labels, pullRequest.labels) &&
        Objects.equals(this.mergeBase, pullRequest.mergeBase) &&
        Objects.equals(this.mergeCommitSha, pullRequest.mergeCommitSha) &&
        Objects.equals(this.mergeable, pullRequest.mergeable) &&
        Objects.equals(this.merged, pullRequest.merged) &&
        Objects.equals(this.mergedAt, pullRequest.mergedAt) &&
        Objects.equals(this.mergedBy, pullRequest.mergedBy) &&
        Objects.equals(this.milestone, pullRequest.milestone) &&
        Objects.equals(this.number, pullRequest.number) &&
        Objects.equals(this.patchUrl, pullRequest.patchUrl) &&
        Objects.equals(this.state, pullRequest.state) &&
        Objects.equals(this.title, pullRequest.title) &&
        Objects.equals(this.updatedAt, pullRequest.updatedAt) &&
        Objects.equals(this.url, pullRequest.url) &&
        Objects.equals(this.user, pullRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assignees, base, body, closedAt, comments, createdAt, diffUrl, dueDate, head, htmlUrl, id, isLocked, labels, mergeBase, mergeCommitSha, mergeable, merged, mergedAt, mergedBy, milestone, number, patchUrl, state, title, updatedAt, url, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequest {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    diffUrl: ").append(toIndentedString(diffUrl)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mergeBase: ").append(toIndentedString(mergeBase)).append("\n");
    sb.append("    mergeCommitSha: ").append(toIndentedString(mergeCommitSha)).append("\n");
    sb.append("    mergeable: ").append(toIndentedString(mergeable)).append("\n");
    sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
    sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
    sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

