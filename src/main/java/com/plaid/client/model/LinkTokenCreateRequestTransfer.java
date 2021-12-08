/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.56.0
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
 * Specifies options for initializing Link for use with the Transfer product.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Transfer product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T22:16:01.337Z[GMT]")
public class LinkTokenCreateRequestTransfer {
  public static final String SERIALIZED_NAME_INTENT_ID = "intent_id";
  @SerializedName(SERIALIZED_NAME_INTENT_ID)
  private String intentId;


  public LinkTokenCreateRequestTransfer intentId(String intentId) {
    
    this.intentId = intentId;
    return this;
  }

   /**
   * The &#x60;id&#x60; returned by the &#x60;/transfer/intent/create&#x60; endpoint.
   * @return intentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `id` returned by the `/transfer/intent/create` endpoint.")

  public String getIntentId() {
    return intentId;
  }


  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestTransfer linkTokenCreateRequestTransfer = (LinkTokenCreateRequestTransfer) o;
    return Objects.equals(this.intentId, linkTokenCreateRequestTransfer.intentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestTransfer {\n");
    sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
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

