/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
 * The type of identity document detected in the images provided. Will always be one of the following values:    &#x60;drivers_license&#x60; - A driver&#39;s license for the associated country    &#x60;id_card&#x60; - A general national identification card, distinct from driver&#39;s licenses    &#x60;passport&#x60; - A passport for the associated country    &#x60;residence_permit_card&#x60; - An identity document permitting a foreign citizen to &lt;em&gt;temporarily&lt;/em&gt; reside in the associated country    &#x60;resident_card&#x60; - An identity document permitting a foreign citizen to &lt;em&gt;permanently&lt;/em&gt; reside in the associated country  Note: This value may be different from the ID type that the user selects within Link. For example, if they select \&quot;Driver&#39;s License\&quot; but then submit a picture of a passport, this field will say &#x60;passport&#x60;
 */
@JsonAdapter(PhysicalDocumentCategory.Adapter.class)
public enum PhysicalDocumentCategory {
  
  DRIVERS_LICENSE("drivers_license"),
  
  ID_CARD("id_card"),
  
  PASSPORT("passport"),
  
  RESIDENCE_PERMIT_CARD("residence_permit_card"),
  
  RESIDENT_CARD("resident_card"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PhysicalDocumentCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PhysicalDocumentCategory fromValue(String value) {
    for (PhysicalDocumentCategory b : PhysicalDocumentCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PhysicalDocumentCategory.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PhysicalDocumentCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final PhysicalDocumentCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PhysicalDocumentCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PhysicalDocumentCategory.fromValue(value);
    }
  }
}

