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
import com.plaid.client.model.AccountAccess;
import com.plaid.client.model.ProductAccess;
import com.plaid.client.model.Scopes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The scopes object
 */
@ApiModel(description = "The scopes object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T15:14:57.000385Z[Etc/UTC]")
public class ScopesNullable {
  public static final String SERIALIZED_NAME_PRODUCT_ACCESS = "product_access";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ACCESS)
  private ProductAccess productAccess;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountAccess> accounts = null;

  public static final String SERIALIZED_NAME_NEW_ACCOUNTS = "new_accounts";
  @SerializedName(SERIALIZED_NAME_NEW_ACCOUNTS)
  private Boolean newAccounts = true;


  public ScopesNullable productAccess(ProductAccess productAccess) {
    
    this.productAccess = productAccess;
    return this;
  }

   /**
   * Get productAccess
   * @return productAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductAccess getProductAccess() {
    return productAccess;
  }


  public void setProductAccess(ProductAccess productAccess) {
    this.productAccess = productAccess;
  }


  public ScopesNullable accounts(List<AccountAccess> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public ScopesNullable addAccountsItem(AccountAccess accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountAccess> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountAccess> accounts) {
    this.accounts = accounts;
  }


  public ScopesNullable newAccounts(Boolean newAccounts) {
    
    this.newAccounts = newAccounts;
    return this;
  }

   /**
   * Allow access to newly opened accounts as they are opened. If unset, defaults to &#x60;true&#x60;.
   * @return newAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to newly opened accounts as they are opened. If unset, defaults to `true`.")

  public Boolean getNewAccounts() {
    return newAccounts;
  }


  public void setNewAccounts(Boolean newAccounts) {
    this.newAccounts = newAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopesNullable scopesNullable = (ScopesNullable) o;
    return Objects.equals(this.productAccess, scopesNullable.productAccess) &&
        Objects.equals(this.accounts, scopesNullable.accounts) &&
        Objects.equals(this.newAccounts, scopesNullable.newAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productAccess, accounts, newAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopesNullable {\n");
    sb.append("    productAccess: ").append(toIndentedString(productAccess)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    newAccounts: ").append(toIndentedString(newAccounts)).append("\n");
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

