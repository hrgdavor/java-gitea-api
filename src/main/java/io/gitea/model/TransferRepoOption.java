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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransferRepoOption options when transfer a repository&#39;s ownership
 */
@ApiModel(description = "TransferRepoOption options when transfer a repository's ownership")

public class TransferRepoOption {
  @SerializedName("new_owner")
  private String newOwner = null;

  @SerializedName("team_ids")
  private List<Long> teamIds = null;

  public TransferRepoOption newOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

   /**
   * Get newOwner
   * @return newOwner
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNewOwner() {
    return newOwner;
  }

  public void setNewOwner(String newOwner) {
    this.newOwner = newOwner;
  }

  public TransferRepoOption teamIds(List<Long> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public TransferRepoOption addTeamIdsItem(Long teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<Long>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
   * @return teamIds
  **/
  @ApiModelProperty(value = "ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.")
  public List<Long> getTeamIds() {
    return teamIds;
  }

  public void setTeamIds(List<Long> teamIds) {
    this.teamIds = teamIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRepoOption transferRepoOption = (TransferRepoOption) o;
    return Objects.equals(this.newOwner, transferRepoOption.newOwner) &&
        Objects.equals(this.teamIds, transferRepoOption.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner, teamIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRepoOption {\n");
    
    sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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

