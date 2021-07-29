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
 * MarkdownOption markdown options
 */
@ApiModel(description = "MarkdownOption markdown options")

public class MarkdownOption {
  @SerializedName("Context")
  private String context = null;

  @SerializedName("Mode")
  private String mode = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Wiki")
  private Boolean wiki = null;

  public MarkdownOption context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Context to render  in: body
   * @return context
  **/
  @ApiModelProperty(value = "Context to render  in: body")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public MarkdownOption mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Mode to render  in: body
   * @return mode
  **/
  @ApiModelProperty(value = "Mode to render  in: body")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public MarkdownOption text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text markdown to render  in: body
   * @return text
  **/
  @ApiModelProperty(value = "Text markdown to render  in: body")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MarkdownOption wiki(Boolean wiki) {
    this.wiki = wiki;
    return this;
  }

   /**
   * Is it a wiki page ?  in: body
   * @return wiki
  **/
  @ApiModelProperty(value = "Is it a wiki page ?  in: body")
  public Boolean isWiki() {
    return wiki;
  }

  public void setWiki(Boolean wiki) {
    this.wiki = wiki;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkdownOption markdownOption = (MarkdownOption) o;
    return Objects.equals(this.context, markdownOption.context) &&
        Objects.equals(this.mode, markdownOption.mode) &&
        Objects.equals(this.text, markdownOption.text) &&
        Objects.equals(this.wiki, markdownOption.wiki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, mode, text, wiki);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkdownOption {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    wiki: ").append(toIndentedString(wiki)).append("\n");
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

