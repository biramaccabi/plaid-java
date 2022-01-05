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
import com.plaid.client.model.ExternalPaymentRefundDetails;
import com.plaid.client.model.ExternalPaymentScheduleGet;
import com.plaid.client.model.PaymentAmount;
import com.plaid.client.model.PaymentInitiationPaymentStatus;
import com.plaid.client.model.PaymentInitiationRefund;
import com.plaid.client.model.PaymentScheme;
import com.plaid.client.model.SenderBACSNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentInitiationPayment defines a payment initiation payment
 */
@ApiModel(description = "PaymentInitiationPayment defines a payment initiation payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-05T21:41:29.826Z[GMT]")
public class PaymentInitiationPayment {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentAmount amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentInitiationPaymentStatus status;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_ADJUSTED_REFERENCE = "adjusted_reference";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_REFERENCE)
  private String adjustedReference;

  public static final String SERIALIZED_NAME_LAST_STATUS_UPDATE = "last_status_update";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS_UPDATE)
  private OffsetDateTime lastStatusUpdate;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private ExternalPaymentScheduleGet schedule = null;

  public static final String SERIALIZED_NAME_REFUND_DETAILS = "refund_details";
  @SerializedName(SERIALIZED_NAME_REFUND_DETAILS)
  private ExternalPaymentRefundDetails refundDetails;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private SenderBACSNullable bacs = null;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_INITIATED_REFUNDS = "initiated_refunds";
  @SerializedName(SERIALIZED_NAME_INITIATED_REFUNDS)
  private List<PaymentInitiationRefund> initiatedRefunds = null;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private PaymentScheme scheme;

  public static final String SERIALIZED_NAME_ADJUSTED_SCHEME = "adjusted_scheme";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_SCHEME)
  private PaymentScheme adjustedScheme;


  public PaymentInitiationPayment paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The ID of the payment. Like all Plaid identifiers, the &#x60;payment_id&#x60; is case sensitive.
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "The ID of the payment. Like all Plaid identifiers, the `payment_id` is case sensitive.")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentInitiationPayment amount(PaymentAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentAmount getAmount() {
    return amount;
  }


  public void setAmount(PaymentAmount amount) {
    this.amount = amount;
  }


  public PaymentInitiationPayment status(PaymentInitiationPaymentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationPaymentStatus getStatus() {
    return status;
  }


  public void setStatus(PaymentInitiationPaymentStatus status) {
    this.status = status;
  }


  public PaymentInitiationPayment recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the recipient")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public PaymentInitiationPayment reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the payment.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference for the payment.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInitiationPayment adjustedReference(String adjustedReference) {
    
    this.adjustedReference = adjustedReference;
    return this;
  }

   /**
   * The value of the reference sent to the bank after adjustment to pass bank validation rules.
   * @return adjustedReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the reference sent to the bank after adjustment to pass bank validation rules.")

  public String getAdjustedReference() {
    return adjustedReference;
  }


  public void setAdjustedReference(String adjustedReference) {
    this.adjustedReference = adjustedReference;
  }


  public PaymentInitiationPayment lastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    
    this.lastStatusUpdate = lastStatusUpdate;
    return this;
  }

   /**
   * The date and time of the last time the &#x60;status&#x60; was updated, in IS0 8601 format
   * @return lastStatusUpdate
  **/
  @ApiModelProperty(required = true, value = "The date and time of the last time the `status` was updated, in IS0 8601 format")

  public OffsetDateTime getLastStatusUpdate() {
    return lastStatusUpdate;
  }


  public void setLastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    this.lastStatusUpdate = lastStatusUpdate;
  }


  public PaymentInitiationPayment schedule(ExternalPaymentScheduleGet schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPaymentScheduleGet getSchedule() {
    return schedule;
  }


  public void setSchedule(ExternalPaymentScheduleGet schedule) {
    this.schedule = schedule;
  }


  public PaymentInitiationPayment refundDetails(ExternalPaymentRefundDetails refundDetails) {
    
    this.refundDetails = refundDetails;
    return this;
  }

   /**
   * Get refundDetails
   * @return refundDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPaymentRefundDetails getRefundDetails() {
    return refundDetails;
  }


  public void setRefundDetails(ExternalPaymentRefundDetails refundDetails) {
    this.refundDetails = refundDetails;
  }


  public PaymentInitiationPayment bacs(SenderBACSNullable bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public SenderBACSNullable getBacs() {
    return bacs;
  }


  public void setBacs(SenderBACSNullable bacs) {
    this.bacs = bacs;
  }


  public PaymentInitiationPayment iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the sender, if specified in the &#x60;/payment_initiation/payment/create&#x60; call.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The International Bank Account Number (IBAN) for the sender, if specified in the `/payment_initiation/payment/create` call.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public PaymentInitiationPayment initiatedRefunds(List<PaymentInitiationRefund> initiatedRefunds) {
    
    this.initiatedRefunds = initiatedRefunds;
    return this;
  }

  public PaymentInitiationPayment addInitiatedRefundsItem(PaymentInitiationRefund initiatedRefundsItem) {
    if (this.initiatedRefunds == null) {
      this.initiatedRefunds = new ArrayList<>();
    }
    this.initiatedRefunds.add(initiatedRefundsItem);
    return this;
  }

   /**
   * Initiated refunds associated with the payment.
   * @return initiatedRefunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Initiated refunds associated with the payment.")

  public List<PaymentInitiationRefund> getInitiatedRefunds() {
    return initiatedRefunds;
  }


  public void setInitiatedRefunds(List<PaymentInitiationRefund> initiatedRefunds) {
    this.initiatedRefunds = initiatedRefunds;
  }


  public PaymentInitiationPayment walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The EMI (E-Money Institution) wallet that this payment is associated with, if any. This wallet is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EMI (E-Money Institution) wallet that this payment is associated with, if any. This wallet is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public PaymentInitiationPayment scheme(PaymentScheme scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentScheme getScheme() {
    return scheme;
  }


  public void setScheme(PaymentScheme scheme) {
    this.scheme = scheme;
  }


  public PaymentInitiationPayment adjustedScheme(PaymentScheme adjustedScheme) {
    
    this.adjustedScheme = adjustedScheme;
    return this;
  }

   /**
   * Get adjustedScheme
   * @return adjustedScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentScheme getAdjustedScheme() {
    return adjustedScheme;
  }


  public void setAdjustedScheme(PaymentScheme adjustedScheme) {
    this.adjustedScheme = adjustedScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationPayment paymentInitiationPayment = (PaymentInitiationPayment) o;
    return Objects.equals(this.paymentId, paymentInitiationPayment.paymentId) &&
        Objects.equals(this.amount, paymentInitiationPayment.amount) &&
        Objects.equals(this.status, paymentInitiationPayment.status) &&
        Objects.equals(this.recipientId, paymentInitiationPayment.recipientId) &&
        Objects.equals(this.reference, paymentInitiationPayment.reference) &&
        Objects.equals(this.adjustedReference, paymentInitiationPayment.adjustedReference) &&
        Objects.equals(this.lastStatusUpdate, paymentInitiationPayment.lastStatusUpdate) &&
        Objects.equals(this.schedule, paymentInitiationPayment.schedule) &&
        Objects.equals(this.refundDetails, paymentInitiationPayment.refundDetails) &&
        Objects.equals(this.bacs, paymentInitiationPayment.bacs) &&
        Objects.equals(this.iban, paymentInitiationPayment.iban) &&
        Objects.equals(this.initiatedRefunds, paymentInitiationPayment.initiatedRefunds) &&
        Objects.equals(this.walletId, paymentInitiationPayment.walletId) &&
        Objects.equals(this.scheme, paymentInitiationPayment.scheme) &&
        Objects.equals(this.adjustedScheme, paymentInitiationPayment.adjustedScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, amount, status, recipientId, reference, adjustedReference, lastStatusUpdate, schedule, refundDetails, bacs, iban, initiatedRefunds, walletId, scheme, adjustedScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationPayment {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    adjustedReference: ").append(toIndentedString(adjustedReference)).append("\n");
    sb.append("    lastStatusUpdate: ").append(toIndentedString(lastStatusUpdate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    refundDetails: ").append(toIndentedString(refundDetails)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    initiatedRefunds: ").append(toIndentedString(initiatedRefunds)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    adjustedScheme: ").append(toIndentedString(adjustedScheme)).append("\n");
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

