#!/bin/bash
set -e

curl -v -d '{"token":"value1", "key2":"value2"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/v1/token  | jq .
