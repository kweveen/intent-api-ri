package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.IntentReport;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@Schema(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-01T08:26:49.302946800+02:00[Europe/Berlin]")


public class IntentReportDeleteEventPayload   {
  @JsonProperty("intentReport")
  private IntentReport intentReport = null;

  public IntentReportDeleteEventPayload intentReport(IntentReport intentReport) {
    this.intentReport = intentReport;
    return this;
  }

  /**
   * Get intentReport
   * @return intentReport
   **/
  @Schema(description = "")
  
    @Valid
    public IntentReport getIntentReport() {
    return intentReport;
  }

  public void setIntentReport(IntentReport intentReport) {
    this.intentReport = intentReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentReportDeleteEventPayload intentReportDeleteEventPayload = (IntentReportDeleteEventPayload) o;
    return Objects.equals(this.intentReport, intentReportDeleteEventPayload.intentReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentReportDeleteEventPayload {\n");
    
    sb.append("    intentReport: ").append(toIndentedString(intentReport)).append("\n");
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
