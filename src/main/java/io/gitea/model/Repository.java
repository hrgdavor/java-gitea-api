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
import io.gitea.model.ExternalTracker;
import io.gitea.model.ExternalWiki;
import io.gitea.model.InternalTracker;
import io.gitea.model.Permission;
import io.gitea.model.RepoTransfer;
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

public class Repository {
  @SerializedName("allow_merge_commits")
  private Boolean allowMergeCommits = null;

  @SerializedName("allow_rebase")
  private Boolean allowRebase = null;

  @SerializedName("allow_rebase_explicit")
  private Boolean allowRebaseExplicit = null;

  @SerializedName("allow_squash_merge")
  private Boolean allowSquashMerge = null;

  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("clone_url")
  private String cloneUrl = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("default_branch")
  private String defaultBranch = null;

  @SerializedName("default_merge_style")
  private String defaultMergeStyle = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("empty")
  private Boolean empty = null;

  @SerializedName("external_tracker")
  private ExternalTracker externalTracker = null;

  @SerializedName("external_wiki")
  private ExternalWiki externalWiki = null;

  @SerializedName("fork")
  private Boolean fork = null;

  @SerializedName("forks_count")
  private Long forksCount = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("has_issues")
  private Boolean hasIssues = null;

  @SerializedName("has_projects")
  private Boolean hasProjects = null;

  @SerializedName("has_pull_requests")
  private Boolean hasPullRequests = null;

  @SerializedName("has_wiki")
  private Boolean hasWiki = null;

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ignore_whitespace_conflicts")
  private Boolean ignoreWhitespaceConflicts = null;

  @SerializedName("internal")
  private Boolean internal = null;

  @SerializedName("internal_tracker")
  private InternalTracker internalTracker = null;

  @SerializedName("mirror")
  private Boolean mirror = null;

  @SerializedName("mirror_interval")
  private String mirrorInterval = null;

  @SerializedName("mirror_updated")
  private OffsetDateTime mirrorUpdated = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("open_issues_count")
  private Long openIssuesCount = null;

  @SerializedName("open_pr_counter")
  private Long openPrCounter = null;

  @SerializedName("original_url")
  private String originalUrl = null;

  @SerializedName("owner")
  private User owner = null;

  @SerializedName("parent")
  private Repository parent = null;

  @SerializedName("permissions")
  private Permission permissions = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("release_counter")
  private Long releaseCounter = null;

  @SerializedName("repo_transfer")
  private RepoTransfer repoTransfer = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("ssh_url")
  private String sshUrl = null;

  @SerializedName("stars_count")
  private Long starsCount = null;

  @SerializedName("template")
  private Boolean template = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("watchers_count")
  private Long watchersCount = null;

  @SerializedName("website")
  private String website = null;

  public Repository allowMergeCommits(Boolean allowMergeCommits) {
    this.allowMergeCommits = allowMergeCommits;
    return this;
  }

   /**
   * Get allowMergeCommits
   * @return allowMergeCommits
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowMergeCommits() {
    return allowMergeCommits;
  }

  public void setAllowMergeCommits(Boolean allowMergeCommits) {
    this.allowMergeCommits = allowMergeCommits;
  }

  public Repository allowRebase(Boolean allowRebase) {
    this.allowRebase = allowRebase;
    return this;
  }

   /**
   * Get allowRebase
   * @return allowRebase
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowRebase() {
    return allowRebase;
  }

  public void setAllowRebase(Boolean allowRebase) {
    this.allowRebase = allowRebase;
  }

  public Repository allowRebaseExplicit(Boolean allowRebaseExplicit) {
    this.allowRebaseExplicit = allowRebaseExplicit;
    return this;
  }

   /**
   * Get allowRebaseExplicit
   * @return allowRebaseExplicit
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowRebaseExplicit() {
    return allowRebaseExplicit;
  }

  public void setAllowRebaseExplicit(Boolean allowRebaseExplicit) {
    this.allowRebaseExplicit = allowRebaseExplicit;
  }

  public Repository allowSquashMerge(Boolean allowSquashMerge) {
    this.allowSquashMerge = allowSquashMerge;
    return this;
  }

   /**
   * Get allowSquashMerge
   * @return allowSquashMerge
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowSquashMerge() {
    return allowSquashMerge;
  }

  public void setAllowSquashMerge(Boolean allowSquashMerge) {
    this.allowSquashMerge = allowSquashMerge;
  }

  public Repository archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @ApiModelProperty(value = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Repository avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

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

  public Repository defaultMergeStyle(String defaultMergeStyle) {
    this.defaultMergeStyle = defaultMergeStyle;
    return this;
  }

   /**
   * Get defaultMergeStyle
   * @return defaultMergeStyle
  **/
  @ApiModelProperty(value = "")
  public String getDefaultMergeStyle() {
    return defaultMergeStyle;
  }

  public void setDefaultMergeStyle(String defaultMergeStyle) {
    this.defaultMergeStyle = defaultMergeStyle;
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

  public Repository externalTracker(ExternalTracker externalTracker) {
    this.externalTracker = externalTracker;
    return this;
  }

   /**
   * Get externalTracker
   * @return externalTracker
  **/
  @ApiModelProperty(value = "")
  public ExternalTracker getExternalTracker() {
    return externalTracker;
  }

  public void setExternalTracker(ExternalTracker externalTracker) {
    this.externalTracker = externalTracker;
  }

  public Repository externalWiki(ExternalWiki externalWiki) {
    this.externalWiki = externalWiki;
    return this;
  }

   /**
   * Get externalWiki
   * @return externalWiki
  **/
  @ApiModelProperty(value = "")
  public ExternalWiki getExternalWiki() {
    return externalWiki;
  }

  public void setExternalWiki(ExternalWiki externalWiki) {
    this.externalWiki = externalWiki;
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

  public Repository hasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
    return this;
  }

   /**
   * Get hasIssues
   * @return hasIssues
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasIssues() {
    return hasIssues;
  }

  public void setHasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
  }

  public Repository hasProjects(Boolean hasProjects) {
    this.hasProjects = hasProjects;
    return this;
  }

   /**
   * Get hasProjects
   * @return hasProjects
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasProjects() {
    return hasProjects;
  }

  public void setHasProjects(Boolean hasProjects) {
    this.hasProjects = hasProjects;
  }

  public Repository hasPullRequests(Boolean hasPullRequests) {
    this.hasPullRequests = hasPullRequests;
    return this;
  }

   /**
   * Get hasPullRequests
   * @return hasPullRequests
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasPullRequests() {
    return hasPullRequests;
  }

  public void setHasPullRequests(Boolean hasPullRequests) {
    this.hasPullRequests = hasPullRequests;
  }

  public Repository hasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
    return this;
  }

   /**
   * Get hasWiki
   * @return hasWiki
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasWiki() {
    return hasWiki;
  }

  public void setHasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
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

  public Repository ignoreWhitespaceConflicts(Boolean ignoreWhitespaceConflicts) {
    this.ignoreWhitespaceConflicts = ignoreWhitespaceConflicts;
    return this;
  }

   /**
   * Get ignoreWhitespaceConflicts
   * @return ignoreWhitespaceConflicts
  **/
  @ApiModelProperty(value = "")
  public Boolean isIgnoreWhitespaceConflicts() {
    return ignoreWhitespaceConflicts;
  }

  public void setIgnoreWhitespaceConflicts(Boolean ignoreWhitespaceConflicts) {
    this.ignoreWhitespaceConflicts = ignoreWhitespaceConflicts;
  }

  public Repository internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @ApiModelProperty(value = "")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public Repository internalTracker(InternalTracker internalTracker) {
    this.internalTracker = internalTracker;
    return this;
  }

   /**
   * Get internalTracker
   * @return internalTracker
  **/
  @ApiModelProperty(value = "")
  public InternalTracker getInternalTracker() {
    return internalTracker;
  }

  public void setInternalTracker(InternalTracker internalTracker) {
    this.internalTracker = internalTracker;
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

  public Repository mirrorInterval(String mirrorInterval) {
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

  public Repository mirrorUpdated(OffsetDateTime mirrorUpdated) {
    this.mirrorUpdated = mirrorUpdated;
    return this;
  }

   /**
   * Get mirrorUpdated
   * @return mirrorUpdated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getMirrorUpdated() {
    return mirrorUpdated;
  }

  public void setMirrorUpdated(OffsetDateTime mirrorUpdated) {
    this.mirrorUpdated = mirrorUpdated;
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

  public Repository openPrCounter(Long openPrCounter) {
    this.openPrCounter = openPrCounter;
    return this;
  }

   /**
   * Get openPrCounter
   * @return openPrCounter
  **/
  @ApiModelProperty(value = "")
  public Long getOpenPrCounter() {
    return openPrCounter;
  }

  public void setOpenPrCounter(Long openPrCounter) {
    this.openPrCounter = openPrCounter;
  }

  public Repository originalUrl(String originalUrl) {
    this.originalUrl = originalUrl;
    return this;
  }

   /**
   * Get originalUrl
   * @return originalUrl
  **/
  @ApiModelProperty(value = "")
  public String getOriginalUrl() {
    return originalUrl;
  }

  public void setOriginalUrl(String originalUrl) {
    this.originalUrl = originalUrl;
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

  public Repository releaseCounter(Long releaseCounter) {
    this.releaseCounter = releaseCounter;
    return this;
  }

   /**
   * Get releaseCounter
   * @return releaseCounter
  **/
  @ApiModelProperty(value = "")
  public Long getReleaseCounter() {
    return releaseCounter;
  }

  public void setReleaseCounter(Long releaseCounter) {
    this.releaseCounter = releaseCounter;
  }

  public Repository repoTransfer(RepoTransfer repoTransfer) {
    this.repoTransfer = repoTransfer;
    return this;
  }

   /**
   * Get repoTransfer
   * @return repoTransfer
  **/
  @ApiModelProperty(value = "")
  public RepoTransfer getRepoTransfer() {
    return repoTransfer;
  }

  public void setRepoTransfer(RepoTransfer repoTransfer) {
    this.repoTransfer = repoTransfer;
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

  public Repository template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public Boolean isTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
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
    return Objects.equals(this.allowMergeCommits, repository.allowMergeCommits) &&
        Objects.equals(this.allowRebase, repository.allowRebase) &&
        Objects.equals(this.allowRebaseExplicit, repository.allowRebaseExplicit) &&
        Objects.equals(this.allowSquashMerge, repository.allowSquashMerge) &&
        Objects.equals(this.archived, repository.archived) &&
        Objects.equals(this.avatarUrl, repository.avatarUrl) &&
        Objects.equals(this.cloneUrl, repository.cloneUrl) &&
        Objects.equals(this.createdAt, repository.createdAt) &&
        Objects.equals(this.defaultBranch, repository.defaultBranch) &&
        Objects.equals(this.defaultMergeStyle, repository.defaultMergeStyle) &&
        Objects.equals(this.description, repository.description) &&
        Objects.equals(this.empty, repository.empty) &&
        Objects.equals(this.externalTracker, repository.externalTracker) &&
        Objects.equals(this.externalWiki, repository.externalWiki) &&
        Objects.equals(this.fork, repository.fork) &&
        Objects.equals(this.forksCount, repository.forksCount) &&
        Objects.equals(this.fullName, repository.fullName) &&
        Objects.equals(this.hasIssues, repository.hasIssues) &&
        Objects.equals(this.hasProjects, repository.hasProjects) &&
        Objects.equals(this.hasPullRequests, repository.hasPullRequests) &&
        Objects.equals(this.hasWiki, repository.hasWiki) &&
        Objects.equals(this.htmlUrl, repository.htmlUrl) &&
        Objects.equals(this.id, repository.id) &&
        Objects.equals(this.ignoreWhitespaceConflicts, repository.ignoreWhitespaceConflicts) &&
        Objects.equals(this.internal, repository.internal) &&
        Objects.equals(this.internalTracker, repository.internalTracker) &&
        Objects.equals(this.mirror, repository.mirror) &&
        Objects.equals(this.mirrorInterval, repository.mirrorInterval) &&
        Objects.equals(this.mirrorUpdated, repository.mirrorUpdated) &&
        Objects.equals(this.name, repository.name) &&
        Objects.equals(this.openIssuesCount, repository.openIssuesCount) &&
        Objects.equals(this.openPrCounter, repository.openPrCounter) &&
        Objects.equals(this.originalUrl, repository.originalUrl) &&
        Objects.equals(this.owner, repository.owner) &&
        Objects.equals(this.parent, repository.parent) &&
        Objects.equals(this.permissions, repository.permissions) &&
        Objects.equals(this._private, repository._private) &&
        Objects.equals(this.releaseCounter, repository.releaseCounter) &&
        Objects.equals(this.repoTransfer, repository.repoTransfer) &&
        Objects.equals(this.size, repository.size) &&
        Objects.equals(this.sshUrl, repository.sshUrl) &&
        Objects.equals(this.starsCount, repository.starsCount) &&
        Objects.equals(this.template, repository.template) &&
        Objects.equals(this.updatedAt, repository.updatedAt) &&
        Objects.equals(this.watchersCount, repository.watchersCount) &&
        Objects.equals(this.website, repository.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMergeCommits, allowRebase, allowRebaseExplicit, allowSquashMerge, archived, avatarUrl, cloneUrl, createdAt, defaultBranch, defaultMergeStyle, description, empty, externalTracker, externalWiki, fork, forksCount, fullName, hasIssues, hasProjects, hasPullRequests, hasWiki, htmlUrl, id, ignoreWhitespaceConflicts, internal, internalTracker, mirror, mirrorInterval, mirrorUpdated, name, openIssuesCount, openPrCounter, originalUrl, owner, parent, permissions, _private, releaseCounter, repoTransfer, size, sshUrl, starsCount, template, updatedAt, watchersCount, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    
    sb.append("    allowMergeCommits: ").append(toIndentedString(allowMergeCommits)).append("\n");
    sb.append("    allowRebase: ").append(toIndentedString(allowRebase)).append("\n");
    sb.append("    allowRebaseExplicit: ").append(toIndentedString(allowRebaseExplicit)).append("\n");
    sb.append("    allowSquashMerge: ").append(toIndentedString(allowSquashMerge)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    cloneUrl: ").append(toIndentedString(cloneUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    defaultMergeStyle: ").append(toIndentedString(defaultMergeStyle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    externalTracker: ").append(toIndentedString(externalTracker)).append("\n");
    sb.append("    externalWiki: ").append(toIndentedString(externalWiki)).append("\n");
    sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
    sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
    sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
    sb.append("    hasPullRequests: ").append(toIndentedString(hasPullRequests)).append("\n");
    sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreWhitespaceConflicts: ").append(toIndentedString(ignoreWhitespaceConflicts)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    internalTracker: ").append(toIndentedString(internalTracker)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    mirrorInterval: ").append(toIndentedString(mirrorInterval)).append("\n");
    sb.append("    mirrorUpdated: ").append(toIndentedString(mirrorUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openIssuesCount: ").append(toIndentedString(openIssuesCount)).append("\n");
    sb.append("    openPrCounter: ").append(toIndentedString(openPrCounter)).append("\n");
    sb.append("    originalUrl: ").append(toIndentedString(originalUrl)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    releaseCounter: ").append(toIndentedString(releaseCounter)).append("\n");
    sb.append("    repoTransfer: ").append(toIndentedString(repoTransfer)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
    sb.append("    starsCount: ").append(toIndentedString(starsCount)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

