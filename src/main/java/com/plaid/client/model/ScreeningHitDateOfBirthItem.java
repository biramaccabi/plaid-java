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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.DateRange;
import com.plaid.client.model.MatchSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Analyzed date of birth for the associated hit
 */
@ApiModel(description = "Analyzed date of birth for the associated hit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:56:50.392048Z[Etc/UTC]")
public class ScreeningHitDateOfBirthItem {
  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private MatchSummary analysis;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private DateRange data;


  public ScreeningHitDateOfBirthItem analysis(MatchSummary analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummary getAnalysis() {
    return analysis;
  }


  public void setAnalysis(MatchSummary analysis) {
    this.analysis = analysis;
  }


  public ScreeningHitDateOfBirthItem data(DateRange data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateRange getData() {
    return data;
  }


  public void setData(DateRange data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningHitDateOfBirthItem screeningHitDateOfBirthItem = (ScreeningHitDateOfBirthItem) o;
    return Objects.equals(this.analysis, screeningHitDateOfBirthItem.analysis) &&
        Objects.equals(this.data, screeningHitDateOfBirthItem.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysis, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningHitDateOfBirthItem {\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
