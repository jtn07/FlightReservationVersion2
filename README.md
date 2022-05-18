# flightReservationVersion2
Version 2
Flight Reservation

Version 2 updates:

1.Email util

2.PDG Generation Util

3.Spring security for authentication and authorization.

Up comming version (3.0) !!

Working on implementing rate limiter microservice to limit the requests in order to protect application going down and reject the requests from hackers trying to bring down the
application by trigging automatic requests using Internal Protocol (IP) address.

Model Diagram.
<p align ="center">
<img src="https://user-images.githubusercontent.com/51705706/137016160-58d37139-0cf7-4a68-b13f-c67083a8394e.jpg" width="300" height="300">
</p>



All URIs are relative to *https://flightReservationVersion2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeReservation**](DefaultApi.md#completeReservation) | **POST** /completeReservation | POST completeReservation
[**login**](DefaultApi.md#login) | **POST** /login | POST login
[**register**](DefaultApi.md#register) | **POST** /registerUser | POST registerUser


<a name="completeReservation"></a>
# **completeReservation**
> completeReservation()

POST completeReservation

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
    defaultClient.setBasePath("https://flightReservationVersion2");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.completeReservation();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#completeReservation");
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

<a name="login"></a>
# **login**
> login(email, password)

POST login

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
    defaultClient.setBasePath("https://flightReservationVersion2");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | 
    String password = "password_example"; // String | 
    try {
      apiInstance.login(email, password);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#login");
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
**email** | **String**|  |
**password** | **String**|  |

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

<a name="register"></a>
# **register**
> register()

POST registerUser

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
    defaultClient.setBasePath("https://flightReservationVersion2");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.register();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#register");
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




