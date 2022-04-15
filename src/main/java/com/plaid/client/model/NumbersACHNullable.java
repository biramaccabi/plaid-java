/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.97.0
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
import com.plaid.client.model.NumbersACH;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Identifying information for transferring money to or from a US account via ACH or wire transfer.
 */
@ApiModel(description = "Identifying information for transferring money to or from a US account via ACH or wire transfer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-15T01:32:54.341913Z[Etc/UTC]")
public class NumbersACHNullable {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_ROUTING = "routing";
  @SerializedName(SERIALIZED_NAME_ROUTING)
  private String routing;

  public static final String SERIALIZED_NAME_WIRE_ROUTING = "wire_routing";
  @SerializedName(SERIALIZED_NAME_WIRE_ROUTING)
  private String wireRouting;


  public NumbersACHNullable accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid account ID associated with the account numbers
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid account ID associated with the account numbers")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public NumbersACHNullable account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The ACH account number for the account.  Note that when using OAuth with Chase Bank (&#x60;ins_56&#x60;), Chase will issue \&quot;tokenized\&quot; routing and account numbers, which are not the user&#39;s actual account and routing numbers. These tokenized numbers should work identically to normal account and routing numbers. The digits returned in the &#x60;mask&#x60; field will continue to reflect the actual account number, rather than the tokenized account number; for this reason, when displaying account numbers to the user to help them identify their account in your UI, always use the &#x60;mask&#x60; rather than truncating the &#x60;account&#x60; number. If a user revokes their permissions to your app, the tokenized numbers will continue to work for ACH deposits, but not withdrawals.
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The ACH account number for the account.  Note that when using OAuth with Chase Bank (`ins_56`), Chase will issue \"tokenized\" routing and account numbers, which are not the user's actual account and routing numbers. These tokenized numbers should work identically to normal account and routing numbers. The digits returned in the `mask` field will continue to reflect the actual account number, rather than the tokenized account number; for this reason, when displaying account numbers to the user to help them identify their account in your UI, always use the `mask` rather than truncating the `account` number. If a user revokes their permissions to your app, the tokenized numbers will continue to work for ACH deposits, but not withdrawals.")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public NumbersACHNullable routing(String routing) {
    
    this.routing = routing;
    return this;
  }

   /**
   * The ACH routing number for the account. If the institution is &#x60;ins_56&#x60;, this may be a tokenized routing number. For more information, see the description of the &#x60;account&#x60; field.
   * @return routing
  **/
  @ApiModelProperty(required = true, value = "The ACH routing number for the account. If the institution is `ins_56`, this may be a tokenized routing number. For more information, see the description of the `account` field.")

  public String getRouting() {
    return routing;
  }


  public void setRouting(String routing) {
    this.routing = routing;
  }


  public NumbersACHNullable wireRouting(String wireRouting) {
    
    this.wireRouting = wireRouting;
    return this;
  }

   /**
   * The wire transfer routing number for the account, if available
   * @return wireRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The wire transfer routing number for the account, if available")

  public String getWireRouting() {
    return wireRouting;
  }


  public void setWireRouting(String wireRouting) {
    this.wireRouting = wireRouting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersACHNullable numbersACHNullable = (NumbersACHNullable) o;
    return Objects.equals(this.accountId, numbersACHNullable.accountId) &&
        Objects.equals(this.account, numbersACHNullable.account) &&
        Objects.equals(this.routing, numbersACHNullable.routing) &&
        Objects.equals(this.wireRouting, numbersACHNullable.wireRouting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, account, routing, wireRouting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersACHNullable {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    wireRouting: ").append(toIndentedString(wireRouting)).append("\n");
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

