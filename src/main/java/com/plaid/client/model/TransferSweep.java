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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * Describes a sweep of funds to / from the sweep account.  A sweep is associated with many sweep events (events of type &#x60;swept&#x60; or &#x60;return_swept&#x60;) which can be retrieved by invoking the &#x60;/transfer/event/list&#x60; endpoint with the corresponding &#x60;sweep_id&#x60;.  &#x60;swept&#x60; events occur when the transfer amount is credited or debited from your sweep account, depending on the &#x60;type&#x60; of the transfer. &#x60;return_swept&#x60; events occur when a transfer is returned and Plaid undoes the credit or debit.  The total sum of the &#x60;swept&#x60; and &#x60;return_swept&#x60; events is equal to the &#x60;amount&#x60; of the sweep Plaid creates and matches the amount of the entry on your sweep account ledger.
 */
@ApiModel(description = "Describes a sweep of funds to / from the sweep account.  A sweep is associated with many sweep events (events of type `swept` or `return_swept`) which can be retrieved by invoking the `/transfer/event/list` endpoint with the corresponding `sweep_id`.  `swept` events occur when the transfer amount is credited or debited from your sweep account, depending on the `type` of the transfer. `return_swept` events occur when a transfer is returned and Plaid undoes the credit or debit.  The total sum of the `swept` and `return_swept` events is equal to the `amount` of the sweep Plaid creates and matches the amount of the entry on your sweep account ledger.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:56:50.392048Z[Etc/UTC]")
public class TransferSweep {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_SETTLED = "settled";
  @SerializedName(SERIALIZED_NAME_SETTLED)
  private LocalDate settled;


  public TransferSweep id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the sweep.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the sweep.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferSweep created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when the sweep occurred, in RFC 3339 format.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when the sweep occurred, in RFC 3339 format.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferSweep amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \&quot;-10.00\&quot;)  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \"-10.00\")  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferSweep isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the sweep, e.g. \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the sweep, e.g. \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public TransferSweep settled(LocalDate settled) {
    
    this.settled = settled;
    return this;
  }

   /**
   * The date when the sweep settled, in the YYYY-MM-DD format.
   * @return settled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date when the sweep settled, in the YYYY-MM-DD format.")

  public LocalDate getSettled() {
    return settled;
  }


  public void setSettled(LocalDate settled) {
    this.settled = settled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferSweep transferSweep = (TransferSweep) o;
    return Objects.equals(this.id, transferSweep.id) &&
        Objects.equals(this.created, transferSweep.created) &&
        Objects.equals(this.amount, transferSweep.amount) &&
        Objects.equals(this.isoCurrencyCode, transferSweep.isoCurrencyCode) &&
        Objects.equals(this.settled, transferSweep.settled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, amount, isoCurrencyCode, settled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferSweep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
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

