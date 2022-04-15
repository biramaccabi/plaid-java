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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specifies options for initializing Link for use with the Deposit Switch (beta) product. This field is required if &#x60;deposit_switch&#x60; is included in the &#x60;products&#x60; array.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Deposit Switch (beta) product. This field is required if `deposit_switch` is included in the `products` array.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-15T01:32:54.341913Z[Etc/UTC]")
public class LinkTokenCreateRequestDepositSwitch {
  public static final String SERIALIZED_NAME_DEPOSIT_SWITCH_ID = "deposit_switch_id";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_SWITCH_ID)
  private String depositSwitchId;


  public LinkTokenCreateRequestDepositSwitch depositSwitchId(String depositSwitchId) {
    
    this.depositSwitchId = depositSwitchId;
    return this;
  }

   /**
   * The &#x60;deposit_switch_id&#x60; provided by the &#x60;/deposit_switch/create&#x60; endpoint.
   * @return depositSwitchId
  **/
  @ApiModelProperty(required = true, value = "The `deposit_switch_id` provided by the `/deposit_switch/create` endpoint.")

  public String getDepositSwitchId() {
    return depositSwitchId;
  }


  public void setDepositSwitchId(String depositSwitchId) {
    this.depositSwitchId = depositSwitchId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestDepositSwitch linkTokenCreateRequestDepositSwitch = (LinkTokenCreateRequestDepositSwitch) o;
    return Objects.equals(this.depositSwitchId, linkTokenCreateRequestDepositSwitch.depositSwitchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositSwitchId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestDepositSwitch {\n");
    sb.append("    depositSwitchId: ").append(toIndentedString(depositSwitchId)).append("\n");
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

