/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.61.0
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
import com.plaid.client.model.WalletTransactionCounterpartyBACS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The counterparty&#39;s bank account numbers
 */
@ApiModel(description = "The counterparty's bank account numbers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-05T21:41:29.826Z[GMT]")
public class WalletTransactionCounterpartyNumbers {
  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private WalletTransactionCounterpartyBACS bacs = null;


  public WalletTransactionCounterpartyNumbers bacs(WalletTransactionCounterpartyBACS bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionCounterpartyBACS getBacs() {
    return bacs;
  }


  public void setBacs(WalletTransactionCounterpartyBACS bacs) {
    this.bacs = bacs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionCounterpartyNumbers walletTransactionCounterpartyNumbers = (WalletTransactionCounterpartyNumbers) o;
    return Objects.equals(this.bacs, walletTransactionCounterpartyNumbers.bacs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bacs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCounterpartyNumbers {\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
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

