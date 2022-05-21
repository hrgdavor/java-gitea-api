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
import io.gitea.model.WikiCommit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WikiPageMetaData wiki page meta information
 */
@ApiModel(description = "WikiPageMetaData wiki page meta information")

public class WikiPageMetaData {
  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("last_commit")
  private WikiCommit lastCommit = null;

  @SerializedName("sub_url")
  private String subUrl = null;

  @SerializedName("title")
  private String title = null;

  public WikiPageMetaData htmlUrl(String htmlUrl) {
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

  public WikiPageMetaData lastCommit(WikiCommit lastCommit) {
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @ApiModelProperty(value = "")
  public WikiCommit getLastCommit() {
    return lastCommit;
  }

  public void setLastCommit(WikiCommit lastCommit) {
    this.lastCommit = lastCommit;
  }

  public WikiPageMetaData subUrl(String subUrl) {
    this.subUrl = subUrl;
    return this;
  }

   /**
   * Get subUrl
   * @return subUrl
  **/
  @ApiModelProperty(value = "")
  public String getSubUrl() {
    return subUrl;
  }

  public void setSubUrl(String subUrl) {
    this.subUrl = subUrl;
  }

  public WikiPageMetaData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiPageMetaData wikiPageMetaData = (WikiPageMetaData) o;
    return Objects.equals(this.htmlUrl, wikiPageMetaData.htmlUrl) &&
        Objects.equals(this.lastCommit, wikiPageMetaData.lastCommit) &&
        Objects.equals(this.subUrl, wikiPageMetaData.subUrl) &&
        Objects.equals(this.title, wikiPageMetaData.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlUrl, lastCommit, subUrl, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiPageMetaData {\n");
    
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
    sb.append("    subUrl: ").append(toIndentedString(subUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

