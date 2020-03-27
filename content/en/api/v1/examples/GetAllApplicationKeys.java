import com.datadog.api.v1.client.api.KeyManagementApi;

public class KeyManagementApiExample {

    public static void main(String[] args) {
        KeyManagementApi apiInstance = new KeyManagementApi();
        try {
            ApplicationKeyListResponse result = apiInstance.getAllApplicationKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyManagementApi#getAllApplicationKeys");
            e.printStackTrace();
        }
    }
}