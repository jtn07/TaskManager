# TaskManager

Simple web application to create Tasks and include due data to complete tasks.

# DefaultApi

All URIs are relative to *https://TaskManager*

Method | HTTP request               | Description
------------- |----------------------------| -------------
[**addNotesToTask**](DefaultApi.md#addNotesToTask) | **POST** /tasks/{id}/notes/ | POST tasks/{id}/notes/
[**createTask**](DefaultApi.md#createTask) | **POST** /tasks/           | POST tasks/
[**deleteAllNotesByTaskId**](DefaultApi.md#deleteAllNotesByTaskId) | **DELETE** /tasks/{id}/notes/ | DELETE tasks/{id}/notes/
[**deleteTaskById**](DefaultApi.md#deleteTaskById) | **DELETE** /tasks/{id}     | DELETE tasks/{id}
[**editTaskById**](DefaultApi.md#editTaskById) | **PATCH** /tasks           | PATCH tasks
[**getAllNotesByTaskId**](DefaultApi.md#getAllNotesByTaskId) | **GET** /tasks/{id}/notes/ | GET tasks/{id}/notes/
[**getAllTasks**](DefaultApi.md#getAllTasks) | **GET** /tasks/            | GET tasks/
[**getTaskById**](DefaultApi.md#getTaskById) | **GET** /tasks/{id}        | GET tasks/{id}


<a name="addNotesToTask"></a>
# **addNotesToTask**
> addNotesToTask(id)

POST tasks/{id}/notes/

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createTask"></a>
# **createTask**
> createTask()

POST tasks/

### Example
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
    try {
      apiInstance.createTask();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteAllNotesByTaskId"></a>
# **deleteAllNotesByTaskId**
> deleteAllNotesByTaskId(id)

DELETE tasks/{id}/notes/

### Example
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
      apiInstance.deleteAllNotesByTaskId(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteAllNotesByTaskId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteTaskById"></a>
# **deleteTaskById**
> deleteTaskById(id)

DELETE tasks/{id}

### Example
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
      apiInstance.deleteTaskById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteTaskById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="editTaskById"></a>
# **editTaskById**
> editTaskById()

PATCH tasks

### Example
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
    try {
      apiInstance.editTaskById();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#editTaskById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllNotesByTaskId"></a>
# **getAllNotesByTaskId**
> getAllNotesByTaskId(id)

GET tasks/{id}/notes/

### Example
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
      apiInstance.getAllNotesByTaskId(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAllNotesByTaskId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllTasks"></a>
# **getAllTasks**
> getAllTasks()

GET tasks/

### Example
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
    try {
      apiInstance.getAllTasks();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAllTasks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getTaskById"></a>
# **getTaskById**
> getTaskById(id)

GET tasks/{id}

### Example
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
      apiInstance.getTaskById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTaskById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |



