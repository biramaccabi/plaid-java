/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.84.5
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
import com.plaid.client.model.PaymentInitiationStandingOrderMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Metadata that captures what specific payment configurations an institution supports when making Payment Initiation requests.
 */
@ApiModel(description = "Metadata that captures what specific payment configurations an institution supports when making Payment Initiation requests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T21:43:48.190Z[GMT]")
public class PaymentInitiationMetadata {
  public static final String SERIALIZED_NAME_SUPPORTS_INTERNATIONAL_PAYMENTS = "supports_international_payments";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_INTERNATIONAL_PAYMENTS)
  private Boolean supportsInternationalPayments;

  public static final String SERIALIZED_NAME_MAXIMUM_PAYMENT_AMOUNT = "maximum_payment_amount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_PAYMENT_AMOUNT)
  private Map<String, String> maximumPaymentAmount = new HashMap<>();

  public static final String SERIALIZED_NAME_SUPPORTS_REFUND_DETAILS = "supports_refund_details";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_REFUND_DETAILS)
  private Boolean supportsRefundDetails;

  public static final String SERIALIZED_NAME_STANDING_ORDER_METADATA = "standing_order_metadata";
  @SerializedName(SERIALIZED_NAME_STANDING_ORDER_METADATA)
  private PaymentInitiationStandingOrderMetadata standingOrderMetadata;


  public PaymentInitiationMetadata supportsInternationalPayments(Boolean supportsInternationalPayments) {
    
    this.supportsInternationalPayments = supportsInternationalPayments;
    return this;
  }

   /**
   * Indicates whether the institution supports payments from a different country.
   * @return supportsInternationalPayments
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the institution supports payments from a different country.")

  public Boolean getSupportsInternationalPayments() {
    return supportsInternationalPayments;
  }


  public void setSupportsInternationalPayments(Boolean supportsInternationalPayments) {
    this.supportsInternationalPayments = supportsInternationalPayments;
  }


  public PaymentInitiationMetadata maximumPaymentAmount(Map<String, String> maximumPaymentAmount) {
    
    this.maximumPaymentAmount = maximumPaymentAmount;
    return this;
  }

  public PaymentInitiationMetadata putMaximumPaymentAmountItem(String key, String maximumPaymentAmountItem) {
    this.maximumPaymentAmount.put(key, maximumPaymentAmountItem);
    return this;
  }

   /**
   * A mapping of currency to maximum payment amount (denominated in the smallest unit of currency) supported by the institution.  Example: &#x60;{\&quot;GBP\&quot;: \&quot;10000\&quot;}&#x60; 
   * @return maximumPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "A mapping of currency to maximum payment amount (denominated in the smallest unit of currency) supported by the institution.  Example: `{\"GBP\": \"10000\"}` ")

  public Map<String, String> getMaximumPaymentAmount() {
    return maximumPaymentAmount;
  }


  public void setMaximumPaymentAmount(Map<String, String> maximumPaymentAmount) {
    this.maximumPaymentAmount = maximumPaymentAmount;
  }


  public PaymentInitiationMetadata supportsRefundDetails(Boolean supportsRefundDetails) {
    
    this.supportsRefundDetails = supportsRefundDetails;
    return this;
  }

   /**
   * Indicates whether the institution supports returning refund details when initiating a payment.
   * @return supportsRefundDetails
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the institution supports returning refund details when initiating a payment.")

  public Boolean getSupportsRefundDetails() {
    return supportsRefundDetails;
  }


  public void setSupportsRefundDetails(Boolean supportsRefundDetails) {
    this.supportsRefundDetails = supportsRefundDetails;
  }


  public PaymentInitiationMetadata standingOrderMetadata(PaymentInitiationStandingOrderMetadata standingOrderMetadata) {
    
    this.standingOrderMetadata = standingOrderMetadata;
    return this;
  }

   /**
   * Get standingOrderMetadata
   * @return standingOrderMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationStandingOrderMetadata getStandingOrderMetadata() {
    return standingOrderMetadata;
  }


  public void setStandingOrderMetadata(PaymentInitiationStandingOrderMetadata standingOrderMetadata) {
    this.standingOrderMetadata = standingOrderMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationMetadata paymentInitiationMetadata = (PaymentInitiationMetadata) o;
    return Objects.equals(this.supportsInternationalPayments, paymentInitiationMetadata.supportsInternationalPayments) &&
        Objects.equals(this.maximumPaymentAmount, paymentInitiationMetadata.maximumPaymentAmount) &&
        Objects.equals(this.supportsRefundDetails, paymentInitiationMetadata.supportsRefundDetails) &&
        Objects.equals(this.standingOrderMetadata, paymentInitiationMetadata.standingOrderMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportsInternationalPayments, maximumPaymentAmount, supportsRefundDetails, standingOrderMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationMetadata {\n");
    sb.append("    supportsInternationalPayments: ").append(toIndentedString(supportsInternationalPayments)).append("\n");
    sb.append("    maximumPaymentAmount: ").append(toIndentedString(maximumPaymentAmount)).append("\n");
    sb.append("    supportsRefundDetails: ").append(toIndentedString(supportsRefundDetails)).append("\n");
    sb.append("    standingOrderMetadata: ").append(toIndentedString(standingOrderMetadata)).append("\n");
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

