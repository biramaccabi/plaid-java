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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Student loan repayment information used to configure Sandbox test data for the Liabilities product
 */
@ApiModel(description = "Student loan repayment information used to configure Sandbox test data for the Liabilities product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T21:43:48.190Z[GMT]")
public class StudentLoanRepaymentModel {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NON_REPAYMENT_MONTHS = "non_repayment_months";
  @SerializedName(SERIALIZED_NAME_NON_REPAYMENT_MONTHS)
  private Double nonRepaymentMonths;

  public static final String SERIALIZED_NAME_REPAYMENT_MONTHS = "repayment_months";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_MONTHS)
  private Double repaymentMonths;


  public StudentLoanRepaymentModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The only currently supported value for this field is &#x60;standard&#x60;.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The only currently supported value for this field is `standard`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public StudentLoanRepaymentModel nonRepaymentMonths(Double nonRepaymentMonths) {
    
    this.nonRepaymentMonths = nonRepaymentMonths;
    return this;
  }

   /**
   * Configures the number of months before repayment starts.
   * @return nonRepaymentMonths
  **/
  @ApiModelProperty(required = true, value = "Configures the number of months before repayment starts.")

  public Double getNonRepaymentMonths() {
    return nonRepaymentMonths;
  }


  public void setNonRepaymentMonths(Double nonRepaymentMonths) {
    this.nonRepaymentMonths = nonRepaymentMonths;
  }


  public StudentLoanRepaymentModel repaymentMonths(Double repaymentMonths) {
    
    this.repaymentMonths = repaymentMonths;
    return this;
  }

   /**
   * Configures the number of months of repayments before the loan is paid off.
   * @return repaymentMonths
  **/
  @ApiModelProperty(required = true, value = "Configures the number of months of repayments before the loan is paid off.")

  public Double getRepaymentMonths() {
    return repaymentMonths;
  }


  public void setRepaymentMonths(Double repaymentMonths) {
    this.repaymentMonths = repaymentMonths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentLoanRepaymentModel studentLoanRepaymentModel = (StudentLoanRepaymentModel) o;
    return Objects.equals(this.type, studentLoanRepaymentModel.type) &&
        Objects.equals(this.nonRepaymentMonths, studentLoanRepaymentModel.nonRepaymentMonths) &&
        Objects.equals(this.repaymentMonths, studentLoanRepaymentModel.repaymentMonths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, nonRepaymentMonths, repaymentMonths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentLoanRepaymentModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nonRepaymentMonths: ").append(toIndentedString(nonRepaymentMonths)).append("\n");
    sb.append("    repaymentMonths: ").append(toIndentedString(repaymentMonths)).append("\n");
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

