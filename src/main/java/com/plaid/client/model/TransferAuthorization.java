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
import com.plaid.client.model.TransferAuthorizationDecision;
import com.plaid.client.model.TransferAuthorizationDecisionRationale;
import com.plaid.client.model.TransferAuthorizationGuaranteeDecision;
import com.plaid.client.model.TransferAuthorizationGuaranteeDecisionRationale;
import com.plaid.client.model.TransferAuthorizationProposedTransfer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Contains the authorization decision for a proposed transfer
 */
@ApiModel(description = "Contains the authorization decision for a proposed transfer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T21:43:48.190Z[GMT]")
public class TransferAuthorization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private TransferAuthorizationDecision decision;

  public static final String SERIALIZED_NAME_DECISION_RATIONALE = "decision_rationale";
  @SerializedName(SERIALIZED_NAME_DECISION_RATIONALE)
  private TransferAuthorizationDecisionRationale decisionRationale;

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION = "guarantee_decision";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION)
  private TransferAuthorizationGuaranteeDecision guaranteeDecision;

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE = "guarantee_decision_rationale";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE)
  private TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale;

  public static final String SERIALIZED_NAME_PROPOSED_TRANSFER = "proposed_transfer";
  @SerializedName(SERIALIZED_NAME_PROPOSED_TRANSFER)
  private TransferAuthorizationProposedTransfer proposedTransfer;


  public TransferAuthorization id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer authorization.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer authorization.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferAuthorization created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime representing when the authorization was created, in the format &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime representing when the authorization was created, in the format `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferAuthorization decision(TransferAuthorizationDecision decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecision getDecision() {
    return decision;
  }


  public void setDecision(TransferAuthorizationDecision decision) {
    this.decision = decision;
  }


  public TransferAuthorization decisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    
    this.decisionRationale = decisionRationale;
    return this;
  }

   /**
   * Get decisionRationale
   * @return decisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecisionRationale getDecisionRationale() {
    return decisionRationale;
  }


  public void setDecisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    this.decisionRationale = decisionRationale;
  }


  public TransferAuthorization guaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    
    this.guaranteeDecision = guaranteeDecision;
    return this;
  }

   /**
   * Get guaranteeDecision
   * @return guaranteeDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecision getGuaranteeDecision() {
    return guaranteeDecision;
  }


  public void setGuaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    this.guaranteeDecision = guaranteeDecision;
  }


  public TransferAuthorization guaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
    return this;
  }

   /**
   * Get guaranteeDecisionRationale
   * @return guaranteeDecisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecisionRationale getGuaranteeDecisionRationale() {
    return guaranteeDecisionRationale;
  }


  public void setGuaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
  }


  public TransferAuthorization proposedTransfer(TransferAuthorizationProposedTransfer proposedTransfer) {
    
    this.proposedTransfer = proposedTransfer;
    return this;
  }

   /**
   * Get proposedTransfer
   * @return proposedTransfer
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationProposedTransfer getProposedTransfer() {
    return proposedTransfer;
  }


  public void setProposedTransfer(TransferAuthorizationProposedTransfer proposedTransfer) {
    this.proposedTransfer = proposedTransfer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAuthorization transferAuthorization = (TransferAuthorization) o;
    return Objects.equals(this.id, transferAuthorization.id) &&
        Objects.equals(this.created, transferAuthorization.created) &&
        Objects.equals(this.decision, transferAuthorization.decision) &&
        Objects.equals(this.decisionRationale, transferAuthorization.decisionRationale) &&
        Objects.equals(this.guaranteeDecision, transferAuthorization.guaranteeDecision) &&
        Objects.equals(this.guaranteeDecisionRationale, transferAuthorization.guaranteeDecisionRationale) &&
        Objects.equals(this.proposedTransfer, transferAuthorization.proposedTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, decision, decisionRationale, guaranteeDecision, guaranteeDecisionRationale, proposedTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAuthorization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    decisionRationale: ").append(toIndentedString(decisionRationale)).append("\n");
    sb.append("    guaranteeDecision: ").append(toIndentedString(guaranteeDecision)).append("\n");
    sb.append("    guaranteeDecisionRationale: ").append(toIndentedString(guaranteeDecisionRationale)).append("\n");
    sb.append("    proposedTransfer: ").append(toIndentedString(proposedTransfer)).append("\n");
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

