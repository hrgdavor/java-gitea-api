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

/**
 * GenerateRepoOption options when creating repository using a template
 */
@ApiModel(description = "GenerateRepoOption options when creating repository using a template")

public class GenerateRepoOption {
  @SerializedName("avatar")
  private Boolean avatar = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("git_content")
  private Boolean gitContent = null;

  @SerializedName("git_hooks")
  private Boolean gitHooks = null;

  @SerializedName("labels")
  private Boolean labels = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("topics")
  private Boolean topics = null;

  @SerializedName("webhooks")
  private Boolean webhooks = null;

  public GenerateRepoOption avatar(Boolean avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * include avatar of the template repo
   * @return avatar
  **/
  @ApiModelProperty(value = "include avatar of the template repo")
  public Boolean isAvatar() {
    return avatar;
  }

  public void setAvatar(Boolean avatar) {
    this.avatar = avatar;
  }

  public GenerateRepoOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the repository to create
   * @return description
  **/
  @ApiModelProperty(value = "Description of the repository to create")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GenerateRepoOption gitContent(Boolean gitContent) {
    this.gitContent = gitContent;
    return this;
  }

   /**
   * include git content of default branch in template repo
   * @return gitContent
  **/
  @ApiModelProperty(value = "include git content of default branch in template repo")
  public Boolean isGitContent() {
    return gitContent;
  }

  public void setGitContent(Boolean gitContent) {
    this.gitContent = gitContent;
  }

  public GenerateRepoOption gitHooks(Boolean gitHooks) {
    this.gitHooks = gitHooks;
    return this;
  }

   /**
   * include git hooks in template repo
   * @return gitHooks
  **/
  @ApiModelProperty(value = "include git hooks in template repo")
  public Boolean isGitHooks() {
    return gitHooks;
  }

  public void setGitHooks(Boolean gitHooks) {
    this.gitHooks = gitHooks;
  }

  public GenerateRepoOption labels(Boolean labels) {
    this.labels = labels;
    return this;
  }

   /**
   * include labels in template repo
   * @return labels
  **/
  @ApiModelProperty(value = "include labels in template repo")
  public Boolean isLabels() {
    return labels;
  }

  public void setLabels(Boolean labels) {
    this.labels = labels;
  }

  public GenerateRepoOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the repository to create
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the repository to create")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenerateRepoOption owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The organization or person who will own the new repository
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "The organization or person who will own the new repository")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public GenerateRepoOption _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether the repository is private
   * @return _private
  **/
  @ApiModelProperty(value = "Whether the repository is private")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public GenerateRepoOption topics(Boolean topics) {
    this.topics = topics;
    return this;
  }

   /**
   * include topics in template repo
   * @return topics
  **/
  @ApiModelProperty(value = "include topics in template repo")
  public Boolean isTopics() {
    return topics;
  }

  public void setTopics(Boolean topics) {
    this.topics = topics;
  }

  public GenerateRepoOption webhooks(Boolean webhooks) {
    this.webhooks = webhooks;
    return this;
  }

   /**
   * include webhooks in template repo
   * @return webhooks
  **/
  @ApiModelProperty(value = "include webhooks in template repo")
  public Boolean isWebhooks() {
    return webhooks;
  }

  public void setWebhooks(Boolean webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateRepoOption generateRepoOption = (GenerateRepoOption) o;
    return Objects.equals(this.avatar, generateRepoOption.avatar) &&
        Objects.equals(this.description, generateRepoOption.description) &&
        Objects.equals(this.gitContent, generateRepoOption.gitContent) &&
        Objects.equals(this.gitHooks, generateRepoOption.gitHooks) &&
        Objects.equals(this.labels, generateRepoOption.labels) &&
        Objects.equals(this.name, generateRepoOption.name) &&
        Objects.equals(this.owner, generateRepoOption.owner) &&
        Objects.equals(this._private, generateRepoOption._private) &&
        Objects.equals(this.topics, generateRepoOption.topics) &&
        Objects.equals(this.webhooks, generateRepoOption.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, description, gitContent, gitHooks, labels, name, owner, _private, topics, webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateRepoOption {\n");
    
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gitContent: ").append(toIndentedString(gitContent)).append("\n");
    sb.append("    gitHooks: ").append(toIndentedString(gitHooks)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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

