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
 * EditBranchProtectionOption options for editing a branch protection
 */
@ApiModel(description = "EditBranchProtectionOption options for editing a branch protection")

public class EditBranchProtectionOption {
  @SerializedName("approvals_whitelist_teams")
  private List<String> approvalsWhitelistTeams = null;

  @SerializedName("approvals_whitelist_username")
  private List<String> approvalsWhitelistUsername = null;

  @SerializedName("block_on_official_review_requests")
  private Boolean blockOnOfficialReviewRequests = null;

  @SerializedName("block_on_outdated_branch")
  private Boolean blockOnOutdatedBranch = null;

  @SerializedName("block_on_rejected_reviews")
  private Boolean blockOnRejectedReviews = null;

  @SerializedName("dismiss_stale_approvals")
  private Boolean dismissStaleApprovals = null;

  @SerializedName("enable_approvals_whitelist")
  private Boolean enableApprovalsWhitelist = null;

  @SerializedName("enable_merge_whitelist")
  private Boolean enableMergeWhitelist = null;

  @SerializedName("enable_push")
  private Boolean enablePush = null;

  @SerializedName("enable_push_whitelist")
  private Boolean enablePushWhitelist = null;

  @SerializedName("enable_status_check")
  private Boolean enableStatusCheck = null;

  @SerializedName("merge_whitelist_teams")
  private List<String> mergeWhitelistTeams = null;

  @SerializedName("merge_whitelist_usernames")
  private List<String> mergeWhitelistUsernames = null;

  @SerializedName("protected_file_patterns")
  private String protectedFilePatterns = null;

  @SerializedName("push_whitelist_deploy_keys")
  private Boolean pushWhitelistDeployKeys = null;

  @SerializedName("push_whitelist_teams")
  private List<String> pushWhitelistTeams = null;

  @SerializedName("push_whitelist_usernames")
  private List<String> pushWhitelistUsernames = null;

  @SerializedName("require_signed_commits")
  private Boolean requireSignedCommits = null;

  @SerializedName("required_approvals")
  private Long requiredApprovals = null;

  @SerializedName("status_check_contexts")
  private List<String> statusCheckContexts = null;

  @SerializedName("unprotected_file_patterns")
  private String unprotectedFilePatterns = null;

  public EditBranchProtectionOption approvalsWhitelistTeams(List<String> approvalsWhitelistTeams) {
    this.approvalsWhitelistTeams = approvalsWhitelistTeams;
    return this;
  }

  public EditBranchProtectionOption addApprovalsWhitelistTeamsItem(String approvalsWhitelistTeamsItem) {
    if (this.approvalsWhitelistTeams == null) {
      this.approvalsWhitelistTeams = new ArrayList<String>();
    }
    this.approvalsWhitelistTeams.add(approvalsWhitelistTeamsItem);
    return this;
  }

   /**
   * Get approvalsWhitelistTeams
   * @return approvalsWhitelistTeams
  **/
  @ApiModelProperty(value = "")
  public List<String> getApprovalsWhitelistTeams() {
    return approvalsWhitelistTeams;
  }

  public void setApprovalsWhitelistTeams(List<String> approvalsWhitelistTeams) {
    this.approvalsWhitelistTeams = approvalsWhitelistTeams;
  }

  public EditBranchProtectionOption approvalsWhitelistUsername(List<String> approvalsWhitelistUsername) {
    this.approvalsWhitelistUsername = approvalsWhitelistUsername;
    return this;
  }

  public EditBranchProtectionOption addApprovalsWhitelistUsernameItem(String approvalsWhitelistUsernameItem) {
    if (this.approvalsWhitelistUsername == null) {
      this.approvalsWhitelistUsername = new ArrayList<String>();
    }
    this.approvalsWhitelistUsername.add(approvalsWhitelistUsernameItem);
    return this;
  }

   /**
   * Get approvalsWhitelistUsername
   * @return approvalsWhitelistUsername
  **/
  @ApiModelProperty(value = "")
  public List<String> getApprovalsWhitelistUsername() {
    return approvalsWhitelistUsername;
  }

  public void setApprovalsWhitelistUsername(List<String> approvalsWhitelistUsername) {
    this.approvalsWhitelistUsername = approvalsWhitelistUsername;
  }

  public EditBranchProtectionOption blockOnOfficialReviewRequests(Boolean blockOnOfficialReviewRequests) {
    this.blockOnOfficialReviewRequests = blockOnOfficialReviewRequests;
    return this;
  }

   /**
   * Get blockOnOfficialReviewRequests
   * @return blockOnOfficialReviewRequests
  **/
  @ApiModelProperty(value = "")
  public Boolean isBlockOnOfficialReviewRequests() {
    return blockOnOfficialReviewRequests;
  }

  public void setBlockOnOfficialReviewRequests(Boolean blockOnOfficialReviewRequests) {
    this.blockOnOfficialReviewRequests = blockOnOfficialReviewRequests;
  }

  public EditBranchProtectionOption blockOnOutdatedBranch(Boolean blockOnOutdatedBranch) {
    this.blockOnOutdatedBranch = blockOnOutdatedBranch;
    return this;
  }

   /**
   * Get blockOnOutdatedBranch
   * @return blockOnOutdatedBranch
  **/
  @ApiModelProperty(value = "")
  public Boolean isBlockOnOutdatedBranch() {
    return blockOnOutdatedBranch;
  }

  public void setBlockOnOutdatedBranch(Boolean blockOnOutdatedBranch) {
    this.blockOnOutdatedBranch = blockOnOutdatedBranch;
  }

  public EditBranchProtectionOption blockOnRejectedReviews(Boolean blockOnRejectedReviews) {
    this.blockOnRejectedReviews = blockOnRejectedReviews;
    return this;
  }

   /**
   * Get blockOnRejectedReviews
   * @return blockOnRejectedReviews
  **/
  @ApiModelProperty(value = "")
  public Boolean isBlockOnRejectedReviews() {
    return blockOnRejectedReviews;
  }

  public void setBlockOnRejectedReviews(Boolean blockOnRejectedReviews) {
    this.blockOnRejectedReviews = blockOnRejectedReviews;
  }

  public EditBranchProtectionOption dismissStaleApprovals(Boolean dismissStaleApprovals) {
    this.dismissStaleApprovals = dismissStaleApprovals;
    return this;
  }

   /**
   * Get dismissStaleApprovals
   * @return dismissStaleApprovals
  **/
  @ApiModelProperty(value = "")
  public Boolean isDismissStaleApprovals() {
    return dismissStaleApprovals;
  }

  public void setDismissStaleApprovals(Boolean dismissStaleApprovals) {
    this.dismissStaleApprovals = dismissStaleApprovals;
  }

  public EditBranchProtectionOption enableApprovalsWhitelist(Boolean enableApprovalsWhitelist) {
    this.enableApprovalsWhitelist = enableApprovalsWhitelist;
    return this;
  }

   /**
   * Get enableApprovalsWhitelist
   * @return enableApprovalsWhitelist
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableApprovalsWhitelist() {
    return enableApprovalsWhitelist;
  }

  public void setEnableApprovalsWhitelist(Boolean enableApprovalsWhitelist) {
    this.enableApprovalsWhitelist = enableApprovalsWhitelist;
  }

  public EditBranchProtectionOption enableMergeWhitelist(Boolean enableMergeWhitelist) {
    this.enableMergeWhitelist = enableMergeWhitelist;
    return this;
  }

   /**
   * Get enableMergeWhitelist
   * @return enableMergeWhitelist
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableMergeWhitelist() {
    return enableMergeWhitelist;
  }

  public void setEnableMergeWhitelist(Boolean enableMergeWhitelist) {
    this.enableMergeWhitelist = enableMergeWhitelist;
  }

  public EditBranchProtectionOption enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Get enablePush
   * @return enablePush
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnablePush() {
    return enablePush;
  }

  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }

  public EditBranchProtectionOption enablePushWhitelist(Boolean enablePushWhitelist) {
    this.enablePushWhitelist = enablePushWhitelist;
    return this;
  }

   /**
   * Get enablePushWhitelist
   * @return enablePushWhitelist
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnablePushWhitelist() {
    return enablePushWhitelist;
  }

  public void setEnablePushWhitelist(Boolean enablePushWhitelist) {
    this.enablePushWhitelist = enablePushWhitelist;
  }

  public EditBranchProtectionOption enableStatusCheck(Boolean enableStatusCheck) {
    this.enableStatusCheck = enableStatusCheck;
    return this;
  }

   /**
   * Get enableStatusCheck
   * @return enableStatusCheck
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableStatusCheck() {
    return enableStatusCheck;
  }

  public void setEnableStatusCheck(Boolean enableStatusCheck) {
    this.enableStatusCheck = enableStatusCheck;
  }

  public EditBranchProtectionOption mergeWhitelistTeams(List<String> mergeWhitelistTeams) {
    this.mergeWhitelistTeams = mergeWhitelistTeams;
    return this;
  }

  public EditBranchProtectionOption addMergeWhitelistTeamsItem(String mergeWhitelistTeamsItem) {
    if (this.mergeWhitelistTeams == null) {
      this.mergeWhitelistTeams = new ArrayList<String>();
    }
    this.mergeWhitelistTeams.add(mergeWhitelistTeamsItem);
    return this;
  }

   /**
   * Get mergeWhitelistTeams
   * @return mergeWhitelistTeams
  **/
  @ApiModelProperty(value = "")
  public List<String> getMergeWhitelistTeams() {
    return mergeWhitelistTeams;
  }

  public void setMergeWhitelistTeams(List<String> mergeWhitelistTeams) {
    this.mergeWhitelistTeams = mergeWhitelistTeams;
  }

  public EditBranchProtectionOption mergeWhitelistUsernames(List<String> mergeWhitelistUsernames) {
    this.mergeWhitelistUsernames = mergeWhitelistUsernames;
    return this;
  }

  public EditBranchProtectionOption addMergeWhitelistUsernamesItem(String mergeWhitelistUsernamesItem) {
    if (this.mergeWhitelistUsernames == null) {
      this.mergeWhitelistUsernames = new ArrayList<String>();
    }
    this.mergeWhitelistUsernames.add(mergeWhitelistUsernamesItem);
    return this;
  }

   /**
   * Get mergeWhitelistUsernames
   * @return mergeWhitelistUsernames
  **/
  @ApiModelProperty(value = "")
  public List<String> getMergeWhitelistUsernames() {
    return mergeWhitelistUsernames;
  }

  public void setMergeWhitelistUsernames(List<String> mergeWhitelistUsernames) {
    this.mergeWhitelistUsernames = mergeWhitelistUsernames;
  }

  public EditBranchProtectionOption protectedFilePatterns(String protectedFilePatterns) {
    this.protectedFilePatterns = protectedFilePatterns;
    return this;
  }

   /**
   * Get protectedFilePatterns
   * @return protectedFilePatterns
  **/
  @ApiModelProperty(value = "")
  public String getProtectedFilePatterns() {
    return protectedFilePatterns;
  }

  public void setProtectedFilePatterns(String protectedFilePatterns) {
    this.protectedFilePatterns = protectedFilePatterns;
  }

  public EditBranchProtectionOption pushWhitelistDeployKeys(Boolean pushWhitelistDeployKeys) {
    this.pushWhitelistDeployKeys = pushWhitelistDeployKeys;
    return this;
  }

   /**
   * Get pushWhitelistDeployKeys
   * @return pushWhitelistDeployKeys
  **/
  @ApiModelProperty(value = "")
  public Boolean isPushWhitelistDeployKeys() {
    return pushWhitelistDeployKeys;
  }

  public void setPushWhitelistDeployKeys(Boolean pushWhitelistDeployKeys) {
    this.pushWhitelistDeployKeys = pushWhitelistDeployKeys;
  }

  public EditBranchProtectionOption pushWhitelistTeams(List<String> pushWhitelistTeams) {
    this.pushWhitelistTeams = pushWhitelistTeams;
    return this;
  }

  public EditBranchProtectionOption addPushWhitelistTeamsItem(String pushWhitelistTeamsItem) {
    if (this.pushWhitelistTeams == null) {
      this.pushWhitelistTeams = new ArrayList<String>();
    }
    this.pushWhitelistTeams.add(pushWhitelistTeamsItem);
    return this;
  }

   /**
   * Get pushWhitelistTeams
   * @return pushWhitelistTeams
  **/
  @ApiModelProperty(value = "")
  public List<String> getPushWhitelistTeams() {
    return pushWhitelistTeams;
  }

  public void setPushWhitelistTeams(List<String> pushWhitelistTeams) {
    this.pushWhitelistTeams = pushWhitelistTeams;
  }

  public EditBranchProtectionOption pushWhitelistUsernames(List<String> pushWhitelistUsernames) {
    this.pushWhitelistUsernames = pushWhitelistUsernames;
    return this;
  }

  public EditBranchProtectionOption addPushWhitelistUsernamesItem(String pushWhitelistUsernamesItem) {
    if (this.pushWhitelistUsernames == null) {
      this.pushWhitelistUsernames = new ArrayList<String>();
    }
    this.pushWhitelistUsernames.add(pushWhitelistUsernamesItem);
    return this;
  }

   /**
   * Get pushWhitelistUsernames
   * @return pushWhitelistUsernames
  **/
  @ApiModelProperty(value = "")
  public List<String> getPushWhitelistUsernames() {
    return pushWhitelistUsernames;
  }

  public void setPushWhitelistUsernames(List<String> pushWhitelistUsernames) {
    this.pushWhitelistUsernames = pushWhitelistUsernames;
  }

  public EditBranchProtectionOption requireSignedCommits(Boolean requireSignedCommits) {
    this.requireSignedCommits = requireSignedCommits;
    return this;
  }

   /**
   * Get requireSignedCommits
   * @return requireSignedCommits
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireSignedCommits() {
    return requireSignedCommits;
  }

  public void setRequireSignedCommits(Boolean requireSignedCommits) {
    this.requireSignedCommits = requireSignedCommits;
  }

  public EditBranchProtectionOption requiredApprovals(Long requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * Get requiredApprovals
   * @return requiredApprovals
  **/
  @ApiModelProperty(value = "")
  public Long getRequiredApprovals() {
    return requiredApprovals;
  }

  public void setRequiredApprovals(Long requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }

  public EditBranchProtectionOption statusCheckContexts(List<String> statusCheckContexts) {
    this.statusCheckContexts = statusCheckContexts;
    return this;
  }

  public EditBranchProtectionOption addStatusCheckContextsItem(String statusCheckContextsItem) {
    if (this.statusCheckContexts == null) {
      this.statusCheckContexts = new ArrayList<String>();
    }
    this.statusCheckContexts.add(statusCheckContextsItem);
    return this;
  }

   /**
   * Get statusCheckContexts
   * @return statusCheckContexts
  **/
  @ApiModelProperty(value = "")
  public List<String> getStatusCheckContexts() {
    return statusCheckContexts;
  }

  public void setStatusCheckContexts(List<String> statusCheckContexts) {
    this.statusCheckContexts = statusCheckContexts;
  }

  public EditBranchProtectionOption unprotectedFilePatterns(String unprotectedFilePatterns) {
    this.unprotectedFilePatterns = unprotectedFilePatterns;
    return this;
  }

   /**
   * Get unprotectedFilePatterns
   * @return unprotectedFilePatterns
  **/
  @ApiModelProperty(value = "")
  public String getUnprotectedFilePatterns() {
    return unprotectedFilePatterns;
  }

  public void setUnprotectedFilePatterns(String unprotectedFilePatterns) {
    this.unprotectedFilePatterns = unprotectedFilePatterns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditBranchProtectionOption editBranchProtectionOption = (EditBranchProtectionOption) o;
    return Objects.equals(this.approvalsWhitelistTeams, editBranchProtectionOption.approvalsWhitelistTeams) &&
        Objects.equals(this.approvalsWhitelistUsername, editBranchProtectionOption.approvalsWhitelistUsername) &&
        Objects.equals(this.blockOnOfficialReviewRequests, editBranchProtectionOption.blockOnOfficialReviewRequests) &&
        Objects.equals(this.blockOnOutdatedBranch, editBranchProtectionOption.blockOnOutdatedBranch) &&
        Objects.equals(this.blockOnRejectedReviews, editBranchProtectionOption.blockOnRejectedReviews) &&
        Objects.equals(this.dismissStaleApprovals, editBranchProtectionOption.dismissStaleApprovals) &&
        Objects.equals(this.enableApprovalsWhitelist, editBranchProtectionOption.enableApprovalsWhitelist) &&
        Objects.equals(this.enableMergeWhitelist, editBranchProtectionOption.enableMergeWhitelist) &&
        Objects.equals(this.enablePush, editBranchProtectionOption.enablePush) &&
        Objects.equals(this.enablePushWhitelist, editBranchProtectionOption.enablePushWhitelist) &&
        Objects.equals(this.enableStatusCheck, editBranchProtectionOption.enableStatusCheck) &&
        Objects.equals(this.mergeWhitelistTeams, editBranchProtectionOption.mergeWhitelistTeams) &&
        Objects.equals(this.mergeWhitelistUsernames, editBranchProtectionOption.mergeWhitelistUsernames) &&
        Objects.equals(this.protectedFilePatterns, editBranchProtectionOption.protectedFilePatterns) &&
        Objects.equals(this.pushWhitelistDeployKeys, editBranchProtectionOption.pushWhitelistDeployKeys) &&
        Objects.equals(this.pushWhitelistTeams, editBranchProtectionOption.pushWhitelistTeams) &&
        Objects.equals(this.pushWhitelistUsernames, editBranchProtectionOption.pushWhitelistUsernames) &&
        Objects.equals(this.requireSignedCommits, editBranchProtectionOption.requireSignedCommits) &&
        Objects.equals(this.requiredApprovals, editBranchProtectionOption.requiredApprovals) &&
        Objects.equals(this.statusCheckContexts, editBranchProtectionOption.statusCheckContexts) &&
        Objects.equals(this.unprotectedFilePatterns, editBranchProtectionOption.unprotectedFilePatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalsWhitelistTeams, approvalsWhitelistUsername, blockOnOfficialReviewRequests, blockOnOutdatedBranch, blockOnRejectedReviews, dismissStaleApprovals, enableApprovalsWhitelist, enableMergeWhitelist, enablePush, enablePushWhitelist, enableStatusCheck, mergeWhitelistTeams, mergeWhitelistUsernames, protectedFilePatterns, pushWhitelistDeployKeys, pushWhitelistTeams, pushWhitelistUsernames, requireSignedCommits, requiredApprovals, statusCheckContexts, unprotectedFilePatterns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditBranchProtectionOption {\n");
    
    sb.append("    approvalsWhitelistTeams: ").append(toIndentedString(approvalsWhitelistTeams)).append("\n");
    sb.append("    approvalsWhitelistUsername: ").append(toIndentedString(approvalsWhitelistUsername)).append("\n");
    sb.append("    blockOnOfficialReviewRequests: ").append(toIndentedString(blockOnOfficialReviewRequests)).append("\n");
    sb.append("    blockOnOutdatedBranch: ").append(toIndentedString(blockOnOutdatedBranch)).append("\n");
    sb.append("    blockOnRejectedReviews: ").append(toIndentedString(blockOnRejectedReviews)).append("\n");
    sb.append("    dismissStaleApprovals: ").append(toIndentedString(dismissStaleApprovals)).append("\n");
    sb.append("    enableApprovalsWhitelist: ").append(toIndentedString(enableApprovalsWhitelist)).append("\n");
    sb.append("    enableMergeWhitelist: ").append(toIndentedString(enableMergeWhitelist)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    enablePushWhitelist: ").append(toIndentedString(enablePushWhitelist)).append("\n");
    sb.append("    enableStatusCheck: ").append(toIndentedString(enableStatusCheck)).append("\n");
    sb.append("    mergeWhitelistTeams: ").append(toIndentedString(mergeWhitelistTeams)).append("\n");
    sb.append("    mergeWhitelistUsernames: ").append(toIndentedString(mergeWhitelistUsernames)).append("\n");
    sb.append("    protectedFilePatterns: ").append(toIndentedString(protectedFilePatterns)).append("\n");
    sb.append("    pushWhitelistDeployKeys: ").append(toIndentedString(pushWhitelistDeployKeys)).append("\n");
    sb.append("    pushWhitelistTeams: ").append(toIndentedString(pushWhitelistTeams)).append("\n");
    sb.append("    pushWhitelistUsernames: ").append(toIndentedString(pushWhitelistUsernames)).append("\n");
    sb.append("    requireSignedCommits: ").append(toIndentedString(requireSignedCommits)).append("\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    statusCheckContexts: ").append(toIndentedString(statusCheckContexts)).append("\n");
    sb.append("    unprotectedFilePatterns: ").append(toIndentedString(unprotectedFilePatterns)).append("\n");
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

