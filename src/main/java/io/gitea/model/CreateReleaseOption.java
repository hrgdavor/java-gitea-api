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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateReleaseOption options when creating a release
 */
@ApiModel(description = "CreateReleaseOption options when creating a release")

public class CreateReleaseOption {
  @SerializedName("body")
  private String body = null;

  @SerializedName("draft")
  private Boolean draft = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prerelease")
  private Boolean prerelease = null;

  @SerializedName("tag_name")
  private String tagName = null;

  @SerializedName("target_commitish")
  private String targetCommitish = null;

  public CreateReleaseOption body(String body) {
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

  public CreateReleaseOption draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/
  @ApiModelProperty(value = "")
  public Boolean isDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public CreateReleaseOption name(String name) {
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

  public CreateReleaseOption prerelease(Boolean prerelease) {
    this.prerelease = prerelease;
    return this;
  }

   /**
   * Get prerelease
   * @return prerelease
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrerelease() {
    return prerelease;
  }

  public void setPrerelease(Boolean prerelease) {
    this.prerelease = prerelease;
  }

  public CreateReleaseOption tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public CreateReleaseOption targetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
    return this;
  }

   /**
   * Get targetCommitish
   * @return targetCommitish
  **/
  @ApiModelProperty(value = "")
  public String getTargetCommitish() {
    return targetCommitish;
  }

  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReleaseOption createReleaseOption = (CreateReleaseOption) o;
    return Objects.equals(this.body, createReleaseOption.body) &&
        Objects.equals(this.draft, createReleaseOption.draft) &&
        Objects.equals(this.name, createReleaseOption.name) &&
        Objects.equals(this.prerelease, createReleaseOption.prerelease) &&
        Objects.equals(this.tagName, createReleaseOption.tagName) &&
        Objects.equals(this.targetCommitish, createReleaseOption.targetCommitish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, draft, name, prerelease, tagName, targetCommitish);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReleaseOption {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prerelease: ").append(toIndentedString(prerelease)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    targetCommitish: ").append(toIndentedString(targetCommitish)).append("\n");
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

