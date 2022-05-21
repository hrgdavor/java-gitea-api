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

/**
 * MigrateRepoForm form for migrating repository this is used to interact with web ui
 */
@ApiModel(description = "MigrateRepoForm form for migrating repository this is used to interact with web ui")

public class MigrateRepoForm {
  @SerializedName("auth_password")
  private String authPassword = null;

  @SerializedName("auth_token")
  private String authToken = null;

  @SerializedName("auth_username")
  private String authUsername = null;

  @SerializedName("clone_addr")
  private String cloneAddr = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("issues")
  private Boolean issues = null;

  @SerializedName("labels")
  private Boolean labels = null;

  @SerializedName("lfs")
  private Boolean lfs = null;

  @SerializedName("lfs_endpoint")
  private String lfsEndpoint = null;

  @SerializedName("milestones")
  private Boolean milestones = null;

  @SerializedName("mirror")
  private Boolean mirror = null;

  @SerializedName("mirror_interval")
  private String mirrorInterval = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("pull_requests")
  private Boolean pullRequests = null;

  @SerializedName("releases")
  private Boolean releases = null;

  @SerializedName("repo_name")
  private String repoName = null;

  @SerializedName("service")
  private Integer service = null;

  @SerializedName("uid")
  private Long uid = null;

  @SerializedName("wiki")
  private Boolean wiki = null;

  public MigrateRepoForm authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }

   /**
   * Get authPassword
   * @return authPassword
  **/
  @ApiModelProperty(value = "")
  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  public MigrateRepoForm authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @ApiModelProperty(value = "")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public MigrateRepoForm authUsername(String authUsername) {
    this.authUsername = authUsername;
    return this;
  }

   /**
   * Get authUsername
   * @return authUsername
  **/
  @ApiModelProperty(value = "")
  public String getAuthUsername() {
    return authUsername;
  }

  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  public MigrateRepoForm cloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
    return this;
  }

   /**
   * Get cloneAddr
   * @return cloneAddr
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCloneAddr() {
    return cloneAddr;
  }

  public void setCloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
  }

  public MigrateRepoForm description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MigrateRepoForm issues(Boolean issues) {
    this.issues = issues;
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @ApiModelProperty(value = "")
  public Boolean isIssues() {
    return issues;
  }

  public void setIssues(Boolean issues) {
    this.issues = issues;
  }

  public MigrateRepoForm labels(Boolean labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public Boolean isLabels() {
    return labels;
  }

  public void setLabels(Boolean labels) {
    this.labels = labels;
  }

  public MigrateRepoForm lfs(Boolean lfs) {
    this.lfs = lfs;
    return this;
  }

   /**
   * Get lfs
   * @return lfs
  **/
  @ApiModelProperty(value = "")
  public Boolean isLfs() {
    return lfs;
  }

  public void setLfs(Boolean lfs) {
    this.lfs = lfs;
  }

  public MigrateRepoForm lfsEndpoint(String lfsEndpoint) {
    this.lfsEndpoint = lfsEndpoint;
    return this;
  }

   /**
   * Get lfsEndpoint
   * @return lfsEndpoint
  **/
  @ApiModelProperty(value = "")
  public String getLfsEndpoint() {
    return lfsEndpoint;
  }

  public void setLfsEndpoint(String lfsEndpoint) {
    this.lfsEndpoint = lfsEndpoint;
  }

  public MigrateRepoForm milestones(Boolean milestones) {
    this.milestones = milestones;
    return this;
  }

   /**
   * Get milestones
   * @return milestones
  **/
  @ApiModelProperty(value = "")
  public Boolean isMilestones() {
    return milestones;
  }

  public void setMilestones(Boolean milestones) {
    this.milestones = milestones;
  }

  public MigrateRepoForm mirror(Boolean mirror) {
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @ApiModelProperty(value = "")
  public Boolean isMirror() {
    return mirror;
  }

  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }

  public MigrateRepoForm mirrorInterval(String mirrorInterval) {
    this.mirrorInterval = mirrorInterval;
    return this;
  }

   /**
   * Get mirrorInterval
   * @return mirrorInterval
  **/
  @ApiModelProperty(value = "")
  public String getMirrorInterval() {
    return mirrorInterval;
  }

  public void setMirrorInterval(String mirrorInterval) {
    this.mirrorInterval = mirrorInterval;
  }

  public MigrateRepoForm _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public MigrateRepoForm pullRequests(Boolean pullRequests) {
    this.pullRequests = pullRequests;
    return this;
  }

   /**
   * Get pullRequests
   * @return pullRequests
  **/
  @ApiModelProperty(value = "")
  public Boolean isPullRequests() {
    return pullRequests;
  }

  public void setPullRequests(Boolean pullRequests) {
    this.pullRequests = pullRequests;
  }

  public MigrateRepoForm releases(Boolean releases) {
    this.releases = releases;
    return this;
  }

   /**
   * Get releases
   * @return releases
  **/
  @ApiModelProperty(value = "")
  public Boolean isReleases() {
    return releases;
  }

  public void setReleases(Boolean releases) {
    this.releases = releases;
  }

  public MigrateRepoForm repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Get repoName
   * @return repoName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public MigrateRepoForm service(Integer service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(value = "")
  public Integer getService() {
    return service;
  }

  public void setService(Integer service) {
    this.service = service;
  }

  public MigrateRepoForm uid(Long uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }

  public MigrateRepoForm wiki(Boolean wiki) {
    this.wiki = wiki;
    return this;
  }

   /**
   * Get wiki
   * @return wiki
  **/
  @ApiModelProperty(value = "")
  public Boolean isWiki() {
    return wiki;
  }

  public void setWiki(Boolean wiki) {
    this.wiki = wiki;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateRepoForm migrateRepoForm = (MigrateRepoForm) o;
    return Objects.equals(this.authPassword, migrateRepoForm.authPassword) &&
        Objects.equals(this.authToken, migrateRepoForm.authToken) &&
        Objects.equals(this.authUsername, migrateRepoForm.authUsername) &&
        Objects.equals(this.cloneAddr, migrateRepoForm.cloneAddr) &&
        Objects.equals(this.description, migrateRepoForm.description) &&
        Objects.equals(this.issues, migrateRepoForm.issues) &&
        Objects.equals(this.labels, migrateRepoForm.labels) &&
        Objects.equals(this.lfs, migrateRepoForm.lfs) &&
        Objects.equals(this.lfsEndpoint, migrateRepoForm.lfsEndpoint) &&
        Objects.equals(this.milestones, migrateRepoForm.milestones) &&
        Objects.equals(this.mirror, migrateRepoForm.mirror) &&
        Objects.equals(this.mirrorInterval, migrateRepoForm.mirrorInterval) &&
        Objects.equals(this._private, migrateRepoForm._private) &&
        Objects.equals(this.pullRequests, migrateRepoForm.pullRequests) &&
        Objects.equals(this.releases, migrateRepoForm.releases) &&
        Objects.equals(this.repoName, migrateRepoForm.repoName) &&
        Objects.equals(this.service, migrateRepoForm.service) &&
        Objects.equals(this.uid, migrateRepoForm.uid) &&
        Objects.equals(this.wiki, migrateRepoForm.wiki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassword, authToken, authUsername, cloneAddr, description, issues, labels, lfs, lfsEndpoint, milestones, mirror, mirrorInterval, _private, pullRequests, releases, repoName, service, uid, wiki);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateRepoForm {\n");
    
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    cloneAddr: ").append(toIndentedString(cloneAddr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lfs: ").append(toIndentedString(lfs)).append("\n");
    sb.append("    lfsEndpoint: ").append(toIndentedString(lfsEndpoint)).append("\n");
    sb.append("    milestones: ").append(toIndentedString(milestones)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    mirrorInterval: ").append(toIndentedString(mirrorInterval)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    wiki: ").append(toIndentedString(wiki)).append("\n");
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

