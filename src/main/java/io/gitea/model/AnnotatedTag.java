/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.16.0-SNAPSHOT
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
import io.gitea.model.AnnotatedTagObject;
import io.gitea.model.CommitUser;
import io.gitea.model.PayloadCommitVerification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AnnotatedTag represents an annotated tag
 */
@ApiModel(description = "AnnotatedTag represents an annotated tag")

public class AnnotatedTag {
  @SerializedName("message")
  private String message = null;

  @SerializedName("object")
  private AnnotatedTagObject object = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("tagger")
  private CommitUser tagger = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("verification")
  private PayloadCommitVerification verification = null;

  public AnnotatedTag message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AnnotatedTag object(AnnotatedTagObject object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(value = "")
  public AnnotatedTagObject getObject() {
    return object;
  }

  public void setObject(AnnotatedTagObject object) {
    this.object = object;
  }

  public AnnotatedTag sha(String sha) {
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

  public AnnotatedTag tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public AnnotatedTag tagger(CommitUser tagger) {
    this.tagger = tagger;
    return this;
  }

   /**
   * Get tagger
   * @return tagger
  **/
  @ApiModelProperty(value = "")
  public CommitUser getTagger() {
    return tagger;
  }

  public void setTagger(CommitUser tagger) {
    this.tagger = tagger;
  }

  public AnnotatedTag url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AnnotatedTag verification(PayloadCommitVerification verification) {
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @ApiModelProperty(value = "")
  public PayloadCommitVerification getVerification() {
    return verification;
  }

  public void setVerification(PayloadCommitVerification verification) {
    this.verification = verification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedTag annotatedTag = (AnnotatedTag) o;
    return Objects.equals(this.message, annotatedTag.message) &&
        Objects.equals(this.object, annotatedTag.object) &&
        Objects.equals(this.sha, annotatedTag.sha) &&
        Objects.equals(this.tag, annotatedTag.tag) &&
        Objects.equals(this.tagger, annotatedTag.tagger) &&
        Objects.equals(this.url, annotatedTag.url) &&
        Objects.equals(this.verification, annotatedTag.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, object, sha, tag, tagger, url, verification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedTag {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tagger: ").append(toIndentedString(tagger)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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

