/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.210.4
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
import java.math.BigDecimal;

/**
 * The resource ID and version number of the template configuring the behavior of a given identity verification.
 */
@ApiModel(description = "The resource ID and version number of the template configuring the behavior of a given identity verification.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:56:50.392048Z[Etc/UTC]")
public class IdentityVerificationTemplateReference {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Double version;


  public IdentityVerificationTemplateReference id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated Identity Verification template.
   * @return id
  **/
  @ApiModelProperty(example = "idvtmp_4FrXJvfQU3zGUR", required = true, value = "ID of the associated Identity Verification template.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IdentityVerificationTemplateReference version(Double version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the associated Identity Verification template.
   * @return version
  **/
  @ApiModelProperty(example = "2", required = true, value = "Version of the associated Identity Verification template.")

  public Double getVersion() {
    return version;
  }


  public void setVersion(Double version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationTemplateReference identityVerificationTemplateReference = (IdentityVerificationTemplateReference) o;
    return Objects.equals(this.id, identityVerificationTemplateReference.id) &&
        Objects.equals(this.version, identityVerificationTemplateReference.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationTemplateReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

