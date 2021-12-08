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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The address of the employee.
 */
@ApiModel(description = "The address of the employee.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T22:16:01.337Z[GMT]")
public class PaystubOverrideEmployeeAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public PaystubOverrideEmployeeAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The full city name.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full city name.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PaystubOverrideEmployeeAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region or state Example: &#x60;\&quot;NC\&quot;&#x60;
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region or state Example: `\"NC\"`")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public PaystubOverrideEmployeeAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The full street address Example: &#x60;\&quot;564 Main Street, APT 15\&quot;&#x60;
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full street address Example: `\"564 Main Street, APT 15\"`")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public PaystubOverrideEmployeeAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * 5 digit postal code.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "5 digit postal code.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PaystubOverrideEmployeeAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country of the address.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country of the address.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubOverrideEmployeeAddress paystubOverrideEmployeeAddress = (PaystubOverrideEmployeeAddress) o;
    return Objects.equals(this.city, paystubOverrideEmployeeAddress.city) &&
        Objects.equals(this.region, paystubOverrideEmployeeAddress.region) &&
        Objects.equals(this.street, paystubOverrideEmployeeAddress.street) &&
        Objects.equals(this.postalCode, paystubOverrideEmployeeAddress.postalCode) &&
        Objects.equals(this.country, paystubOverrideEmployeeAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, region, street, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverrideEmployeeAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

