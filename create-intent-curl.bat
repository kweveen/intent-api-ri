curl -X "POST" ^
  "http://10.220.239.92:8090/tmf-api/intent/v4/intent" ^
  -H "accept: application/json;charset=utf-8" ^
  -H "Content-Type: application/json;charset=utf-8" ^
  -d ^
"{^
  ""creationDate"": ""2022-06-30T15:43:40.917Z"",^
  ""description"": ""string"",^
  ""lastUpdate"": ""2022-06-30T15:43:40.917Z"",^
  ""lifecycleStatus"": ""string"",^
  ""name"": ""string"",^
  ""statusChangeDate"": ""2022-06-30T15:43:40.917Z"",^
  ""version"": ""string"",^
  ""expression"": {^
    ""expressionLanguage"": ""string"",^
    ""iri"": ""string"",^
    ""@baseType"": ""string"",^
    ""@schemaLocation"": ""string"",^
    ""@type"": ""string""^
  },^
  ""validFor"": {^
    ""endDateTime"": ""1985-04-12T23:20:50.52Z"",^
    ""startDateTime"": ""1985-04-12T23:20:50.52Z""^
  },^
  ""@baseType"": ""string"",^
  ""@schemaLocation"": ""string"",^
  ""@type"": ""string""^
}"
