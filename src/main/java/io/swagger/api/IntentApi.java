/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Intent;
import io.swagger.model.IntentCreate;
import io.swagger.model.IntentReport;
import io.swagger.model.IntentReportCreate;
import io.swagger.model.IntentReportUpdate;
import io.swagger.model.IntentUpdate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-01T08:26:49.302946800+02:00[Europe/Berlin]")
@Validated
public interface IntentApi {

    @Operation(summary = "Creates a Intent", description = "This operation creates a Intent entity.", tags={ "intent" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Intent.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" }, 
        method = RequestMethod.POST)
    ResponseEntity<Intent> createIntent(@Parameter(in = ParameterIn.DEFAULT, description = "The Intent to be created", required=true, schema=@Schema()) @Valid @RequestBody IntentCreate body);


    @Operation(summary = "Creates a IntentReport", description = "This operation creates a IntentReport entity.", tags={ "intentReport" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = IntentReport.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{intentId}/intentReport",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" }, 
        method = RequestMethod.POST)
    ResponseEntity<IntentReport> createIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId, @Parameter(in = ParameterIn.DEFAULT, description = "The IntentReport to be created", required=true, schema=@Schema()) @Valid @RequestBody IntentReportCreate body);


    @Operation(summary = "Deletes a Intent", description = "This operation deletes a Intent entity.", tags={ "intent" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Deleted"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{id}",
        produces = { "application/json;charset=utf-8" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteIntent(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Intent", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Deletes a IntentReport", description = "This operation deletes a IntentReport entity.", tags={ "intentReport" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Deleted"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{intentId}/intentReport/{id}",
        produces = { "application/json;charset=utf-8" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId, @Parameter(in = ParameterIn.PATH, description = "Identifier of the IntentReport", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "List or find Intent objects", description = "This operation list or find Intent entities", tags={ "intent" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", array = @ArraySchema(schema = @Schema(implementation = Intent.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent",
        produces = { "application/json;charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Intent>> listIntent(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields, @Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset, @Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @Operation(summary = "List or find IntentReport objects", description = "This operation list or find IntentReport entities", tags={ "intentReport" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", array = @ArraySchema(schema = @Schema(implementation = IntentReport.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{intentId}/intentReport",
        produces = { "application/json;charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<IntentReport>> listIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId, @Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields, @Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset, @Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @Operation(summary = "Updates partially a Intent", description = "This operation updates partially a Intent entity.", tags={ "intent" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Intent.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Intent> patchIntent(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Intent", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The Intent to be updated", required=true, schema=@Schema()) @Valid @RequestBody IntentUpdate body);


    @Operation(summary = "Updates partially a IntentReport", description = "This operation updates partially a IntentReport entity.", tags={ "intentReport" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = IntentReport.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{intentId}/intentReport/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<IntentReport> patchIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId, @Parameter(in = ParameterIn.PATH, description = "Identifier of the IntentReport", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The IntentReport to be updated", required=true, schema=@Schema()) @Valid @RequestBody IntentReportUpdate body);


    @Operation(summary = "Retrieves a Intent by ID", description = "This operation retrieves a Intent entity. Attribute selection is enabled for all first level attributes.", tags={ "intent" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Intent.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{id}",
        produces = { "application/json;charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<Intent> retrieveIntent(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Intent", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields);


    @Operation(summary = "Retrieves a IntentReport by ID", description = "This operation retrieves a IntentReport entity. Attribute selection is enabled for all first level attributes.", tags={ "intentReport" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = IntentReport.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json;charset&#x3D;utf-8", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/intent/{intentId}/intentReport/{id}",
        produces = { "application/json;charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<IntentReport> retrieveIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId, @Parameter(in = ParameterIn.PATH, description = "Identifier of the IntentReport", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields);

}

