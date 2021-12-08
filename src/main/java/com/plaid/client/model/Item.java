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
import com.plaid.client.model.Error;
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata about the Item.
 */
@ApiModel(description = "Metadata about the Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T22:16:01.337Z[GMT]")
public class Item {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_AVAILABLE_PRODUCTS = "available_products";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PRODUCTS)
  private List<Products> availableProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_BILLED_PRODUCTS = "billed_products";
  @SerializedName(SERIALIZED_NAME_BILLED_PRODUCTS)
  private List<Products> billedProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = null;

  public static final String SERIALIZED_NAME_CONSENT_EXPIRATION_TIME = "consent_expiration_time";
  @SerializedName(SERIALIZED_NAME_CONSENT_EXPIRATION_TIME)
  private OffsetDateTime consentExpirationTime;

  /**
   * Indicates whether an Item requires user interaction to be updated, which can be the case for Items with some forms of two-factor authentication.  &#x60;background&#x60; - Item can be updated in the background  &#x60;user_present_required&#x60; - Item requires user interaction to be updated
   */
  @JsonAdapter(UpdateTypeEnum.Adapter.class)
  public enum UpdateTypeEnum {
    BACKGROUND("background"),
    
    USER_PRESENT_REQUIRED("user_present_required");

    private String value;

    UpdateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateTypeEnum fromValue(String value) {
      for (UpdateTypeEnum b : UpdateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdateTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_TYPE = "update_type";
  @SerializedName(SERIALIZED_NAME_UPDATE_TYPE)
  private UpdateTypeEnum updateType;


  public Item itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Plaid Item ID. The &#x60;item_id&#x60; is always unique; linking the same account at the same institution twice will result in two Items with different &#x60;item_id&#x60; values. Like all Plaid identifiers, the &#x60;item_id&#x60; is case-sensitive.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The Plaid Item ID. The `item_id` is always unique; linking the same account at the same institution twice will result in two Items with different `item_id` values. Like all Plaid identifiers, the `item_id` is case-sensitive.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public Item institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The Plaid Institution ID associated with the Item. Field is &#x60;null&#x60; for Items created via Same Day Micro-deposits.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid Institution ID associated with the Item. Field is `null` for Items created via Same Day Micro-deposits.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public Item webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The URL registered to receive webhooks for the Item.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The URL registered to receive webhooks for the Item.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public Item error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public Item availableProducts(List<Products> availableProducts) {
    
    this.availableProducts = availableProducts;
    return this;
  }

  public Item addAvailableProductsItem(Products availableProductsItem) {
    this.availableProducts.add(availableProductsItem);
    return this;
  }

   /**
   * A list of products available for the Item that have not yet been accessed.
   * @return availableProducts
  **/
  @ApiModelProperty(required = true, value = "A list of products available for the Item that have not yet been accessed.")

  public List<Products> getAvailableProducts() {
    return availableProducts;
  }


  public void setAvailableProducts(List<Products> availableProducts) {
    this.availableProducts = availableProducts;
  }


  public Item billedProducts(List<Products> billedProducts) {
    
    this.billedProducts = billedProducts;
    return this;
  }

  public Item addBilledProductsItem(Products billedProductsItem) {
    this.billedProducts.add(billedProductsItem);
    return this;
  }

   /**
   * A list of products that have been billed for the Item. Note - &#x60;billed_products&#x60; is populated in all environments but only requests in Production are billed. 
   * @return billedProducts
  **/
  @ApiModelProperty(required = true, value = "A list of products that have been billed for the Item. Note - `billed_products` is populated in all environments but only requests in Production are billed. ")

  public List<Products> getBilledProducts() {
    return billedProducts;
  }


  public void setBilledProducts(List<Products> billedProducts) {
    this.billedProducts = billedProducts;
  }


  public Item products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public Item addProductsItem(Products productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * A list of authorized products for the Item. 
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of authorized products for the Item. ")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public Item consentExpirationTime(OffsetDateTime consentExpirationTime) {
    
    this.consentExpirationTime = consentExpirationTime;
    return this;
  }

   /**
   * The RFC 3339 timestamp after which the consent provided by the end user will expire. Upon consent expiration, the item will enter the &#x60;ITEM_LOGIN_REQUIRED&#x60; error state. To circumvent the &#x60;ITEM_LOGIN_REQUIRED&#x60; error and maintain continuous consent, the end user can reauthenticate via Link’s update mode in advance of the consent expiration time.  Note - This is only relevant for certain OAuth-based institutions. For all other institutions, this field will be null. 
   * @return consentExpirationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The RFC 3339 timestamp after which the consent provided by the end user will expire. Upon consent expiration, the item will enter the `ITEM_LOGIN_REQUIRED` error state. To circumvent the `ITEM_LOGIN_REQUIRED` error and maintain continuous consent, the end user can reauthenticate via Link’s update mode in advance of the consent expiration time.  Note - This is only relevant for certain OAuth-based institutions. For all other institutions, this field will be null. ")

  public OffsetDateTime getConsentExpirationTime() {
    return consentExpirationTime;
  }


  public void setConsentExpirationTime(OffsetDateTime consentExpirationTime) {
    this.consentExpirationTime = consentExpirationTime;
  }


  public Item updateType(UpdateTypeEnum updateType) {
    
    this.updateType = updateType;
    return this;
  }

   /**
   * Indicates whether an Item requires user interaction to be updated, which can be the case for Items with some forms of two-factor authentication.  &#x60;background&#x60; - Item can be updated in the background  &#x60;user_present_required&#x60; - Item requires user interaction to be updated
   * @return updateType
  **/
  @ApiModelProperty(required = true, value = "Indicates whether an Item requires user interaction to be updated, which can be the case for Items with some forms of two-factor authentication.  `background` - Item can be updated in the background  `user_present_required` - Item requires user interaction to be updated")

  public UpdateTypeEnum getUpdateType() {
    return updateType;
  }


  public void setUpdateType(UpdateTypeEnum updateType) {
    this.updateType = updateType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.itemId, item.itemId) &&
        Objects.equals(this.institutionId, item.institutionId) &&
        Objects.equals(this.webhook, item.webhook) &&
        Objects.equals(this.error, item.error) &&
        Objects.equals(this.availableProducts, item.availableProducts) &&
        Objects.equals(this.billedProducts, item.billedProducts) &&
        Objects.equals(this.products, item.products) &&
        Objects.equals(this.consentExpirationTime, item.consentExpirationTime) &&
        Objects.equals(this.updateType, item.updateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, institutionId, webhook, error, availableProducts, billedProducts, products, consentExpirationTime, updateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    availableProducts: ").append(toIndentedString(availableProducts)).append("\n");
    sb.append("    billedProducts: ").append(toIndentedString(billedProducts)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    consentExpirationTime: ").append(toIndentedString(consentExpirationTime)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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

