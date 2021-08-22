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
import io.gitea.model.ExternalTracker;
import io.gitea.model.ExternalWiki;
import io.gitea.model.InternalTracker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EditRepoOption options when editing a repository&#39;s properties
 */
@ApiModel(description = "EditRepoOption options when editing a repository's properties")

public class EditRepoOption {
  @SerializedName("allow_manual_merge")
  private Boolean allowManualMerge = null;

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

  @SerializedName("autodetect_manual_merge")
  private Boolean autodetectManualMerge = null;

  @SerializedName("default_branch")
  private String defaultBranch = null;

  @SerializedName("default_delete_branch_after_merge")
  private Boolean defaultDeleteBranchAfterMerge = null;

  @SerializedName("default_merge_style")
  private String defaultMergeStyle = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("external_tracker")
  private ExternalTracker externalTracker = null;

  @SerializedName("external_wiki")
  private ExternalWiki externalWiki = null;

  @SerializedName("has_issues")
  private Boolean hasIssues = null;

  @SerializedName("has_projects")
  private Boolean hasProjects = null;

  @SerializedName("has_pull_requests")
  private Boolean hasPullRequests = null;

  @SerializedName("has_wiki")
  private Boolean hasWiki = null;

  @SerializedName("ignore_whitespace_conflicts")
  private Boolean ignoreWhitespaceConflicts = null;

  @SerializedName("internal_tracker")
  private InternalTracker internalTracker = null;

  @SerializedName("mirror_interval")
  private String mirrorInterval = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("template")
  private Boolean template = null;

  @SerializedName("website")
  private String website = null;

  public EditRepoOption allowManualMerge(Boolean allowManualMerge) {
    this.allowManualMerge = allowManualMerge;
    return this;
  }

   /**
   * either &#x60;true&#x60; to allow mark pr as merged manually, or &#x60;false&#x60; to prevent it. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;.
   * @return allowManualMerge
  **/
  @ApiModelProperty(value = "either `true` to allow mark pr as merged manually, or `false` to prevent it. `has_pull_requests` must be `true`.")
  public Boolean isAllowManualMerge() {
    return allowManualMerge;
  }

  public void setAllowManualMerge(Boolean allowManualMerge) {
    this.allowManualMerge = allowManualMerge;
  }

  public EditRepoOption allowMergeCommits(Boolean allowMergeCommits) {
    this.allowMergeCommits = allowMergeCommits;
    return this;
  }

   /**
   * either &#x60;true&#x60; to allow merging pull requests with a merge commit, or &#x60;false&#x60; to prevent merging pull requests with merge commits. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;.
   * @return allowMergeCommits
  **/
  @ApiModelProperty(value = "either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits. `has_pull_requests` must be `true`.")
  public Boolean isAllowMergeCommits() {
    return allowMergeCommits;
  }

  public void setAllowMergeCommits(Boolean allowMergeCommits) {
    this.allowMergeCommits = allowMergeCommits;
  }

  public EditRepoOption allowRebase(Boolean allowRebase) {
    this.allowRebase = allowRebase;
    return this;
  }

   /**
   * either &#x60;true&#x60; to allow rebase-merging pull requests, or &#x60;false&#x60; to prevent rebase-merging. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;.
   * @return allowRebase
  **/
  @ApiModelProperty(value = "either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging. `has_pull_requests` must be `true`.")
  public Boolean isAllowRebase() {
    return allowRebase;
  }

  public void setAllowRebase(Boolean allowRebase) {
    this.allowRebase = allowRebase;
  }

  public EditRepoOption allowRebaseExplicit(Boolean allowRebaseExplicit) {
    this.allowRebaseExplicit = allowRebaseExplicit;
    return this;
  }

   /**
   * either &#x60;true&#x60; to allow rebase with explicit merge commits (--no-ff), or &#x60;false&#x60; to prevent rebase with explicit merge commits. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;.
   * @return allowRebaseExplicit
  **/
  @ApiModelProperty(value = "either `true` to allow rebase with explicit merge commits (--no-ff), or `false` to prevent rebase with explicit merge commits. `has_pull_requests` must be `true`.")
  public Boolean isAllowRebaseExplicit() {
    return allowRebaseExplicit;
  }

  public void setAllowRebaseExplicit(Boolean allowRebaseExplicit) {
    this.allowRebaseExplicit = allowRebaseExplicit;
  }

  public EditRepoOption allowSquashMerge(Boolean allowSquashMerge) {
    this.allowSquashMerge = allowSquashMerge;
    return this;
  }

   /**
   * either &#x60;true&#x60; to allow squash-merging pull requests, or &#x60;false&#x60; to prevent squash-merging. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;.
   * @return allowSquashMerge
  **/
  @ApiModelProperty(value = "either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging. `has_pull_requests` must be `true`.")
  public Boolean isAllowSquashMerge() {
    return allowSquashMerge;
  }

  public void setAllowSquashMerge(Boolean allowSquashMerge) {
    this.allowSquashMerge = allowSquashMerge;
  }

  public EditRepoOption archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * set to &#x60;true&#x60; to archive this repository.
   * @return archived
  **/
  @ApiModelProperty(value = "set to `true` to archive this repository.")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public EditRepoOption autodetectManualMerge(Boolean autodetectManualMerge) {
    this.autodetectManualMerge = autodetectManualMerge;
    return this;
  }

   /**
   * either &#x60;true&#x60; to enable AutodetectManualMerge, or &#x60;false&#x60; to prevent it. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;, Note: In some special cases, misjudgments can occur.
   * @return autodetectManualMerge
  **/
  @ApiModelProperty(value = "either `true` to enable AutodetectManualMerge, or `false` to prevent it. `has_pull_requests` must be `true`, Note: In some special cases, misjudgments can occur.")
  public Boolean isAutodetectManualMerge() {
    return autodetectManualMerge;
  }

  public void setAutodetectManualMerge(Boolean autodetectManualMerge) {
    this.autodetectManualMerge = autodetectManualMerge;
  }

  public EditRepoOption defaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * sets the default branch for this repository.
   * @return defaultBranch
  **/
  @ApiModelProperty(value = "sets the default branch for this repository.")
  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public EditRepoOption defaultDeleteBranchAfterMerge(Boolean defaultDeleteBranchAfterMerge) {
    this.defaultDeleteBranchAfterMerge = defaultDeleteBranchAfterMerge;
    return this;
  }

   /**
   * set to &#x60;true&#x60; to delete pr branch after merge by default
   * @return defaultDeleteBranchAfterMerge
  **/
  @ApiModelProperty(value = "set to `true` to delete pr branch after merge by default")
  public Boolean isDefaultDeleteBranchAfterMerge() {
    return defaultDeleteBranchAfterMerge;
  }

  public void setDefaultDeleteBranchAfterMerge(Boolean defaultDeleteBranchAfterMerge) {
    this.defaultDeleteBranchAfterMerge = defaultDeleteBranchAfterMerge;
  }

  public EditRepoOption defaultMergeStyle(String defaultMergeStyle) {
    this.defaultMergeStyle = defaultMergeStyle;
    return this;
  }

   /**
   * set to a merge style to be used by this repository: \&quot;merge\&quot;, \&quot;rebase\&quot;, \&quot;rebase-merge\&quot;, or \&quot;squash\&quot;. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;.
   * @return defaultMergeStyle
  **/
  @ApiModelProperty(value = "set to a merge style to be used by this repository: \"merge\", \"rebase\", \"rebase-merge\", or \"squash\". `has_pull_requests` must be `true`.")
  public String getDefaultMergeStyle() {
    return defaultMergeStyle;
  }

  public void setDefaultMergeStyle(String defaultMergeStyle) {
    this.defaultMergeStyle = defaultMergeStyle;
  }

  public EditRepoOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * a short description of the repository.
   * @return description
  **/
  @ApiModelProperty(value = "a short description of the repository.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditRepoOption externalTracker(ExternalTracker externalTracker) {
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

  public EditRepoOption externalWiki(ExternalWiki externalWiki) {
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

  public EditRepoOption hasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
    return this;
  }

   /**
   * either &#x60;true&#x60; to enable issues for this repository or &#x60;false&#x60; to disable them.
   * @return hasIssues
  **/
  @ApiModelProperty(value = "either `true` to enable issues for this repository or `false` to disable them.")
  public Boolean isHasIssues() {
    return hasIssues;
  }

  public void setHasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
  }

  public EditRepoOption hasProjects(Boolean hasProjects) {
    this.hasProjects = hasProjects;
    return this;
  }

   /**
   * either &#x60;true&#x60; to enable project unit, or &#x60;false&#x60; to disable them.
   * @return hasProjects
  **/
  @ApiModelProperty(value = "either `true` to enable project unit, or `false` to disable them.")
  public Boolean isHasProjects() {
    return hasProjects;
  }

  public void setHasProjects(Boolean hasProjects) {
    this.hasProjects = hasProjects;
  }

  public EditRepoOption hasPullRequests(Boolean hasPullRequests) {
    this.hasPullRequests = hasPullRequests;
    return this;
  }

   /**
   * either &#x60;true&#x60; to allow pull requests, or &#x60;false&#x60; to prevent pull request.
   * @return hasPullRequests
  **/
  @ApiModelProperty(value = "either `true` to allow pull requests, or `false` to prevent pull request.")
  public Boolean isHasPullRequests() {
    return hasPullRequests;
  }

  public void setHasPullRequests(Boolean hasPullRequests) {
    this.hasPullRequests = hasPullRequests;
  }

  public EditRepoOption hasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
    return this;
  }

   /**
   * either &#x60;true&#x60; to enable the wiki for this repository or &#x60;false&#x60; to disable it.
   * @return hasWiki
  **/
  @ApiModelProperty(value = "either `true` to enable the wiki for this repository or `false` to disable it.")
  public Boolean isHasWiki() {
    return hasWiki;
  }

  public void setHasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
  }

  public EditRepoOption ignoreWhitespaceConflicts(Boolean ignoreWhitespaceConflicts) {
    this.ignoreWhitespaceConflicts = ignoreWhitespaceConflicts;
    return this;
  }

   /**
   * either &#x60;true&#x60; to ignore whitespace for conflicts, or &#x60;false&#x60; to not ignore whitespace. &#x60;has_pull_requests&#x60; must be &#x60;true&#x60;.
   * @return ignoreWhitespaceConflicts
  **/
  @ApiModelProperty(value = "either `true` to ignore whitespace for conflicts, or `false` to not ignore whitespace. `has_pull_requests` must be `true`.")
  public Boolean isIgnoreWhitespaceConflicts() {
    return ignoreWhitespaceConflicts;
  }

  public void setIgnoreWhitespaceConflicts(Boolean ignoreWhitespaceConflicts) {
    this.ignoreWhitespaceConflicts = ignoreWhitespaceConflicts;
  }

  public EditRepoOption internalTracker(InternalTracker internalTracker) {
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

  public EditRepoOption mirrorInterval(String mirrorInterval) {
    this.mirrorInterval = mirrorInterval;
    return this;
  }

   /**
   * set to a string like &#x60;8h30m0s&#x60; to set the mirror interval time
   * @return mirrorInterval
  **/
  @ApiModelProperty(value = "set to a string like `8h30m0s` to set the mirror interval time")
  public String getMirrorInterval() {
    return mirrorInterval;
  }

  public void setMirrorInterval(String mirrorInterval) {
    this.mirrorInterval = mirrorInterval;
  }

  public EditRepoOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the repository
   * @return name
  **/
  @ApiModelProperty(value = "name of the repository")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EditRepoOption _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * either &#x60;true&#x60; to make the repository private or &#x60;false&#x60; to make it public. Note: you will get a 422 error if the organization restricts changing repository visibility to organization owners and a non-owner tries to change the value of private.
   * @return _private
  **/
  @ApiModelProperty(value = "either `true` to make the repository private or `false` to make it public. Note: you will get a 422 error if the organization restricts changing repository visibility to organization owners and a non-owner tries to change the value of private.")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public EditRepoOption template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * either &#x60;true&#x60; to make this repository a template or &#x60;false&#x60; to make it a normal repository
   * @return template
  **/
  @ApiModelProperty(value = "either `true` to make this repository a template or `false` to make it a normal repository")
  public Boolean isTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
  }

  public EditRepoOption website(String website) {
    this.website = website;
    return this;
  }

   /**
   * a URL with more information about the repository.
   * @return website
  **/
  @ApiModelProperty(value = "a URL with more information about the repository.")
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
    EditRepoOption editRepoOption = (EditRepoOption) o;
    return Objects.equals(this.allowManualMerge, editRepoOption.allowManualMerge) &&
        Objects.equals(this.allowMergeCommits, editRepoOption.allowMergeCommits) &&
        Objects.equals(this.allowRebase, editRepoOption.allowRebase) &&
        Objects.equals(this.allowRebaseExplicit, editRepoOption.allowRebaseExplicit) &&
        Objects.equals(this.allowSquashMerge, editRepoOption.allowSquashMerge) &&
        Objects.equals(this.archived, editRepoOption.archived) &&
        Objects.equals(this.autodetectManualMerge, editRepoOption.autodetectManualMerge) &&
        Objects.equals(this.defaultBranch, editRepoOption.defaultBranch) &&
        Objects.equals(this.defaultDeleteBranchAfterMerge, editRepoOption.defaultDeleteBranchAfterMerge) &&
        Objects.equals(this.defaultMergeStyle, editRepoOption.defaultMergeStyle) &&
        Objects.equals(this.description, editRepoOption.description) &&
        Objects.equals(this.externalTracker, editRepoOption.externalTracker) &&
        Objects.equals(this.externalWiki, editRepoOption.externalWiki) &&
        Objects.equals(this.hasIssues, editRepoOption.hasIssues) &&
        Objects.equals(this.hasProjects, editRepoOption.hasProjects) &&
        Objects.equals(this.hasPullRequests, editRepoOption.hasPullRequests) &&
        Objects.equals(this.hasWiki, editRepoOption.hasWiki) &&
        Objects.equals(this.ignoreWhitespaceConflicts, editRepoOption.ignoreWhitespaceConflicts) &&
        Objects.equals(this.internalTracker, editRepoOption.internalTracker) &&
        Objects.equals(this.mirrorInterval, editRepoOption.mirrorInterval) &&
        Objects.equals(this.name, editRepoOption.name) &&
        Objects.equals(this._private, editRepoOption._private) &&
        Objects.equals(this.template, editRepoOption.template) &&
        Objects.equals(this.website, editRepoOption.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowManualMerge, allowMergeCommits, allowRebase, allowRebaseExplicit, allowSquashMerge, archived, autodetectManualMerge, defaultBranch, defaultDeleteBranchAfterMerge, defaultMergeStyle, description, externalTracker, externalWiki, hasIssues, hasProjects, hasPullRequests, hasWiki, ignoreWhitespaceConflicts, internalTracker, mirrorInterval, name, _private, template, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditRepoOption {\n");
    
    sb.append("    allowManualMerge: ").append(toIndentedString(allowManualMerge)).append("\n");
    sb.append("    allowMergeCommits: ").append(toIndentedString(allowMergeCommits)).append("\n");
    sb.append("    allowRebase: ").append(toIndentedString(allowRebase)).append("\n");
    sb.append("    allowRebaseExplicit: ").append(toIndentedString(allowRebaseExplicit)).append("\n");
    sb.append("    allowSquashMerge: ").append(toIndentedString(allowSquashMerge)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    autodetectManualMerge: ").append(toIndentedString(autodetectManualMerge)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    defaultDeleteBranchAfterMerge: ").append(toIndentedString(defaultDeleteBranchAfterMerge)).append("\n");
    sb.append("    defaultMergeStyle: ").append(toIndentedString(defaultMergeStyle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalTracker: ").append(toIndentedString(externalTracker)).append("\n");
    sb.append("    externalWiki: ").append(toIndentedString(externalWiki)).append("\n");
    sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
    sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
    sb.append("    hasPullRequests: ").append(toIndentedString(hasPullRequests)).append("\n");
    sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
    sb.append("    ignoreWhitespaceConflicts: ").append(toIndentedString(ignoreWhitespaceConflicts)).append("\n");
    sb.append("    internalTracker: ").append(toIndentedString(internalTracker)).append("\n");
    sb.append("    mirrorInterval: ").append(toIndentedString(mirrorInterval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

