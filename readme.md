# Spring boot library for Products up platform integration

ProductsUp is a feed management solution to centralize your entire products data flow with a variety of external social media platforms - https://www.productsup.com/

## Main purpose

This library provides an integration with ProductsUp platform API endpoints to interact with the platform operations [ProductsUP API's](https://api-docs.productsup.io/#introduction-into-our-apis)

## Getting started

The library is published on Maven Central. To add the library into your spring project

### Maven 

```
<dependency>
  <groupId>io.github.net-a-porter</groupId>
  <artifactId>productsup-client-spring-boot-starter</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Gradle

```
implementation 'io.github.net-a-porter:productsup-client-spring-boot-starter:1.0.0' 
```

## How to use

### ConfigurationUR Platform API token with ProductsUP>


``` 
#Add the following properties
productsup.token=<Your platform api token>

#If you are using stream
productsup.stream.enabled=true
productsup.authorization-token=Bearer <Your Stream PAT>
```

### Code

#### Using Platform API client
```java
private final PlatformApiClient platformApiClient;
var sites = this.platformApiClient.getSites();
```

#### Using Stream API client
```java
private final StreamApiClient streamApiClient;
var streams = this.streamApiClient.listStreams();
```

### Using Stream API upload client for NDJSON payloads
```java
private final StreamApiUploadClient streamUploadApiClient;
var streams = this.streamUploadApiClient.uploadChunkeddData(<stream id>, <payload>);
```

> Payload has to be of a `List<? extends BaseStreamData>`

### Error handling

For error scenarios `WebClientResponseException` will be thrown. Handle the exception to get the erorr data

```java
var exception = assertThrows(WebClientResponseException.class, () -> streamApiClient.createStream(data));
var errors = exception.getResponseBodyAs(StreamErrors.class);
```

### Enabling logging

Enable `org.springframework.http` to `DEBUG` will enable logging of request and response.

```yaml
logging:
  level:
    org.springframework.http: DEBUG
```
