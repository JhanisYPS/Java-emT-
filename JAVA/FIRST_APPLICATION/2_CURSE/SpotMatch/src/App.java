import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Fazer uma conexão HTTP e buscar os top 250 filmes
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060"; // API do IMDB
        URI address = URI.create(url);

        HttpClient client =   HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();

        //Como eu quero ler os dados
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        //Print dos dados
        System.out.println(body);

        // Extrair dados de foco: título, poster, classificação
        JsonParser parser = new JsonParser();
        List<Map<String, String>> filmsList = parser.parse(body);
        System.out.println(filmsList.size());
        System.out.println(filmsList.get(0));


        for (Map<String,String> film : filmsList) {
            System.out.println(film.get("title"));
            System.out.println(film.get("image"));
            System.out.println(film.get("imDbRating"));
           
        }
    }
}
