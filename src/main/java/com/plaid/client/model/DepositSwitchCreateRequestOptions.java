/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
import java.util.ArrayList;
import java.util.List;

/**
 * Options to configure the &#x60;/deposit_switch/create&#x60; request. If provided, cannot be &#x60;null&#x60;.
 */
@ApiModel(description = "Options to configure the `/deposit_switch/create` request. If provided, cannot be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T15:14:57.000385Z[Etc/UTC]")
public class DepositSwitchCreateRequestOptions {
  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_TRANSACTION_ITEM_ACCESS_TOKENS = "transaction_item_access_tokens";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ITEM_ACCESS_TOKENS)
  private List<String> transactionItemAccessTokens = null;


  public DepositSwitchCreateRequestOptions webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The URL registered to receive webhooks when the status of a deposit switch request has changed. 
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL registered to receive webhooks when the status of a deposit switch request has changed. ")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public DepositSwitchCreateRequestOptions transactionItemAccessTokens(List<String> transactionItemAccessTokens) {
    
    this.transactionItemAccessTokens = transactionItemAccessTokens;
    return this;
  }

  public DepositSwitchCreateRequestOptions addTransactionItemAccessTokensItem(String transactionItemAccessTokensItem) {
    if (this.transactionItemAccessTokens == null) {
      this.transactionItemAccessTokens = new ArrayList<>();
    }
    this.transactionItemAccessTokens.add(transactionItemAccessTokensItem);
    return this;
  }

   /**
   * An array of access tokens corresponding to transaction items to use when attempting to match the user to their Payroll Provider. These tokens must be created by the same client id as the one creating the switch, and have access to the transactions product.
   * @return transactionItemAccessTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of access tokens corresponding to transaction items to use when attempting to match the user to their Payroll Provider. These tokens must be created by the same client id as the one creating the switch, and have access to the transactions product.")

  public List<String> getTransactionItemAccessTokens() {
    return transactionItemAccessTokens;
  }


  public void setTransactionItemAccessTokens(List<String> transactionItemAccessTokens) {
    this.transactionItemAccessTokens = transactionItemAccessTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSwitchCreateRequestOptions depositSwitchCreateRequestOptions = (DepositSwitchCreateRequestOptions) o;
    return Objects.equals(this.webhook, depositSwitchCreateRequestOptions.webhook) &&
        Objects.equals(this.transactionItemAccessTokens, depositSwitchCreateRequestOptions.transactionItemAccessTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook, transactionItemAccessTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchCreateRequestOptions {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    transactionItemAccessTokens: ").append(toIndentedString(transactionItemAccessTokens)).append("\n");
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

