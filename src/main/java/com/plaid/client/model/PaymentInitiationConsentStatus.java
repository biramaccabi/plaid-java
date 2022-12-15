/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.210.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the payment consent.  &#x60;UNAUTHORISED&#x60;: Consent created, but requires user authorisation.  &#x60;REJECTED&#x60;: Consent authorisation was rejected by the user and/or the bank.  &#x60;AUTHORISED&#x60;: Consent is active and ready to be used.  &#x60;REVOKED&#x60;: Consent has been revoked and can no longer be used.  &#x60;EXPIRED&#x60;: Consent is no longer valid.
 */
@JsonAdapter(PaymentInitiationConsentStatus.Adapter.class)
public enum PaymentInitiationConsentStatus {
  
  UNAUTHORISED("UNAUTHORISED"),
  
  AUTHORISED("AUTHORISED"),
  
  REVOKED("REVOKED"),
  
  REJECTED("REJECTED"),
  
  EXPIRED("EXPIRED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentInitiationConsentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentInitiationConsentStatus fromValue(String value) {
    for (PaymentInitiationConsentStatus b : PaymentInitiationConsentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentInitiationConsentStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentInitiationConsentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentInitiationConsentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentInitiationConsentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentInitiationConsentStatus.fromValue(value);
    }
  }
}
