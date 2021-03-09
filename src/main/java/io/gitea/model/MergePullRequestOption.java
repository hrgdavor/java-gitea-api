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
 * MergePullRequestForm form for merging Pull Request
 */
@ApiModel(description = "MergePullRequestForm form for merging Pull Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T09:45:04.520Z")
public class MergePullRequestOption {
  /**
   * Gets or Sets _do
   */
  @JsonAdapter(DoEnum.Adapter.class)
  public enum DoEnum {
    MERGE("merge"),
    
    REBASE("rebase"),
    
    REBASE_MERGE("rebase-merge"),
    
    SQUASH("squash");

    private String value;

    DoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DoEnum fromValue(String text) {
      for (DoEnum b : DoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Do")
  private DoEnum _do = null;

  @SerializedName("MergeMessageField")
  private String mergeMessageField = null;

  @SerializedName("MergeTitleField")
  private String mergeTitleField = null;

  @SerializedName("force_merge")
  private Boolean forceMerge = null;

  public MergePullRequestOption _do(DoEnum _do) {
    this._do = _do;
    return this;
  }

   /**
   * Get _do
   * @return _do
  **/
  @ApiModelProperty(required = true, value = "")
  public DoEnum getDo() {
    return _do;
  }

  public void setDo(DoEnum _do) {
    this._do = _do;
  }

  public MergePullRequestOption mergeMessageField(String mergeMessageField) {
    this.mergeMessageField = mergeMessageField;
    return this;
  }

   /**
   * Get mergeMessageField
   * @return mergeMessageField
  **/
  @ApiModelProperty(value = "")
  public String getMergeMessageField() {
    return mergeMessageField;
  }

  public void setMergeMessageField(String mergeMessageField) {
    this.mergeMessageField = mergeMessageField;
  }

  public MergePullRequestOption mergeTitleField(String mergeTitleField) {
    this.mergeTitleField = mergeTitleField;
    return this;
  }

   /**
   * Get mergeTitleField
   * @return mergeTitleField
  **/
  @ApiModelProperty(value = "")
  public String getMergeTitleField() {
    return mergeTitleField;
  }

  public void setMergeTitleField(String mergeTitleField) {
    this.mergeTitleField = mergeTitleField;
  }

  public MergePullRequestOption forceMerge(Boolean forceMerge) {
    this.forceMerge = forceMerge;
    return this;
  }

   /**
   * Get forceMerge
   * @return forceMerge
  **/
  @ApiModelProperty(value = "")
  public Boolean isForceMerge() {
    return forceMerge;
  }

  public void setForceMerge(Boolean forceMerge) {
    this.forceMerge = forceMerge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergePullRequestOption mergePullRequestOption = (MergePullRequestOption) o;
    return Objects.equals(this._do, mergePullRequestOption._do) &&
        Objects.equals(this.mergeMessageField, mergePullRequestOption.mergeMessageField) &&
        Objects.equals(this.mergeTitleField, mergePullRequestOption.mergeTitleField) &&
        Objects.equals(this.forceMerge, mergePullRequestOption.forceMerge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_do, mergeMessageField, mergeTitleField, forceMerge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergePullRequestOption {\n");
    
    sb.append("    _do: ").append(toIndentedString(_do)).append("\n");
    sb.append("    mergeMessageField: ").append(toIndentedString(mergeMessageField)).append("\n");
    sb.append("    mergeTitleField: ").append(toIndentedString(mergeTitleField)).append("\n");
    sb.append("    forceMerge: ").append(toIndentedString(forceMerge)).append("\n");
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

