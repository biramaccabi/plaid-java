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
import com.plaid.client.model.CreditFreddieMacAssetVOE25;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T17:46:09.980340Z[Etc/UTC]")
public class CreditFreddieMacAssetsVOE25 {
  public static final String SERIALIZED_NAME_A_S_S_E_T = "ASSET";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T)
  private List<CreditFreddieMacAssetVOE25> ASSET = new ArrayList<>();


  public CreditFreddieMacAssetsVOE25 ASSET(List<CreditFreddieMacAssetVOE25> ASSET) {
    
    this.ASSET = ASSET;
    return this;
  }

  public CreditFreddieMacAssetsVOE25 addASSETItem(CreditFreddieMacAssetVOE25 ASSETItem) {
    this.ASSET.add(ASSETItem);
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return ASSET
  **/
  @ApiModelProperty(required = true, value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public List<CreditFreddieMacAssetVOE25> getASSET() {
    return ASSET;
  }


  public void setASSET(List<CreditFreddieMacAssetVOE25> ASSET) {
    this.ASSET = ASSET;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacAssetsVOE25 creditFreddieMacAssetsVOE25 = (CreditFreddieMacAssetsVOE25) o;
    return Objects.equals(this.ASSET, creditFreddieMacAssetsVOE25.ASSET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacAssetsVOE25 {\n");
    sb.append("    ASSET: ").append(toIndentedString(ASSET)).append("\n");
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

