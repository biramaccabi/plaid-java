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
import com.plaid.client.model.AuthMetadata;
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.InstitutionStatus;
import com.plaid.client.model.PaymentInitiationMetadata;
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Details relating to a specific financial institution
 */
@ApiModel(description = "Details relating to a specific financial institution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T22:51:02.380Z[GMT]")
public class Institution {
  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "country_codes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private List<CountryCode> countryCodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PRIMARY_COLOR = "primary_color";
  @SerializedName(SERIALIZED_NAME_PRIMARY_COLOR)
  private String primaryColor;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_ROUTING_NUMBERS = "routing_numbers";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBERS)
  private List<String> routingNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_OAUTH = "oauth";
  @SerializedName(SERIALIZED_NAME_OAUTH)
  private Boolean oauth;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private InstitutionStatus status;

  public static final String SERIALIZED_NAME_PAYMENT_INITIATION_METADATA = "payment_initiation_metadata";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INITIATION_METADATA)
  private PaymentInitiationMetadata paymentInitiationMetadata;

  public static final String SERIALIZED_NAME_AUTH_METADATA = "auth_metadata";
  @SerializedName(SERIALIZED_NAME_AUTH_METADATA)
  private AuthMetadata authMetadata;


  public Institution institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Unique identifier for the institution
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the institution")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public Institution name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The official name of the institution
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The official name of the institution")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Institution products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public Institution addProductsItem(Products productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * A list of the Plaid products supported by the institution. Note that only institutions that support Instant Auth will return &#x60;auth&#x60; in the product array; institutions that do not list &#x60;auth&#x60; may still support other Auth methods such as Instant Match or Automated Micro-deposit Verification. For more details, see [Full Auth coverage](https://plaid.com/docs/auth/coverage/).
   * @return products
  **/
  @ApiModelProperty(required = true, value = "A list of the Plaid products supported by the institution. Note that only institutions that support Instant Auth will return `auth` in the product array; institutions that do not list `auth` may still support other Auth methods such as Instant Match or Automated Micro-deposit Verification. For more details, see [Full Auth coverage](https://plaid.com/docs/auth/coverage/).")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public Institution countryCodes(List<CountryCode> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public Institution addCountryCodesItem(CountryCode countryCodesItem) {
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * A list of the country codes supported by the institution.
   * @return countryCodes
  **/
  @ApiModelProperty(required = true, value = "A list of the country codes supported by the institution.")

  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public Institution url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL for the institution&#39;s website
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the institution's website")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Institution primaryColor(String primaryColor) {
    
    this.primaryColor = primaryColor;
    return this;
  }

   /**
   * Hexadecimal representation of the primary color used by the institution
   * @return primaryColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hexadecimal representation of the primary color used by the institution")

  public String getPrimaryColor() {
    return primaryColor;
  }


  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }


  public Institution logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Base64 encoded representation of the institution&#39;s logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded representation of the institution's logo")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public Institution routingNumbers(List<String> routingNumbers) {
    
    this.routingNumbers = routingNumbers;
    return this;
  }

  public Institution addRoutingNumbersItem(String routingNumbersItem) {
    this.routingNumbers.add(routingNumbersItem);
    return this;
  }

   /**
   * A partial list of routing numbers associated with the institution. This list is provided for the purpose of looking up institutions by routing number. It is not comprehensive and should never be used as a complete list of routing numbers for an institution.
   * @return routingNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A partial list of routing numbers associated with the institution. This list is provided for the purpose of looking up institutions by routing number. It is not comprehensive and should never be used as a complete list of routing numbers for an institution.")

  public List<String> getRoutingNumbers() {
    return routingNumbers;
  }


  public void setRoutingNumbers(List<String> routingNumbers) {
    this.routingNumbers = routingNumbers;
  }


  public Institution oauth(Boolean oauth) {
    
    this.oauth = oauth;
    return this;
  }

   /**
   * Indicates that the institution has an OAuth login flow. This is primarily relevant to institutions with European country codes.
   * @return oauth
  **/
  @ApiModelProperty(required = true, value = "Indicates that the institution has an OAuth login flow. This is primarily relevant to institutions with European country codes.")

  public Boolean getOauth() {
    return oauth;
  }


  public void setOauth(Boolean oauth) {
    this.oauth = oauth;
  }


  public Institution status(InstitutionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstitutionStatus getStatus() {
    return status;
  }


  public void setStatus(InstitutionStatus status) {
    this.status = status;
  }


  public Institution paymentInitiationMetadata(PaymentInitiationMetadata paymentInitiationMetadata) {
    
    this.paymentInitiationMetadata = paymentInitiationMetadata;
    return this;
  }

   /**
   * Get paymentInitiationMetadata
   * @return paymentInitiationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationMetadata getPaymentInitiationMetadata() {
    return paymentInitiationMetadata;
  }


  public void setPaymentInitiationMetadata(PaymentInitiationMetadata paymentInitiationMetadata) {
    this.paymentInitiationMetadata = paymentInitiationMetadata;
  }


  public Institution authMetadata(AuthMetadata authMetadata) {
    
    this.authMetadata = authMetadata;
    return this;
  }

   /**
   * Get authMetadata
   * @return authMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthMetadata getAuthMetadata() {
    return authMetadata;
  }


  public void setAuthMetadata(AuthMetadata authMetadata) {
    this.authMetadata = authMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institution institution = (Institution) o;
    return Objects.equals(this.institutionId, institution.institutionId) &&
        Objects.equals(this.name, institution.name) &&
        Objects.equals(this.products, institution.products) &&
        Objects.equals(this.countryCodes, institution.countryCodes) &&
        Objects.equals(this.url, institution.url) &&
        Objects.equals(this.primaryColor, institution.primaryColor) &&
        Objects.equals(this.logo, institution.logo) &&
        Objects.equals(this.routingNumbers, institution.routingNumbers) &&
        Objects.equals(this.oauth, institution.oauth) &&
        Objects.equals(this.status, institution.status) &&
        Objects.equals(this.paymentInitiationMetadata, institution.paymentInitiationMetadata) &&
        Objects.equals(this.authMetadata, institution.authMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionId, name, products, countryCodes, url, primaryColor, logo, routingNumbers, oauth, status, paymentInitiationMetadata, authMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institution {\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    routingNumbers: ").append(toIndentedString(routingNumbers)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentInitiationMetadata: ").append(toIndentedString(paymentInitiationMetadata)).append("\n");
    sb.append("    authMetadata: ").append(toIndentedString(authMetadata)).append("\n");
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

