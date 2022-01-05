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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Account and bank identifier number data used to configure the test account. All values are optional.
 */
@ApiModel(description = "Account and bank identifier number data used to configure the test account. All values are optional.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-05T21:41:29.826Z[GMT]")
public class Numbers {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_ACH_ROUTING = "ach_routing";
  @SerializedName(SERIALIZED_NAME_ACH_ROUTING)
  private String achRouting;

  public static final String SERIALIZED_NAME_ACH_WIRE_ROUTING = "ach_wire_routing";
  @SerializedName(SERIALIZED_NAME_ACH_WIRE_ROUTING)
  private String achWireRouting;

  public static final String SERIALIZED_NAME_EFT_INSTITUTION = "eft_institution";
  @SerializedName(SERIALIZED_NAME_EFT_INSTITUTION)
  private String eftInstitution;

  public static final String SERIALIZED_NAME_EFT_BRANCH = "eft_branch";
  @SerializedName(SERIALIZED_NAME_EFT_BRANCH)
  private String eftBranch;

  public static final String SERIALIZED_NAME_INTERNATIONAL_BIC = "international_bic";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_BIC)
  private String internationalBic;

  public static final String SERIALIZED_NAME_INTERNATIONAL_IBAN = "international_iban";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_IBAN)
  private String internationalIban;

  public static final String SERIALIZED_NAME_BACS_SORT_CODE = "bacs_sort_code";
  @SerializedName(SERIALIZED_NAME_BACS_SORT_CODE)
  private String bacsSortCode;


  public Numbers account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * Will be used for the account number.
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Will be used for the account number.")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public Numbers achRouting(String achRouting) {
    
    this.achRouting = achRouting;
    return this;
  }

   /**
   * Must be a valid ACH routing number.
   * @return achRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Must be a valid ACH routing number.")

  public String getAchRouting() {
    return achRouting;
  }


  public void setAchRouting(String achRouting) {
    this.achRouting = achRouting;
  }


  public Numbers achWireRouting(String achWireRouting) {
    
    this.achWireRouting = achWireRouting;
    return this;
  }

   /**
   * Must be a valid wire transfer routing number.
   * @return achWireRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Must be a valid wire transfer routing number.")

  public String getAchWireRouting() {
    return achWireRouting;
  }


  public void setAchWireRouting(String achWireRouting) {
    this.achWireRouting = achWireRouting;
  }


  public Numbers eftInstitution(String eftInstitution) {
    
    this.eftInstitution = eftInstitution;
    return this;
  }

   /**
   * EFT institution number. Must be specified alongside &#x60;eft_branch&#x60;.
   * @return eftInstitution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EFT institution number. Must be specified alongside `eft_branch`.")

  public String getEftInstitution() {
    return eftInstitution;
  }


  public void setEftInstitution(String eftInstitution) {
    this.eftInstitution = eftInstitution;
  }


  public Numbers eftBranch(String eftBranch) {
    
    this.eftBranch = eftBranch;
    return this;
  }

   /**
   * EFT branch number. Must be specified alongside &#x60;eft_institution&#x60;.
   * @return eftBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EFT branch number. Must be specified alongside `eft_institution`.")

  public String getEftBranch() {
    return eftBranch;
  }


  public void setEftBranch(String eftBranch) {
    this.eftBranch = eftBranch;
  }


  public Numbers internationalBic(String internationalBic) {
    
    this.internationalBic = internationalBic;
    return this;
  }

   /**
   * Bank identifier code (BIC). Must be specified alongside &#x60;international_iban&#x60;.
   * @return internationalBic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bank identifier code (BIC). Must be specified alongside `international_iban`.")

  public String getInternationalBic() {
    return internationalBic;
  }


  public void setInternationalBic(String internationalBic) {
    this.internationalBic = internationalBic;
  }


  public Numbers internationalIban(String internationalIban) {
    
    this.internationalIban = internationalIban;
    return this;
  }

   /**
   * International bank account number (IBAN). If no account number is specified via &#x60;account&#x60;, will also be used as the account number by default. Must be specified alongside &#x60;international_bic&#x60;.
   * @return internationalIban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "International bank account number (IBAN). If no account number is specified via `account`, will also be used as the account number by default. Must be specified alongside `international_bic`.")

  public String getInternationalIban() {
    return internationalIban;
  }


  public void setInternationalIban(String internationalIban) {
    this.internationalIban = internationalIban;
  }


  public Numbers bacsSortCode(String bacsSortCode) {
    
    this.bacsSortCode = bacsSortCode;
    return this;
  }

   /**
   * BACS sort code
   * @return bacsSortCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BACS sort code")

  public String getBacsSortCode() {
    return bacsSortCode;
  }


  public void setBacsSortCode(String bacsSortCode) {
    this.bacsSortCode = bacsSortCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Numbers numbers = (Numbers) o;
    return Objects.equals(this.account, numbers.account) &&
        Objects.equals(this.achRouting, numbers.achRouting) &&
        Objects.equals(this.achWireRouting, numbers.achWireRouting) &&
        Objects.equals(this.eftInstitution, numbers.eftInstitution) &&
        Objects.equals(this.eftBranch, numbers.eftBranch) &&
        Objects.equals(this.internationalBic, numbers.internationalBic) &&
        Objects.equals(this.internationalIban, numbers.internationalIban) &&
        Objects.equals(this.bacsSortCode, numbers.bacsSortCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, achRouting, achWireRouting, eftInstitution, eftBranch, internationalBic, internationalIban, bacsSortCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Numbers {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    achRouting: ").append(toIndentedString(achRouting)).append("\n");
    sb.append("    achWireRouting: ").append(toIndentedString(achWireRouting)).append("\n");
    sb.append("    eftInstitution: ").append(toIndentedString(eftInstitution)).append("\n");
    sb.append("    eftBranch: ").append(toIndentedString(eftBranch)).append("\n");
    sb.append("    internationalBic: ").append(toIndentedString(internationalBic)).append("\n");
    sb.append("    internationalIban: ").append(toIndentedString(internationalIban)).append("\n");
    sb.append("    bacsSortCode: ").append(toIndentedString(bacsSortCode)).append("\n");
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

