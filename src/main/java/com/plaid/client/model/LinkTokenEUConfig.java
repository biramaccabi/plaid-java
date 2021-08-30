/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.26.1
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
 * Configuration parameters for EU flows
 */
@ApiModel(description = "Configuration parameters for EU flows")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-30T20:56:28.111Z[GMT]")
public class LinkTokenEUConfig {
  public static final String SERIALIZED_NAME_HEADLESS = "headless";
  @SerializedName(SERIALIZED_NAME_HEADLESS)
  private Boolean headless;


  public LinkTokenEUConfig headless(Boolean headless) {
    
    this.headless = headless;
    return this;
  }

   /**
   * If &#x60;true&#x60;, open Link without an initial UI. Defaults to &#x60;false&#x60;.
   * @return headless
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, open Link without an initial UI. Defaults to `false`.")

  public Boolean getHeadless() {
    return headless;
  }


  public void setHeadless(Boolean headless) {
    this.headless = headless;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenEUConfig linkTokenEUConfig = (LinkTokenEUConfig) o;
    return Objects.equals(this.headless, linkTokenEUConfig.headless);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headless);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenEUConfig {\n");
    sb.append("    headless: ").append(toIndentedString(headless)).append("\n");
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
