package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Intent;
import io.swagger.model.IntentCreate;
import io.swagger.model.IntentReport;
import io.swagger.model.IntentReportCreate;
import io.swagger.model.IntentReportUpdate;
import io.swagger.model.IntentUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-01T08:26:49.302946800+02:00[Europe/Berlin]")
@RestController
public class IntentApiController implements IntentApi {

    private static final Logger log = LoggerFactory.getLogger(IntentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IntentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Intent> createIntent(@Parameter(in = ParameterIn.DEFAULT, description = "The Intent to be created", required=true, schema=@Schema()) @Valid @RequestBody IntentCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Intent>(objectMapper.readValue("{\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/intentcreatebyfer\"\r\n  },\r\n  \"lifecycleStatus\" : \"lifecycleStatus\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"Intent\",\r\n  \"description\" : \"description\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"version\" : \"version\",\r\n  \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@baseType\" : \"@baseType\",\r\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"name\" : \"name\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n}", Intent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Intent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Intent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IntentReport> createIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId,@Parameter(in = ParameterIn.DEFAULT, description = "The IntentReport to be created", required=true, schema=@Schema()) @Valid @RequestBody IntentReportCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IntentReport>(objectMapper.readValue("{\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"@baseType\" : \"@baseType\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"@type\",\r\n  \"name\" : \"name\",\r\n  \"description\" : \"description\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\r\n  \"intent\" : {\r\n    \"expression\" : {\r\n      \"iri\" : \"iri\",\r\n      \"@baseType\" : \"@baseType\",\r\n      \"@type\" : \"@type\",\r\n      \"expressionLanguage\" : \"expressionLanguage\",\r\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n    },\r\n    \"lifecycleStatus\" : \"lifecycleStatus\",\r\n    \"validFor\" : {\r\n      \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n      \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n    },\r\n    \"@type\" : \"Intent\",\r\n    \"description\" : \"description\",\r\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"version\" : \"version\",\r\n    \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"name\" : \"name\",\r\n    \"id\" : \"id\",\r\n    \"href\" : \"http://example.com/aeiou\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  }\r\n}", IntentReport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IntentReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IntentReport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteIntent(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Intent", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId,@Parameter(in = ParameterIn.PATH, description = "Identifier of the IntentReport", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Intent>> listIntent(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Intent>>(objectMapper.readValue("[ {\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"lifecycleStatus\" : \"lifecycleStatus\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"Intent\",\r\n  \"description\" : \"This is the intent created for Kevin\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"version\" : \"version\",\r\n  \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@baseType\" : \"@baseType\",\r\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"name\" : \"name\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n}, {\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"lifecycleStatus\" : \"lifecycleStatus\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"Intent\",\r\n  \"description\" : \"description\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"version\" : \"version\",\r\n  \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@baseType\" : \"@baseType\",\r\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"name\" : \"name\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Intent>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Intent>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<IntentReport>> listIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<IntentReport>>(objectMapper.readValue("[ {\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"@baseType\" : \"@baseType\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"@type\",\r\n  \"name\" : \"name\",\r\n  \"description\" : \"description\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\r\n  \"intent\" : {\r\n    \"expression\" : {\r\n      \"iri\" : \"iri\",\r\n      \"@baseType\" : \"@baseType\",\r\n      \"@type\" : \"@type\",\r\n      \"expressionLanguage\" : \"expressionLanguage\",\r\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n    },\r\n    \"lifecycleStatus\" : \"lifecycleStatus\",\r\n    \"validFor\" : {\r\n      \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n      \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n    },\r\n    \"@type\" : \"Intent\",\r\n    \"description\" : \"description\",\r\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"version\" : \"version\",\r\n    \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"name\" : \"name\",\r\n    \"id\" : \"id\",\r\n    \"href\" : \"http://example.com/aeiou\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  }\r\n}, {\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"@baseType\" : \"@baseType\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"@type\",\r\n  \"name\" : \"name\",\r\n  \"description\" : \"description\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\r\n  \"intent\" : {\r\n    \"expression\" : {\r\n      \"iri\" : \"iri\",\r\n      \"@baseType\" : \"@baseType\",\r\n      \"@type\" : \"@type\",\r\n      \"expressionLanguage\" : \"expressionLanguage\",\r\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n    },\r\n    \"lifecycleStatus\" : \"lifecycleStatus\",\r\n    \"validFor\" : {\r\n      \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n      \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n    },\r\n    \"@type\" : \"Intent\",\r\n    \"description\" : \"description\",\r\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"version\" : \"version\",\r\n    \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"name\" : \"name\",\r\n    \"id\" : \"id\",\r\n    \"href\" : \"http://example.com/aeiou\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  }\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<IntentReport>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<IntentReport>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Intent> patchIntent(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Intent", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The Intent to be updated", required=true, schema=@Schema()) @Valid @RequestBody IntentUpdate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Intent>(objectMapper.readValue("{\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"lifecycleStatus\" : \"lifecycleStatus\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"Intent\",\r\n  \"description\" : \"description\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"version\" : \"version\",\r\n  \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@baseType\" : \"@baseType\",\r\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"name\" : \"name\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n}", Intent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Intent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Intent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IntentReport> patchIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId,@Parameter(in = ParameterIn.PATH, description = "Identifier of the IntentReport", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The IntentReport to be updated", required=true, schema=@Schema()) @Valid @RequestBody IntentReportUpdate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IntentReport>(objectMapper.readValue("{\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"@baseType\" : \"@baseType\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"@type\",\r\n  \"name\" : \"name\",\r\n  \"description\" : \"description\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\r\n  \"intent\" : {\r\n    \"expression\" : {\r\n      \"iri\" : \"iri\",\r\n      \"@baseType\" : \"@baseType\",\r\n      \"@type\" : \"@type\",\r\n      \"expressionLanguage\" : \"expressionLanguage\",\r\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n    },\r\n    \"lifecycleStatus\" : \"lifecycleStatus\",\r\n    \"validFor\" : {\r\n      \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n      \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n    },\r\n    \"@type\" : \"Intent\",\r\n    \"description\" : \"description\",\r\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"version\" : \"version\",\r\n    \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"name\" : \"name\",\r\n    \"id\" : \"id\",\r\n    \"href\" : \"http://example.com/aeiou\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  }\r\n}", IntentReport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IntentReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IntentReport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Intent> retrieveIntent(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Intent", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Intent>(objectMapper.readValue("{\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"lifecycleStatus\" : \"lifecycleStatus\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"Intent\",\r\n  \"description\" : \"description\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"version\" : \"version\",\r\n  \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@baseType\" : \"@baseType\",\r\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"name\" : \"name\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n}", Intent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Intent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Intent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IntentReport> retrieveIntentReport(@Parameter(in = ParameterIn.PATH, description = "Identifier of the parent Intent entity", required=true, schema=@Schema()) @PathVariable("intentId") String intentId,@Parameter(in = ParameterIn.PATH, description = "Identifier of the IntentReport", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IntentReport>(objectMapper.readValue("{\r\n  \"expression\" : {\r\n    \"iri\" : \"iri\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"@type\" : \"@type\",\r\n    \"expressionLanguage\" : \"expressionLanguage\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  },\r\n  \"@baseType\" : \"@baseType\",\r\n  \"validFor\" : {\r\n    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n  },\r\n  \"@type\" : \"@type\",\r\n  \"name\" : \"name\",\r\n  \"description\" : \"description\",\r\n  \"id\" : \"id\",\r\n  \"href\" : \"http://example.com/aeiou\",\r\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\r\n  \"intent\" : {\r\n    \"expression\" : {\r\n      \"iri\" : \"iri\",\r\n      \"@baseType\" : \"@baseType\",\r\n      \"@type\" : \"@type\",\r\n      \"expressionLanguage\" : \"expressionLanguage\",\r\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n    },\r\n    \"lifecycleStatus\" : \"lifecycleStatus\",\r\n    \"validFor\" : {\r\n      \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",\r\n      \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"\r\n    },\r\n    \"@type\" : \"Intent\",\r\n    \"description\" : \"description\",\r\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"version\" : \"version\",\r\n    \"statusChangeDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"@baseType\" : \"@baseType\",\r\n    \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"name\" : \"name\",\r\n    \"id\" : \"id\",\r\n    \"href\" : \"http://example.com/aeiou\",\r\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\r\n  }\r\n}", IntentReport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IntentReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IntentReport>(HttpStatus.NOT_IMPLEMENTED);
    }

}
