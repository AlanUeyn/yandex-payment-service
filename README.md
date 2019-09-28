# yandex-payment-service

## Description

The payment service that used sharding mechanism for distribution
payment info between three databases.

## Dev Notes

Used:

* Apache ShardingSphere
* H2 in-memory database



## Quick start

1. Clone repository
2. Move to the project folder
3. Execute the following commands

```
For Windows:

gradlew bootRun

For Linux:

./gradlew bootRun
```

API info: http://localhost:8080/swagger-ui.html