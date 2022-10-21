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
import com.plaid.client.model.IncomeBreakdown;
import com.plaid.client.model.PayPeriodDetails;
import com.plaid.client.model.PaystubOverrideEmployee;
import com.plaid.client.model.PaystubOverrideEmployer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing data from a paystub.
 */
@ApiModel(description = "An object representing data from a paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T20:06:01.210619Z[Etc/UTC]")
public class PaystubOverride {
  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private PaystubOverrideEmployer employer;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private PaystubOverrideEmployee employee;

  public static final String SERIALIZED_NAME_INCOME_BREAKDOWN = "income_breakdown";
  @SerializedName(SERIALIZED_NAME_INCOME_BREAKDOWN)
  private List<IncomeBreakdown> incomeBreakdown = null;

  public static final String SERIALIZED_NAME_PAY_PERIOD_DETAILS = "pay_period_details";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_DETAILS)
  private PayPeriodDetails payPeriodDetails;


  public PaystubOverride employer(PaystubOverrideEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubOverrideEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(PaystubOverrideEmployer employer) {
    this.employer = employer;
  }


  public PaystubOverride employee(PaystubOverrideEmployee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubOverrideEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(PaystubOverrideEmployee employee) {
    this.employee = employee;
  }


  public PaystubOverride incomeBreakdown(List<IncomeBreakdown> incomeBreakdown) {
    
    this.incomeBreakdown = incomeBreakdown;
    return this;
  }

  public PaystubOverride addIncomeBreakdownItem(IncomeBreakdown incomeBreakdownItem) {
    if (this.incomeBreakdown == null) {
      this.incomeBreakdown = new ArrayList<>();
    }
    this.incomeBreakdown.add(incomeBreakdownItem);
    return this;
  }

   /**
   * Get incomeBreakdown
   * @return incomeBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IncomeBreakdown> getIncomeBreakdown() {
    return incomeBreakdown;
  }


  public void setIncomeBreakdown(List<IncomeBreakdown> incomeBreakdown) {
    this.incomeBreakdown = incomeBreakdown;
  }


  public PaystubOverride payPeriodDetails(PayPeriodDetails payPeriodDetails) {
    
    this.payPeriodDetails = payPeriodDetails;
    return this;
  }

   /**
   * Get payPeriodDetails
   * @return payPeriodDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayPeriodDetails getPayPeriodDetails() {
    return payPeriodDetails;
  }


  public void setPayPeriodDetails(PayPeriodDetails payPeriodDetails) {
    this.payPeriodDetails = payPeriodDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubOverride paystubOverride = (PaystubOverride) o;
    return Objects.equals(this.employer, paystubOverride.employer) &&
        Objects.equals(this.employee, paystubOverride.employee) &&
        Objects.equals(this.incomeBreakdown, paystubOverride.incomeBreakdown) &&
        Objects.equals(this.payPeriodDetails, paystubOverride.payPeriodDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employer, employee, incomeBreakdown, payPeriodDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverride {\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    incomeBreakdown: ").append(toIndentedString(incomeBreakdown)).append("\n");
    sb.append("    payPeriodDetails: ").append(toIndentedString(payPeriodDetails)).append("\n");
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

