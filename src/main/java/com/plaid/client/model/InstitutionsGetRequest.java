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
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.InstitutionsGetRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InstitutionsGetRequest defines the request schema for &#x60;/institutions/get&#x60;
 */
@ApiModel(description = "InstitutionsGetRequest defines the request schema for `/institutions/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T22:16:01.337Z[GMT]")
public class InstitutionsGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "country_codes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private List<CountryCode> countryCodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private InstitutionsGetRequestOptions options;


  public InstitutionsGetRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public InstitutionsGetRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public InstitutionsGetRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The total number of Institutions to return.
   * maximum: 500
   * @return count
  **/
  @ApiModelProperty(required = true, value = "The total number of Institutions to return.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public InstitutionsGetRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of Institutions to skip.
   * @return offset
  **/
  @ApiModelProperty(required = true, value = "The number of Institutions to skip.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public InstitutionsGetRequest countryCodes(List<CountryCode> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public InstitutionsGetRequest addCountryCodesItem(CountryCode countryCodesItem) {
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * Specify an array of Plaid-supported country codes this institution supports, using the ISO-3166-1 alpha-2 country code standard.   In API versions 2019-05-29 and earlier, the &#x60;country_codes&#x60; parameter is an optional parameter within the &#x60;options&#x60; object and will default to &#x60;[US]&#x60; if it is not supplied. 
   * @return countryCodes
  **/
  @ApiModelProperty(required = true, value = "Specify an array of Plaid-supported country codes this institution supports, using the ISO-3166-1 alpha-2 country code standard.   In API versions 2019-05-29 and earlier, the `country_codes` parameter is an optional parameter within the `options` object and will default to `[US]` if it is not supplied. ")

  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public InstitutionsGetRequest options(InstitutionsGetRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstitutionsGetRequestOptions getOptions() {
    return options;
  }


  public void setOptions(InstitutionsGetRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsGetRequest institutionsGetRequest = (InstitutionsGetRequest) o;
    return Objects.equals(this.clientId, institutionsGetRequest.clientId) &&
        Objects.equals(this.secret, institutionsGetRequest.secret) &&
        Objects.equals(this.count, institutionsGetRequest.count) &&
        Objects.equals(this.offset, institutionsGetRequest.offset) &&
        Objects.equals(this.countryCodes, institutionsGetRequest.countryCodes) &&
        Objects.equals(this.options, institutionsGetRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, count, offset, countryCodes, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

