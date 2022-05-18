

TaskManager API
- API version: 1.0.0
  - Build date: 2022-05-18T15:00:02.017655500+05:30[Asia/Calcutta]

TaskManager API



## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://TaskManager");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BigDecimal id = new BigDecimal(78); // BigDecimal | 
    try {
      apiInstance.addNotesToTask(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addNotesToTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://TaskManager*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addNotesToTask**](docs/DefaultApi.md#addNotesToTask) | **POST** /tasks/{id}/notes/ | POST tasks/{id}/notes/
*DefaultApi* | [**createTask**](docs/DefaultApi.md#createTask) | **POST** /tasks/ | POST tasks/
*DefaultApi* | [**deleteAllNotesByTaskId**](docs/DefaultApi.md#deleteAllNotesByTaskId) | **DELETE** /tasks/{id}/notes/ | DELETE tasks/{id}/notes/
*DefaultApi* | [**deleteTaskById**](docs/DefaultApi.md#deleteTaskById) | **DELETE** /tasks/{id} | DELETE tasks/{id}
*DefaultApi* | [**editTaskById**](docs/DefaultApi.md#editTaskById) | **PATCH** /tasks | PATCH tasks
*DefaultApi* | [**getAllNotesByTaskId**](docs/DefaultApi.md#getAllNotesByTaskId) | **GET** /tasks/{id}/notes/ | GET tasks/{id}/notes/
*DefaultApi* | [**getAllTasks**](docs/DefaultApi.md#getAllTasks) | **GET** /tasks/ | GET tasks/
*DefaultApi* | [**getTaskById**](docs/DefaultApi.md#getTaskById) | **GET** /tasks/{id} | GET tasks/{id}


## Documentation for Models



## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



