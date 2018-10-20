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
import io.gitea.model.Repository;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchResults results of a successful search
 */
@ApiModel(description = "SearchResults results of a successful search")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-20T18:39:27.321+01:00")
public class SearchResults {
  @SerializedName("data")
  private List<Repository> data = null;

  @SerializedName("ok")
  private Boolean ok = null;

  public SearchResults data(List<Repository> data) {
    this.data = data;
    return this;
  }

  public SearchResults addDataItem(Repository dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Repository>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<Repository> getData() {
    return data;
  }

  public void setData(List<Repository> data) {
    this.data = data;
  }

  public SearchResults ok(Boolean ok) {
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @ApiModelProperty(value = "")
  public Boolean isOk() {
    return ok;
  }

  public void setOk(Boolean ok) {
    this.ok = ok;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.data, searchResults.data) &&
        Objects.equals(this.ok, searchResults.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, ok);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResults {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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

