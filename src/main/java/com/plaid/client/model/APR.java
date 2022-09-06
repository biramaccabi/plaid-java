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
 * Information about the APR on the account.
 */
@ApiModel(description = "Information about the APR on the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T15:14:57.000385Z[Etc/UTC]")
public class APR {
  public static final String SERIALIZED_NAME_APR_PERCENTAGE = "apr_percentage";
  @SerializedName(SERIALIZED_NAME_APR_PERCENTAGE)
  private Double aprPercentage;

  /**
   * The type of balance to which the APR applies.
   */
  @JsonAdapter(AprTypeEnum.Adapter.class)
  public enum AprTypeEnum {
    BALANCE_TRANSFER_APR("balance_transfer_apr"),
    
    CASH_APR("cash_apr"),
    
    PURCHASE_APR("purchase_apr"),
    
    SPECIAL("special");

    private String value;

    AprTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AprTypeEnum fromValue(String value) {
      for (AprTypeEnum b : AprTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AprTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AprTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AprTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AprTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APR_TYPE = "apr_type";
  @SerializedName(SERIALIZED_NAME_APR_TYPE)
  private AprTypeEnum aprType;

  public static final String SERIALIZED_NAME_BALANCE_SUBJECT_TO_APR = "balance_subject_to_apr";
  @SerializedName(SERIALIZED_NAME_BALANCE_SUBJECT_TO_APR)
  private Double balanceSubjectToApr;

  public static final String SERIALIZED_NAME_INTEREST_CHARGE_AMOUNT = "interest_charge_amount";
  @SerializedName(SERIALIZED_NAME_INTEREST_CHARGE_AMOUNT)
  private Double interestChargeAmount;


  public APR aprPercentage(Double aprPercentage) {
    
    this.aprPercentage = aprPercentage;
    return this;
  }

   /**
   * Annual Percentage Rate applied. 
   * @return aprPercentage
  **/
  @ApiModelProperty(required = true, value = "Annual Percentage Rate applied. ")

  public Double getAprPercentage() {
    return aprPercentage;
  }


  public void setAprPercentage(Double aprPercentage) {
    this.aprPercentage = aprPercentage;
  }


  public APR aprType(AprTypeEnum aprType) {
    
    this.aprType = aprType;
    return this;
  }

   /**
   * The type of balance to which the APR applies.
   * @return aprType
  **/
  @ApiModelProperty(required = true, value = "The type of balance to which the APR applies.")

  public AprTypeEnum getAprType() {
    return aprType;
  }


  public void setAprType(AprTypeEnum aprType) {
    this.aprType = aprType;
  }


  public APR balanceSubjectToApr(Double balanceSubjectToApr) {
    
    this.balanceSubjectToApr = balanceSubjectToApr;
    return this;
  }

   /**
   * Amount of money that is subjected to the APR if a balance was carried beyond payment due date. How it is calculated can vary by card issuer. It is often calculated as an average daily balance.
   * @return balanceSubjectToApr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Amount of money that is subjected to the APR if a balance was carried beyond payment due date. How it is calculated can vary by card issuer. It is often calculated as an average daily balance.")

  public Double getBalanceSubjectToApr() {
    return balanceSubjectToApr;
  }


  public void setBalanceSubjectToApr(Double balanceSubjectToApr) {
    this.balanceSubjectToApr = balanceSubjectToApr;
  }


  public APR interestChargeAmount(Double interestChargeAmount) {
    
    this.interestChargeAmount = interestChargeAmount;
    return this;
  }

   /**
   * Amount of money charged due to interest from last statement.
   * @return interestChargeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Amount of money charged due to interest from last statement.")

  public Double getInterestChargeAmount() {
    return interestChargeAmount;
  }


  public void setInterestChargeAmount(Double interestChargeAmount) {
    this.interestChargeAmount = interestChargeAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APR APR = (APR) o;
    return Objects.equals(this.aprPercentage, APR.aprPercentage) &&
        Objects.equals(this.aprType, APR.aprType) &&
        Objects.equals(this.balanceSubjectToApr, APR.balanceSubjectToApr) &&
        Objects.equals(this.interestChargeAmount, APR.interestChargeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aprPercentage, aprType, balanceSubjectToApr, interestChargeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APR {\n");
    sb.append("    aprPercentage: ").append(toIndentedString(aprPercentage)).append("\n");
    sb.append("    aprType: ").append(toIndentedString(aprType)).append("\n");
    sb.append("    balanceSubjectToApr: ").append(toIndentedString(balanceSubjectToApr)).append("\n");
    sb.append("    interestChargeAmount: ").append(toIndentedString(interestChargeAmount)).append("\n");
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

