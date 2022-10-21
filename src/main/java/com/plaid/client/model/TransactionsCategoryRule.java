/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.196.0
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
import com.plaid.client.model.TransactionsRuleDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A representation of a transactions category rule.
 */
@ApiModel(description = "A representation of a transactions category rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T20:06:01.210619Z[Etc/UTC]")
public class TransactionsCategoryRule {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private String personalFinanceCategory;

  public static final String SERIALIZED_NAME_RULE_DETAILS = "rule_details";
  @SerializedName(SERIALIZED_NAME_RULE_DETAILS)
  private TransactionsRuleDetails ruleDetails;


  public TransactionsCategoryRule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of the rule created
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier of the rule created")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransactionsCategoryRule itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * A unique identifier of the item the rule was created for
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier of the item the rule was created for")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public TransactionsCategoryRule createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time when a rule was created in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ). 
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time when a rule was created in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ). ")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionsCategoryRule personalFinanceCategory(String personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Personal finance category unique identifier.  In the personal finance category taxonomy, this field is represented by the detailed category field. 
   * @return personalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Personal finance category unique identifier.  In the personal finance category taxonomy, this field is represented by the detailed category field. ")

  public String getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(String personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }


  public TransactionsCategoryRule ruleDetails(TransactionsRuleDetails ruleDetails) {
    
    this.ruleDetails = ruleDetails;
    return this;
  }

   /**
   * Get ruleDetails
   * @return ruleDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionsRuleDetails getRuleDetails() {
    return ruleDetails;
  }


  public void setRuleDetails(TransactionsRuleDetails ruleDetails) {
    this.ruleDetails = ruleDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsCategoryRule transactionsCategoryRule = (TransactionsCategoryRule) o;
    return Objects.equals(this.id, transactionsCategoryRule.id) &&
        Objects.equals(this.itemId, transactionsCategoryRule.itemId) &&
        Objects.equals(this.createdAt, transactionsCategoryRule.createdAt) &&
        Objects.equals(this.personalFinanceCategory, transactionsCategoryRule.personalFinanceCategory) &&
        Objects.equals(this.ruleDetails, transactionsCategoryRule.ruleDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemId, createdAt, personalFinanceCategory, ruleDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsCategoryRule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
    sb.append("    ruleDetails: ").append(toIndentedString(ruleDetails)).append("\n");
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

