package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Expression;
import io.swagger.model.TimePeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An Intent instance is the formal description of all expectations including requirements, goals, and constraints given to a technical system
 */
@Schema(description = "An Intent instance is the formal description of all expectations including requirements, goals, and constraints given to a technical system")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-01T08:26:49.302946800+02:00[Europe/Berlin]")


public class Intent   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("statusChangeDate")
  private OffsetDateTime statusChangeDate = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("expression")
  private Expression expression = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  /**
   * When sub-classing, this defines the sub-class Extensible name
   */
  public enum AtTypeEnum {
    INTENT("Intent"),
    
    PROBEINTENT("ProbeIntent"),
    
    JUDGEINTENT("JudgeIntent"),
    
    BESTINTENT("BestIntent");

    private String value;

    AtTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AtTypeEnum fromValue(String text) {
      for (AtTypeEnum b : AtTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("@type")
  private AtTypeEnum _atType = null;

  public Intent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   **/
  @Schema(description = "unique identifier")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Intent href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   **/
  @Schema(description = "Hyperlink reference")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Intent creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date and time of the creation of this Intent
   * @return creationDate
   **/
  @Schema(description = "Date and time of the creation of this Intent")
  
    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Intent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the intent.
   * @return description
   **/
  @Schema(description = "The description of the intent.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Intent lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update of this Intent
   * @return lastUpdate
   **/
  @Schema(description = "Date and time of the last update of this Intent")
  
    @Valid
    public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Intent lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status of this Intent
   * @return lifecycleStatus
   **/
  @Schema(description = "Used to indicate the current lifecycle status of this Intent")
  
    public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public Intent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the intent.
   * @return name
   **/
  @Schema(description = "The name of the intent.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Intent statusChangeDate(OffsetDateTime statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
    return this;
  }

  /**
   * A date time( DateTime). The date that the entity status changed to the current one
   * @return statusChangeDate
   **/
  @Schema(description = "A date time( DateTime). The date that the entity status changed to the current one")
  
    @Valid
    public OffsetDateTime getStatusChangeDate() {
    return statusChangeDate;
  }

  public void setStatusChangeDate(OffsetDateTime statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
  }

  public Intent version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A field that identifies the specific version of an instance of an entity. If not specified version is defaulted to 1.0
   * @return version
   **/
  @Schema(description = "A field that identifies the specific version of an instance of an entity. If not specified version is defaulted to 1.0")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Intent expression(Expression expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
   **/
  @Schema(description = "")
  
    @Valid
    public Expression getExpression() {
    return expression;
  }

  public void setExpression(Expression expression) {
    this.expression = expression;
  }

  public Intent validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   **/
  @Schema(description = "")
  
    @Valid
    public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public Intent _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @Schema(description = "When sub-classing, this defines the super-class")
  
    public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public Intent _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  
    public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public Intent _atType(AtTypeEnum _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return _atType
   **/
  @Schema(description = "When sub-classing, this defines the sub-class Extensible name")
  
    public AtTypeEnum getAtType() {
    return _atType;
  }

  public void setAtType(AtTypeEnum _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intent intent = (Intent) o;
    return Objects.equals(this.id, intent.id) &&
        Objects.equals(this.href, intent.href) &&
        Objects.equals(this.creationDate, intent.creationDate) &&
        Objects.equals(this.description, intent.description) &&
        Objects.equals(this.lastUpdate, intent.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, intent.lifecycleStatus) &&
        Objects.equals(this.name, intent.name) &&
        Objects.equals(this.statusChangeDate, intent.statusChangeDate) &&
        Objects.equals(this.version, intent.version) &&
        Objects.equals(this.expression, intent.expression) &&
        Objects.equals(this.validFor, intent.validFor) &&
        Objects.equals(this._atBaseType, intent._atBaseType) &&
        Objects.equals(this._atSchemaLocation, intent._atSchemaLocation) &&
        Objects.equals(this._atType, intent._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, creationDate, description, lastUpdate, lifecycleStatus, name, statusChangeDate, version, expression, validFor, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusChangeDate: ").append(toIndentedString(statusChangeDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
