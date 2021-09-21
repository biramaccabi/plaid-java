/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.34.1
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
 * IncomeVerificationPrecheckEmployer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T22:51:02.380Z[GMT]")
public class IncomeVerificationPrecheckEmployer {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;


  public IncomeVerificationPrecheckEmployer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The employer&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employer's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IncomeVerificationPrecheckEmployer taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * The employer&#39;s tax id
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employer's tax id")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckEmployer incomeVerificationPrecheckEmployer = (IncomeVerificationPrecheckEmployer) o;
    return Objects.equals(this.name, incomeVerificationPrecheckEmployer.name) &&
        Objects.equals(this.taxId, incomeVerificationPrecheckEmployer.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckEmployer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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

