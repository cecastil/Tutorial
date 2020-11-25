package Orelly;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class UseHttpClientForSynchronousHTTPCommunication {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        HttpResponse response = null;
        try {
            String urlEndPoint = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
            URI uri = URI.create(urlEndPoint + "?foo1=bar1&foo2=bar2");
            HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Headers: " + response.headers().allValues("content-type"));
        System.out.println("Body: " + response.body());
    }
}

/*
HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        try {
            String urlEndPoint = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
            URI uri = URI.create(urlEndPoint + "?foo1=bar1&foo2=bar2");
            HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

       }
       }



 */