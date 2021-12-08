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
import com.plaid.client.model.EmployerVerification;
import com.plaid.client.model.EmploymentVerificationStatus;
import com.plaid.client.model.PlatformIds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * An object containing proof of employment data for an individual
 */
@ApiModel(description = "An object containing proof of employment data for an individual")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T22:16:01.337Z[GMT]")
public class EmploymentVerification {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EmploymentVerificationStatus status;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private EmployerVerification employer;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PLATFORM_IDS = "platform_ids";
  @SerializedName(SERIALIZED_NAME_PLATFORM_IDS)
  private PlatformIds platformIds;


  public EmploymentVerification status(EmploymentVerificationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentVerificationStatus getStatus() {
    return status;
  }


  public void setStatus(EmploymentVerificationStatus status) {
    this.status = status;
  }


  public EmploymentVerification startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start of employment in ISO_8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of employment in ISO_8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public EmploymentVerification endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End of employment, if applicable. In ISO_8601 format (YYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of employment, if applicable. In ISO_8601 format (YYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EmploymentVerification employer(EmployerVerification employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployerVerification getEmployer() {
    return employer;
  }


  public void setEmployer(EmployerVerification employer) {
    this.employer = employer;
  }


  public EmploymentVerification title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Current title of employee.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current title of employee.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public EmploymentVerification platformIds(PlatformIds platformIds) {
    
    this.platformIds = platformIds;
    return this;
  }

   /**
   * Get platformIds
   * @return platformIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlatformIds getPlatformIds() {
    return platformIds;
  }


  public void setPlatformIds(PlatformIds platformIds) {
    this.platformIds = platformIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentVerification employmentVerification = (EmploymentVerification) o;
    return Objects.equals(this.status, employmentVerification.status) &&
        Objects.equals(this.startDate, employmentVerification.startDate) &&
        Objects.equals(this.endDate, employmentVerification.endDate) &&
        Objects.equals(this.employer, employmentVerification.employer) &&
        Objects.equals(this.title, employmentVerification.title) &&
        Objects.equals(this.platformIds, employmentVerification.platformIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startDate, endDate, employer, title, platformIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentVerification {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    platformIds: ").append(toIndentedString(platformIds)).append("\n");
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

