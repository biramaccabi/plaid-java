/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.196.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

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
 * AssetReportAuditCopyCreateResponse defines the response schema for &#x60;/asset_report/audit_copy/get&#x60;
 */
@ApiModel(description = "AssetReportAuditCopyCreateResponse defines the response schema for `/asset_report/audit_copy/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T20:06:01.210619Z[Etc/UTC]")
public class AssetReportAuditCopyCreateResponse {
  public static final String SERIALIZED_NAME_AUDIT_COPY_TOKEN = "audit_copy_token";
  @SerializedName(SERIALIZED_NAME_AUDIT_COPY_TOKEN)
  private String auditCopyToken;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public AssetReportAuditCopyCreateResponse auditCopyToken(String auditCopyToken) {
    
    this.auditCopyToken = auditCopyToken;
    return this;
  }

   /**
   * A token that can be shared with a third party auditor to allow them to obtain access to the Asset Report. This token should be stored securely.
   * @return auditCopyToken
  **/
  @ApiModelProperty(required = true, value = "A token that can be shared with a third party auditor to allow them to obtain access to the Asset Report. This token should be stored securely.")

  public String getAuditCopyToken() {
    return auditCopyToken;
  }


  public void setAuditCopyToken(String auditCopyToken) {
    this.auditCopyToken = auditCopyToken;
  }


  public AssetReportAuditCopyCreateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportAuditCopyCreateResponse assetReportAuditCopyCreateResponse = (AssetReportAuditCopyCreateResponse) o;
    return Objects.equals(this.auditCopyToken, assetReportAuditCopyCreateResponse.auditCopyToken) &&
        Objects.equals(this.requestId, assetReportAuditCopyCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditCopyToken, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportAuditCopyCreateResponse {\n");
    sb.append("    auditCopyToken: ").append(toIndentedString(auditCopyToken)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

