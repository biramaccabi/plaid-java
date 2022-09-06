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
import com.plaid.client.model.DocumentRiskSignalsObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object containing fraud risk data pertaining to the item linked as part of the verification
 */
@ApiModel(description = "Object containing fraud risk data pertaining to the item linked as part of the verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T15:14:57.000385Z[Etc/UTC]")
public class PayrollRiskSignalsItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_VERIFICATION_RISK_SIGNALS = "verification_risk_signals";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_RISK_SIGNALS)
  private List<DocumentRiskSignalsObject> verificationRiskSignals = new ArrayList<>();


  public PayrollRiskSignalsItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public PayrollRiskSignalsItem verificationRiskSignals(List<DocumentRiskSignalsObject> verificationRiskSignals) {
    
    this.verificationRiskSignals = verificationRiskSignals;
    return this;
  }

  public PayrollRiskSignalsItem addVerificationRiskSignalsItem(DocumentRiskSignalsObject verificationRiskSignalsItem) {
    this.verificationRiskSignals.add(verificationRiskSignalsItem);
    return this;
  }

   /**
   * Array of payroll income document authenticity data retrieved for each of the user&#39;s accounts
   * @return verificationRiskSignals
  **/
  @ApiModelProperty(required = true, value = "Array of payroll income document authenticity data retrieved for each of the user's accounts")

  public List<DocumentRiskSignalsObject> getVerificationRiskSignals() {
    return verificationRiskSignals;
  }


  public void setVerificationRiskSignals(List<DocumentRiskSignalsObject> verificationRiskSignals) {
    this.verificationRiskSignals = verificationRiskSignals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollRiskSignalsItem payrollRiskSignalsItem = (PayrollRiskSignalsItem) o;
    return Objects.equals(this.itemId, payrollRiskSignalsItem.itemId) &&
        Objects.equals(this.verificationRiskSignals, payrollRiskSignalsItem.verificationRiskSignals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, verificationRiskSignals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollRiskSignalsItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    verificationRiskSignals: ").append(toIndentedString(verificationRiskSignals)).append("\n");
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

