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
import java.util.ArrayList;
import java.util.List;

/**
 * EditTeamOption options for editing a team
 */
@ApiModel(description = "EditTeamOption options for editing a team")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T09:45:04.520Z")
public class EditTeamOption {
  @SerializedName("can_create_org_repo")
  private Boolean canCreateOrgRepo = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("includes_all_repositories")
  private Boolean includesAllRepositories = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets permission
   */
  @JsonAdapter(PermissionEnum.Adapter.class)
  public enum PermissionEnum {
    READ("read"),
    
    WRITE("write"),
    
    ADMIN("admin");

    private String value;

    PermissionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String text) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("permission")
  private PermissionEnum permission = null;

  @SerializedName("units")
  private List<String> units = null;

  public EditTeamOption canCreateOrgRepo(Boolean canCreateOrgRepo) {
    this.canCreateOrgRepo = canCreateOrgRepo;
    return this;
  }

   /**
   * Get canCreateOrgRepo
   * @return canCreateOrgRepo
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanCreateOrgRepo() {
    return canCreateOrgRepo;
  }

  public void setCanCreateOrgRepo(Boolean canCreateOrgRepo) {
    this.canCreateOrgRepo = canCreateOrgRepo;
  }

  public EditTeamOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditTeamOption includesAllRepositories(Boolean includesAllRepositories) {
    this.includesAllRepositories = includesAllRepositories;
    return this;
  }

   /**
   * Get includesAllRepositories
   * @return includesAllRepositories
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludesAllRepositories() {
    return includesAllRepositories;
  }

  public void setIncludesAllRepositories(Boolean includesAllRepositories) {
    this.includesAllRepositories = includesAllRepositories;
  }

  public EditTeamOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EditTeamOption permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(value = "")
  public PermissionEnum getPermission() {
    return permission;
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public EditTeamOption units(List<String> units) {
    this.units = units;
    return this;
  }

  public EditTeamOption addUnitsItem(String unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<String>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @ApiModelProperty(example = "[\"repo.code\",\"repo.issues\",\"repo.ext_issues\",\"repo.wiki\",\"repo.pulls\",\"repo.releases\",\"repo.ext_wiki\"]", value = "")
  public List<String> getUnits() {
    return units;
  }

  public void setUnits(List<String> units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditTeamOption editTeamOption = (EditTeamOption) o;
    return Objects.equals(this.canCreateOrgRepo, editTeamOption.canCreateOrgRepo) &&
        Objects.equals(this.description, editTeamOption.description) &&
        Objects.equals(this.includesAllRepositories, editTeamOption.includesAllRepositories) &&
        Objects.equals(this.name, editTeamOption.name) &&
        Objects.equals(this.permission, editTeamOption.permission) &&
        Objects.equals(this.units, editTeamOption.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCreateOrgRepo, description, includesAllRepositories, name, permission, units);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditTeamOption {\n");
    
    sb.append("    canCreateOrgRepo: ").append(toIndentedString(canCreateOrgRepo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includesAllRepositories: ").append(toIndentedString(includesAllRepositories)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

