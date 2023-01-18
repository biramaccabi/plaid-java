/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.214.0
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
 * The schema below describes the various &#x60;types&#x60; and corresponding &#x60;subtypes&#x60; that Plaid recognizes and reports for financial institution accounts.
 */
@ApiModel(description = "The schema below describes the various `types` and corresponding `subtypes` that Plaid recognizes and reports for financial institution accounts.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T17:46:09.980340Z[Etc/UTC]")
public class StandaloneAccountType {
  public static final String SERIALIZED_NAME_DEPOSITORY = "depository";
  @SerializedName(SERIALIZED_NAME_DEPOSITORY)
  private String depository;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private String credit;

  public static final String SERIALIZED_NAME_LOAN = "loan";
  @SerializedName(SERIALIZED_NAME_LOAN)
  private String loan;

  public static final String SERIALIZED_NAME_INVESTMENT = "investment";
  @SerializedName(SERIALIZED_NAME_INVESTMENT)
  private String investment;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private String other;


  public StandaloneAccountType depository(String depository) {
    
    this.depository = depository;
    return this;
  }

   /**
   * An account type holding cash, in which funds are deposited. Supported products for &#x60;depository&#x60; accounts are: Auth (&#x60;checking&#x60; and &#x60;savings&#x60; types only), Balance, Transactions, Identity, Payment Initiation, and Assets.
   * @return depository
  **/
  @ApiModelProperty(required = true, value = "An account type holding cash, in which funds are deposited. Supported products for `depository` accounts are: Auth (`checking` and `savings` types only), Balance, Transactions, Identity, Payment Initiation, and Assets.")

  public String getDepository() {
    return depository;
  }


  public void setDepository(String depository) {
    this.depository = depository;
  }


  public StandaloneAccountType credit(String credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * A credit card type account. Supported products for &#x60;credit&#x60; accounts are: Balance, Transactions, Identity, and Liabilities.
   * @return credit
  **/
  @ApiModelProperty(required = true, value = "A credit card type account. Supported products for `credit` accounts are: Balance, Transactions, Identity, and Liabilities.")

  public String getCredit() {
    return credit;
  }


  public void setCredit(String credit) {
    this.credit = credit;
  }


  public StandaloneAccountType loan(String loan) {
    
    this.loan = loan;
    return this;
  }

   /**
   * A loan type account. Supported products for &#x60;loan&#x60; accounts are: Balance, Liabilities, and Transactions.
   * @return loan
  **/
  @ApiModelProperty(required = true, value = "A loan type account. Supported products for `loan` accounts are: Balance, Liabilities, and Transactions.")

  public String getLoan() {
    return loan;
  }


  public void setLoan(String loan) {
    this.loan = loan;
  }


  public StandaloneAccountType investment(String investment) {
    
    this.investment = investment;
    return this;
  }

   /**
   * An investment account. Supported products for &#x60;investment&#x60; accounts are: Balance and Investments. In API versions 2018-05-22 and earlier, this type is called &#x60;brokerage&#x60;.
   * @return investment
  **/
  @ApiModelProperty(required = true, value = "An investment account. Supported products for `investment` accounts are: Balance and Investments. In API versions 2018-05-22 and earlier, this type is called `brokerage`.")

  public String getInvestment() {
    return investment;
  }


  public void setInvestment(String investment) {
    this.investment = investment;
  }


  public StandaloneAccountType other(String other) {
    
    this.other = other;
    return this;
  }

   /**
   * Other or unknown account type. Supported products for &#x60;other&#x60; accounts are: Balance, Transactions, Identity, and Assets.
   * @return other
  **/
  @ApiModelProperty(required = true, value = "Other or unknown account type. Supported products for `other` accounts are: Balance, Transactions, Identity, and Assets.")

  public String getOther() {
    return other;
  }


  public void setOther(String other) {
    this.other = other;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandaloneAccountType standaloneAccountType = (StandaloneAccountType) o;
    return Objects.equals(this.depository, standaloneAccountType.depository) &&
        Objects.equals(this.credit, standaloneAccountType.credit) &&
        Objects.equals(this.loan, standaloneAccountType.loan) &&
        Objects.equals(this.investment, standaloneAccountType.investment) &&
        Objects.equals(this.other, standaloneAccountType.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depository, credit, loan, investment, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandaloneAccountType {\n");
    sb.append("    depository: ").append(toIndentedString(depository)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    loan: ").append(toIndentedString(loan)).append("\n");
    sb.append("    investment: ").append(toIndentedString(investment)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

