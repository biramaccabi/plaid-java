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
import com.plaid.client.model.CreditFreddieMacPartyIndividualVOA24;
import com.plaid.client.model.Roles;
import com.plaid.client.model.TaxpayerIdentifiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A collection of information about a single party to a transaction. Included direct participants like the borrower and seller as well as indirect participants such as the flood certificate provider.
 */
@ApiModel(description = "A collection of information about a single party to a transaction. Included direct participants like the borrower and seller as well as indirect participants such as the flood certificate provider.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T17:46:09.980340Z[Etc/UTC]")
public class CreditFreddieMacPartyVOA24 {
  public static final String SERIALIZED_NAME_I_N_D_I_V_I_D_U_A_L = "INDIVIDUAL";
  @SerializedName(SERIALIZED_NAME_I_N_D_I_V_I_D_U_A_L)
  private CreditFreddieMacPartyIndividualVOA24 INDIVIDUAL;

  public static final String SERIALIZED_NAME_R_O_L_E_S = "ROLES";
  @SerializedName(SERIALIZED_NAME_R_O_L_E_S)
  private Roles ROLES;

  public static final String SERIALIZED_NAME_T_A_X_P_A_Y_E_R_I_D_E_N_T_I_F_I_E_R_S = "TAXPAYER_IDENTIFIERS";
  @SerializedName(SERIALIZED_NAME_T_A_X_P_A_Y_E_R_I_D_E_N_T_I_F_I_E_R_S)
  private TaxpayerIdentifiers TAXPAYER_IDENTIFIERS;


  public CreditFreddieMacPartyVOA24 INDIVIDUAL(CreditFreddieMacPartyIndividualVOA24 INDIVIDUAL) {
    
    this.INDIVIDUAL = INDIVIDUAL;
    return this;
  }

   /**
   * Get INDIVIDUAL
   * @return INDIVIDUAL
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacPartyIndividualVOA24 getINDIVIDUAL() {
    return INDIVIDUAL;
  }


  public void setINDIVIDUAL(CreditFreddieMacPartyIndividualVOA24 INDIVIDUAL) {
    this.INDIVIDUAL = INDIVIDUAL;
  }


  public CreditFreddieMacPartyVOA24 ROLES(Roles ROLES) {
    
    this.ROLES = ROLES;
    return this;
  }

   /**
   * Get ROLES
   * @return ROLES
  **/
  @ApiModelProperty(required = true, value = "")

  public Roles getROLES() {
    return ROLES;
  }


  public void setROLES(Roles ROLES) {
    this.ROLES = ROLES;
  }


  public CreditFreddieMacPartyVOA24 TAXPAYER_IDENTIFIERS(TaxpayerIdentifiers TAXPAYER_IDENTIFIERS) {
    
    this.TAXPAYER_IDENTIFIERS = TAXPAYER_IDENTIFIERS;
    return this;
  }

   /**
   * Get TAXPAYER_IDENTIFIERS
   * @return TAXPAYER_IDENTIFIERS
  **/
  @ApiModelProperty(required = true, value = "")

  public TaxpayerIdentifiers getTAXPAYERIDENTIFIERS() {
    return TAXPAYER_IDENTIFIERS;
  }


  public void setTAXPAYERIDENTIFIERS(TaxpayerIdentifiers TAXPAYER_IDENTIFIERS) {
    this.TAXPAYER_IDENTIFIERS = TAXPAYER_IDENTIFIERS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacPartyVOA24 creditFreddieMacPartyVOA24 = (CreditFreddieMacPartyVOA24) o;
    return Objects.equals(this.INDIVIDUAL, creditFreddieMacPartyVOA24.INDIVIDUAL) &&
        Objects.equals(this.ROLES, creditFreddieMacPartyVOA24.ROLES) &&
        Objects.equals(this.TAXPAYER_IDENTIFIERS, creditFreddieMacPartyVOA24.TAXPAYER_IDENTIFIERS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(INDIVIDUAL, ROLES, TAXPAYER_IDENTIFIERS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacPartyVOA24 {\n");
    sb.append("    INDIVIDUAL: ").append(toIndentedString(INDIVIDUAL)).append("\n");
    sb.append("    ROLES: ").append(toIndentedString(ROLES)).append("\n");
    sb.append("    TAXPAYER_IDENTIFIERS: ").append(toIndentedString(TAXPAYER_IDENTIFIERS)).append("\n");
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
