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
import io.gitea.model.Repository;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PRBranchInfo information about a branch
 */
@ApiModel(description = "PRBranchInfo information about a branch")

public class PRBranchInfo {
  @SerializedName("label")
  private String label = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("repo")
  private Repository repo = null;

  @SerializedName("repo_id")
  private Long repoId = null;

  @SerializedName("sha")
  private String sha = null;

  public PRBranchInfo label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PRBranchInfo ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public PRBranchInfo repo(Repository repo) {
    this.repo = repo;
    return this;
  }

   /**
   * Get repo
   * @return repo
  **/
  @ApiModelProperty(value = "")
  public Repository getRepo() {
    return repo;
  }

  public void setRepo(Repository repo) {
    this.repo = repo;
  }

  public PRBranchInfo repoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

   /**
   * Get repoId
   * @return repoId
  **/
  @ApiModelProperty(value = "")
  public Long getRepoId() {
    return repoId;
  }

  public void setRepoId(Long repoId) {
    this.repoId = repoId;
  }

  public PRBranchInfo sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @ApiModelProperty(value = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PRBranchInfo prBranchInfo = (PRBranchInfo) o;
    return Objects.equals(this.label, prBranchInfo.label) &&
        Objects.equals(this.ref, prBranchInfo.ref) &&
        Objects.equals(this.repo, prBranchInfo.repo) &&
        Objects.equals(this.repoId, prBranchInfo.repoId) &&
        Objects.equals(this.sha, prBranchInfo.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, ref, repo, repoId, sha);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PRBranchInfo {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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

