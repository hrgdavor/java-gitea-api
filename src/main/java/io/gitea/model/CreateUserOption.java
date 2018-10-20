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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateUserOption create user options
 */
@ApiModel(description = "CreateUserOption create user options")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-20T18:39:27.321+01:00")
public class CreateUserOption {
  @SerializedName("email")
  private String email = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("login_name")
  private String loginName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("send_notify")
  private Boolean sendNotify = null;

  @SerializedName("source_id")
  private Long sourceId = null;

  @SerializedName("username")
  private String username = null;

  public CreateUserOption email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserOption fullName(String fullName) {
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

  public CreateUserOption loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }

   /**
   * Get loginName
   * @return loginName
  **/
  @ApiModelProperty(value = "")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public CreateUserOption password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateUserOption sendNotify(Boolean sendNotify) {
    this.sendNotify = sendNotify;
    return this;
  }

   /**
   * Get sendNotify
   * @return sendNotify
  **/
  @ApiModelProperty(value = "")
  public Boolean isSendNotify() {
    return sendNotify;
  }

  public void setSendNotify(Boolean sendNotify) {
    this.sendNotify = sendNotify;
  }

  public CreateUserOption sourceId(Long sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(value = "")
  public Long getSourceId() {
    return sourceId;
  }

  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }

  public CreateUserOption username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserOption createUserOption = (CreateUserOption) o;
    return Objects.equals(this.email, createUserOption.email) &&
        Objects.equals(this.fullName, createUserOption.fullName) &&
        Objects.equals(this.loginName, createUserOption.loginName) &&
        Objects.equals(this.password, createUserOption.password) &&
        Objects.equals(this.sendNotify, createUserOption.sendNotify) &&
        Objects.equals(this.sourceId, createUserOption.sourceId) &&
        Objects.equals(this.username, createUserOption.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fullName, loginName, password, sendNotify, sourceId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserOption {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sendNotify: ").append(toIndentedString(sendNotify)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

