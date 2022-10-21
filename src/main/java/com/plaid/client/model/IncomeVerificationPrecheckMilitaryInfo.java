/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.196.0
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
 * Data about military info in the income verification precheck.
 */
@ApiModel(description = "Data about military info in the income verification precheck.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T20:06:01.210619Z[Etc/UTC]")
public class IncomeVerificationPrecheckMilitaryInfo {
  public static final String SERIALIZED_NAME_IS_ACTIVE_DUTY = "is_active_duty";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE_DUTY)
  private Boolean isActiveDuty;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;


  public IncomeVerificationPrecheckMilitaryInfo isActiveDuty(Boolean isActiveDuty) {
    
    this.isActiveDuty = isActiveDuty;
    return this;
  }

   /**
   * Is the user currently active duty in the US military
   * @return isActiveDuty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the user currently active duty in the US military")

  public Boolean getIsActiveDuty() {
    return isActiveDuty;
  }


  public void setIsActiveDuty(Boolean isActiveDuty) {
    this.isActiveDuty = isActiveDuty;
  }


  public IncomeVerificationPrecheckMilitaryInfo branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * If the user is currently serving in the US military, the branch of the military in which they are serving Valid values: &#39;AIR FORCE&#39;, &#39;ARMY&#39;, &#39;COAST GUARD&#39;, &#39;MARINES&#39;, &#39;NAVY&#39;, &#39;UNKNOWN&#39;
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the user is currently serving in the US military, the branch of the military in which they are serving Valid values: 'AIR FORCE', 'ARMY', 'COAST GUARD', 'MARINES', 'NAVY', 'UNKNOWN'")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckMilitaryInfo incomeVerificationPrecheckMilitaryInfo = (IncomeVerificationPrecheckMilitaryInfo) o;
    return Objects.equals(this.isActiveDuty, incomeVerificationPrecheckMilitaryInfo.isActiveDuty) &&
        Objects.equals(this.branch, incomeVerificationPrecheckMilitaryInfo.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActiveDuty, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckMilitaryInfo {\n");
    sb.append("    isActiveDuty: ").append(toIndentedString(isActiveDuty)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

