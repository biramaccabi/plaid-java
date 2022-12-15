/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.210.4
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
import com.plaid.client.model.ClientProvidedTransactionLocation;
import com.plaid.client.model.EnrichTransactionDirection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A client-provided transaction for Plaid to enrich.
 */
@ApiModel(description = "A client-provided transaction for Plaid to enrich.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:56:50.392048Z[Etc/UTC]")
public class ClientProvidedTransaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private EnrichTransactionDirection direction;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private ClientProvidedTransactionLocation location;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_DATE_POSTED = "date_posted";
  @SerializedName(SERIALIZED_NAME_DATE_POSTED)
  private LocalDate datePosted;


  public ClientProvidedTransaction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique ID for the transaction used to help you tie data back to your systems.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "A unique ID for the transaction used to help you tie data back to your systems.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ClientProvidedTransaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The raw description of the transaction.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The raw description of the transaction.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ClientProvidedTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The absolute value of the transaction (&gt;&#x3D; 0)
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The absolute value of the transaction (>= 0)")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public ClientProvidedTransaction direction(EnrichTransactionDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "")

  public EnrichTransactionDirection getDirection() {
    return direction;
  }


  public void setDirection(EnrichTransactionDirection direction) {
    this.direction = direction;
  }


  public ClientProvidedTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction e.g. USD.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction e.g. USD.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public ClientProvidedTransaction location(ClientProvidedTransactionLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClientProvidedTransactionLocation getLocation() {
    return location;
  }


  public void setLocation(ClientProvidedTransactionLocation location) {
    this.location = location;
  }


  public ClientProvidedTransaction mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * Merchant category codes (MCCs) are four-digit numbers that describe a merchant&#39;s primary business activities.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant category codes (MCCs) are four-digit numbers that describe a merchant's primary business activities.")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public ClientProvidedTransaction datePosted(LocalDate datePosted) {
    
    this.datePosted = datePosted;
    return this;
  }

   /**
   * The date the transaction posted, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.
   * @return datePosted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the transaction posted, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format.")

  public LocalDate getDatePosted() {
    return datePosted;
  }


  public void setDatePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientProvidedTransaction clientProvidedTransaction = (ClientProvidedTransaction) o;
    return Objects.equals(this.id, clientProvidedTransaction.id) &&
        Objects.equals(this.description, clientProvidedTransaction.description) &&
        Objects.equals(this.amount, clientProvidedTransaction.amount) &&
        Objects.equals(this.direction, clientProvidedTransaction.direction) &&
        Objects.equals(this.isoCurrencyCode, clientProvidedTransaction.isoCurrencyCode) &&
        Objects.equals(this.location, clientProvidedTransaction.location) &&
        Objects.equals(this.mcc, clientProvidedTransaction.mcc) &&
        Objects.equals(this.datePosted, clientProvidedTransaction.datePosted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, amount, direction, isoCurrencyCode, location, mcc, datePosted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientProvidedTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
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
