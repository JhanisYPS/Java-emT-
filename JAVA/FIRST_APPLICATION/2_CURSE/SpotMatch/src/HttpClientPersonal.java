import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientPersonal {
    
    public String searchData( String url){
        try {

        URI address = URI.create(url);

        HttpClientPersonal client =   HttpClientPersonal.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();

        //Como eu quero ler os dados
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        return body;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }

    private HttpResponse<String> send(HttpRequest request, BodyHandler<String> ofString) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'send'");
    }

    private static HttpClientPersonal newHttpClient() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newHttpClient'");
    }

}