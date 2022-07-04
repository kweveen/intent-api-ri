package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TurtleExpression is the ontology-encoded form of the Intent as Turtle RDF
 */
@Schema(description = "TurtleExpression is the ontology-encoded form of the Intent as Turtle RDF")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-01T08:26:49.302946800+02:00[Europe/Berlin]")


public class TurtleExpression   {
  @JsonProperty("expressionLanguage")
  private String expressionLanguage = null;

  @JsonProperty("expressionValue")
  private String expressionValue = null;

  @JsonProperty("iri")
  private String iri = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public TurtleExpression expressionLanguage(String expressionLanguage) {
    this.expressionLanguage = expressionLanguage;
    return this;
  }

  /**
   * The serialized Expression language of the intent serialized.
   * @return expressionLanguage
   **/
  @Schema(description = "The serialized Expression language of the intent serialized.")
  
    public String getExpressionLanguage() {
    return expressionLanguage;
  }

  public void setExpressionLanguage(String expressionLanguage) {
    this.expressionLanguage = expressionLanguage;
  }

  public TurtleExpression expressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
    return this;
  }

  /**
   * TurtleExpression is the ontology-encoded form of the Intent as Turtle RDF as defined in https://www.w3.org/TR/turtle/
   * @return expressionValue
   **/
  @Schema(description = "TurtleExpression is the ontology-encoded form of the Intent as Turtle RDF as defined in https://www.w3.org/TR/turtle/")
  
    public String getExpressionValue() {
    return expressionValue;
  }

  public void setExpressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
  }

  public TurtleExpression iri(String iri) {
    this.iri = iri;
    return this;
  }

  /**
   * Internationalized Resource Identifier of the intent Expression
   * @return iri
   **/
  @Schema(description = "Internationalized Resource Identifier of the intent Expression")
  
    public String getIri() {
    return iri;
  }

  public void setIri(String iri) {
    this.iri = iri;
  }

  public TurtleExpression _atBaseType(String _atBaseType) {
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

  public TurtleExpression _atSchemaLocation(String _atSchemaLocation) {
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

  public TurtleExpression _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return _atType
   **/
  @Schema(description = "When sub-classing, this defines the sub-class Extensible name")
  
    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
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
    TurtleExpression turtleExpression = (TurtleExpression) o;
    return Objects.equals(this.expressionLanguage, turtleExpression.expressionLanguage) &&
        Objects.equals(this.expressionValue, turtleExpression.expressionValue) &&
        Objects.equals(this.iri, turtleExpression.iri) &&
        Objects.equals(this._atBaseType, turtleExpression._atBaseType) &&
        Objects.equals(this._atSchemaLocation, turtleExpression._atSchemaLocation) &&
        Objects.equals(this._atType, turtleExpression._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionLanguage, expressionValue, iri, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurtleExpression {\n");
    
    sb.append("    expressionLanguage: ").append(toIndentedString(expressionLanguage)).append("\n");
    sb.append("    expressionValue: ").append(toIndentedString(expressionValue)).append("\n");
    sb.append("    iri: ").append(toIndentedString(iri)).append("\n");
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
