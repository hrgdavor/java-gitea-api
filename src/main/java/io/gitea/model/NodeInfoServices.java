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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeInfoServices contains the third party sites this server can connect to via their application API
 */
@ApiModel(description = "NodeInfoServices contains the third party sites this server can connect to via their application API")

public class NodeInfoServices {
  @SerializedName("inbound")
  private List<String> inbound = null;

  @SerializedName("outbound")
  private List<String> outbound = null;

  public NodeInfoServices inbound(List<String> inbound) {
    this.inbound = inbound;
    return this;
  }

  public NodeInfoServices addInboundItem(String inboundItem) {
    if (this.inbound == null) {
      this.inbound = new ArrayList<String>();
    }
    this.inbound.add(inboundItem);
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @ApiModelProperty(value = "")
  public List<String> getInbound() {
    return inbound;
  }

  public void setInbound(List<String> inbound) {
    this.inbound = inbound;
  }

  public NodeInfoServices outbound(List<String> outbound) {
    this.outbound = outbound;
    return this;
  }

  public NodeInfoServices addOutboundItem(String outboundItem) {
    if (this.outbound == null) {
      this.outbound = new ArrayList<String>();
    }
    this.outbound.add(outboundItem);
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @ApiModelProperty(value = "")
  public List<String> getOutbound() {
    return outbound;
  }

  public void setOutbound(List<String> outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfoServices nodeInfoServices = (NodeInfoServices) o;
    return Objects.equals(this.inbound, nodeInfoServices.inbound) &&
        Objects.equals(this.outbound, nodeInfoServices.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inbound, outbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfoServices {\n");
    
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

