/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gitea.model.Permission;
import io.gitea.model.Repository;
import io.gitea.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Repository represents a repository
 */
@ApiModel(description = "Repository represents a repository")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-20T18:39:27.321+01:00")
public class Repository {
  @SerializedName("clone_url")
  private String cloneUrl = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("default_branch")
  private String defaultBranch = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("empty")
  private Boolean empty = null;

  @SerializedName("fork")
  private Boolean fork = null;

  @SerializedName("forks_count")
  private Long forksCount = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mirror")
  private Boolean mirror = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("open_issues_count")
  private Long openIssuesCount = null;

  @SerializedName("owner")
  private User owner = null;

  @SerializedName("parent")
  private Repository parent = null;

  @SerializedName("permissions")
  private Permission permissions = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("ssh_url")
  private String sshUrl = null;

  @SerializedName("stars_count")
  private Long starsCount = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("watchers_count")
  private Long watchersCount = null;

  @SerializedName("website")
  private String website = null;

  public Repository cloneUrl(String cloneUrl) {
    this.cloneUrl = cloneUrl;
    return this;
  }

   /**
   * Get cloneUrl
   * @return cloneUrl
  **/
  @ApiModelProperty(value = "")
  public String getCloneUrl() {
    return cloneUrl;
  }

  public void setCloneUrl(String cloneUrl) {
    this.cloneUrl = cloneUrl;
  }

  public Repository createdAt(OffsetDateTime createdAt) {
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

  public Repository defaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * Get defaultBranch
   * @return defaultBranch
  **/
  @ApiModelProperty(value = "")
  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public Repository description(String description) {
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

  public Repository empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @ApiModelProperty(value = "")
  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public Repository fork(Boolean fork) {
    this.fork = fork;
    return this;
  }

   /**
   * Get fork
   * @return fork
  **/
  @ApiModelProperty(value = "")
  public Boolean isFork() {
    return fork;
  }

  public void setFork(Boolean fork) {
    this.fork = fork;
  }

  public Repository forksCount(Long forksCount) {
    this.forksCount = forksCount;
    return this;
  }

   /**
   * Get forksCount
   * @return forksCount
  **/
  @ApiModelProperty(value = "")
  public Long getForksCount() {
    return forksCount;
  }

  public void setForksCount(Long forksCount) {
    this.forksCount = forksCount;
  }

  public Repository fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Repository htmlUrl(String htmlUrl) {
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

  public Repository id(Long id) {
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

  public Repository mirror(Boolean mirror) {
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

  public Repository name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Repository openIssuesCount(Long openIssuesCount) {
    this.openIssuesCount = openIssuesCount;
    return this;
  }

   /**
   * Get openIssuesCount
   * @return openIssuesCount
  **/
  @ApiModelProperty(value = "")
  public Long getOpenIssuesCount() {
    return openIssuesCount;
  }

  public void setOpenIssuesCount(Long openIssuesCount) {
    this.openIssuesCount = openIssuesCount;
  }

  public Repository owner(User owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public Repository parent(Repository parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Repository getParent() {
    return parent;
  }

  public void setParent(Repository parent) {
    this.parent = parent;
  }

  public Repository permissions(Permission permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public Permission getPermissions() {
    return permissions;
  }

  public void setPermissions(Permission permissions) {
    this.permissions = permissions;
  }

  public Repository _private(Boolean _private) {
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

  public Repository size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Repository sshUrl(String sshUrl) {
    this.sshUrl = sshUrl;
    return this;
  }

   /**
   * Get sshUrl
   * @return sshUrl
  **/
  @ApiModelProperty(value = "")
  public String getSshUrl() {
    return sshUrl;
  }

  public void setSshUrl(String sshUrl) {
    this.sshUrl = sshUrl;
  }

  public Repository starsCount(Long starsCount) {
    this.starsCount = starsCount;
    return this;
  }

   /**
   * Get starsCount
   * @return starsCount
  **/
  @ApiModelProperty(value = "")
  public Long getStarsCount() {
    return starsCount;
  }

  public void setStarsCount(Long starsCount) {
    this.starsCount = starsCount;
  }

  public Repository updatedAt(OffsetDateTime updatedAt) {
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

  public Repository watchersCount(Long watchersCount) {
    this.watchersCount = watchersCount;
    return this;
  }

   /**
   * Get watchersCount
   * @return watchersCount
  **/
  @ApiModelProperty(value = "")
  public Long getWatchersCount() {
    return watchersCount;
  }

  public void setWatchersCount(Long watchersCount) {
    this.watchersCount = watchersCount;
  }

  public Repository website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.cloneUrl, repository.cloneUrl) &&
        Objects.equals(this.createdAt, repository.createdAt) &&
        Objects.equals(this.defaultBranch, repository.defaultBranch) &&
        Objects.equals(this.description, repository.description) &&
        Objects.equals(this.empty, repository.empty) &&
        Objects.equals(this.fork, repository.fork) &&
        Objects.equals(this.forksCount, repository.forksCount) &&
        Objects.equals(this.fullName, repository.fullName) &&
        Objects.equals(this.htmlUrl, repository.htmlUrl) &&
        Objects.equals(this.id, repository.id) &&
        Objects.equals(this.mirror, repository.mirror) &&
        Objects.equals(this.name, repository.name) &&
        Objects.equals(this.openIssuesCount, repository.openIssuesCount) &&
        Objects.equals(this.owner, repository.owner) &&
        Objects.equals(this.parent, repository.parent) &&
        Objects.equals(this.permissions, repository.permissions) &&
        Objects.equals(this._private, repository._private) &&
        Objects.equals(this.size, repository.size) &&
        Objects.equals(this.sshUrl, repository.sshUrl) &&
        Objects.equals(this.starsCount, repository.starsCount) &&
        Objects.equals(this.updatedAt, repository.updatedAt) &&
        Objects.equals(this.watchersCount, repository.watchersCount) &&
        Objects.equals(this.website, repository.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneUrl, createdAt, defaultBranch, description, empty, fork, forksCount, fullName, htmlUrl, id, mirror, name, openIssuesCount, owner, parent, permissions, _private, size, sshUrl, starsCount, updatedAt, watchersCount, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    
    sb.append("    cloneUrl: ").append(toIndentedString(cloneUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
    sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openIssuesCount: ").append(toIndentedString(openIssuesCount)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
    sb.append("    starsCount: ").append(toIndentedString(starsCount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    watchersCount: ").append(toIndentedString(watchersCount)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

