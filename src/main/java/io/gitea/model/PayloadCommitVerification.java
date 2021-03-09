/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.14.0&#43;dev-803-gf1da46622
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
import io.gitea.model.PayloadUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayloadCommitVerification represents the GPG verification of a commit
 */
@ApiModel(description = "PayloadCommitVerification represents the GPG verification of a commit")

public class PayloadCommitVerification {
  @SerializedName("payload")
  private String payload = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("signer")
  private PayloadUser signer = null;

  @SerializedName("verified")
  private Boolean verified = null;

  public PayloadCommitVerification payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public PayloadCommitVerification reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PayloadCommitVerification signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public PayloadCommitVerification signer(PayloadUser signer) {
    this.signer = signer;
    return this;
  }

   /**
   * Get signer
   * @return signer
  **/
  @ApiModelProperty(value = "")
  public PayloadUser getSigner() {
    return signer;
  }

  public void setSigner(PayloadUser signer) {
    this.signer = signer;
  }

  public PayloadCommitVerification verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(value = "")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadCommitVerification payloadCommitVerification = (PayloadCommitVerification) o;
    return Objects.equals(this.payload, payloadCommitVerification.payload) &&
        Objects.equals(this.reason, payloadCommitVerification.reason) &&
        Objects.equals(this.signature, payloadCommitVerification.signature) &&
        Objects.equals(this.signer, payloadCommitVerification.signer) &&
        Objects.equals(this.verified, payloadCommitVerification.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, reason, signature, signer, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadCommitVerification {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

