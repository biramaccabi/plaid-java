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

/**
 * User authentication parameters, for clients making a request without an &#x60;access_token&#x60;. This is only allowed for select clients and will not be supported in the future. Most clients should call /item/import to obtain an access token before making a request.
 */
@ApiModel(description = "User authentication parameters, for clients making a request without an `access_token`. This is only allowed for select clients and will not be supported in the future. Most clients should call /item/import to obtain an access token before making a request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T15:14:57.000385Z[Etc/UTC]")
public class ItemApplicationListUserAuth {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_FI_USERNAME_HASH = "fi_username_hash";
  @SerializedName(SERIALIZED_NAME_FI_USERNAME_HASH)
  private String fiUsernameHash;


  public ItemApplicationListUserAuth userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Account username.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account username.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ItemApplicationListUserAuth fiUsernameHash(String fiUsernameHash) {
    
    this.fiUsernameHash = fiUsernameHash;
    return this;
  }

   /**
   * Account username hashed by FI.
   * @return fiUsernameHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account username hashed by FI.")

  public String getFiUsernameHash() {
    return fiUsernameHash;
  }


  public void setFiUsernameHash(String fiUsernameHash) {
    this.fiUsernameHash = fiUsernameHash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemApplicationListUserAuth itemApplicationListUserAuth = (ItemApplicationListUserAuth) o;
    return Objects.equals(this.userId, itemApplicationListUserAuth.userId) &&
        Objects.equals(this.fiUsernameHash, itemApplicationListUserAuth.fiUsernameHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fiUsernameHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemApplicationListUserAuth {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fiUsernameHash: ").append(toIndentedString(fiUsernameHash)).append("\n");
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

