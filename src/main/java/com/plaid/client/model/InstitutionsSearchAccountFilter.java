/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.56.0
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
import com.plaid.client.model.AccountSubtype;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InstitutionsSearchAccountFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T22:16:01.337Z[GMT]")
public class InstitutionsSearchAccountFilter {
  public static final String SERIALIZED_NAME_LOAN = "loan";
  @SerializedName(SERIALIZED_NAME_LOAN)
  private List<AccountSubtype> loan = null;

  public static final String SERIALIZED_NAME_DEPOSITORY = "depository";
  @SerializedName(SERIALIZED_NAME_DEPOSITORY)
  private List<AccountSubtype> depository = null;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private List<AccountSubtype> credit = null;

  public static final String SERIALIZED_NAME_INVESTMENT = "investment";
  @SerializedName(SERIALIZED_NAME_INVESTMENT)
  private List<AccountSubtype> investment = null;


  public InstitutionsSearchAccountFilter loan(List<AccountSubtype> loan) {
    
    this.loan = loan;
    return this;
  }

  public InstitutionsSearchAccountFilter addLoanItem(AccountSubtype loanItem) {
    if (this.loan == null) {
      this.loan = new ArrayList<>();
    }
    this.loan.add(loanItem);
    return this;
  }

   /**
   * Get loan
   * @return loan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountSubtype> getLoan() {
    return loan;
  }


  public void setLoan(List<AccountSubtype> loan) {
    this.loan = loan;
  }


  public InstitutionsSearchAccountFilter depository(List<AccountSubtype> depository) {
    
    this.depository = depository;
    return this;
  }

  public InstitutionsSearchAccountFilter addDepositoryItem(AccountSubtype depositoryItem) {
    if (this.depository == null) {
      this.depository = new ArrayList<>();
    }
    this.depository.add(depositoryItem);
    return this;
  }

   /**
   * Get depository
   * @return depository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountSubtype> getDepository() {
    return depository;
  }


  public void setDepository(List<AccountSubtype> depository) {
    this.depository = depository;
  }


  public InstitutionsSearchAccountFilter credit(List<AccountSubtype> credit) {
    
    this.credit = credit;
    return this;
  }

  public InstitutionsSearchAccountFilter addCreditItem(AccountSubtype creditItem) {
    if (this.credit == null) {
      this.credit = new ArrayList<>();
    }
    this.credit.add(creditItem);
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountSubtype> getCredit() {
    return credit;
  }


  public void setCredit(List<AccountSubtype> credit) {
    this.credit = credit;
  }


  public InstitutionsSearchAccountFilter investment(List<AccountSubtype> investment) {
    
    this.investment = investment;
    return this;
  }

  public InstitutionsSearchAccountFilter addInvestmentItem(AccountSubtype investmentItem) {
    if (this.investment == null) {
      this.investment = new ArrayList<>();
    }
    this.investment.add(investmentItem);
    return this;
  }

   /**
   * Get investment
   * @return investment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountSubtype> getInvestment() {
    return investment;
  }


  public void setInvestment(List<AccountSubtype> investment) {
    this.investment = investment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsSearchAccountFilter institutionsSearchAccountFilter = (InstitutionsSearchAccountFilter) o;
    return Objects.equals(this.loan, institutionsSearchAccountFilter.loan) &&
        Objects.equals(this.depository, institutionsSearchAccountFilter.depository) &&
        Objects.equals(this.credit, institutionsSearchAccountFilter.credit) &&
        Objects.equals(this.investment, institutionsSearchAccountFilter.investment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loan, depository, credit, investment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsSearchAccountFilter {\n");
    sb.append("    loan: ").append(toIndentedString(loan)).append("\n");
    sb.append("    depository: ").append(toIndentedString(depository)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    investment: ").append(toIndentedString(investment)).append("\n");
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

