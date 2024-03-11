import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImdbContentExtractor implements ContentExtractor {

    public List<Content> ContentExtract(String json) {

        // Extrair dados de foco: título, poster, classificação
        JsonParser parser = new JsonParser();
        List<Map<String, String>> contentList = parser.parse(json);

        List<Content> contents = new ArrayList<>();

        // popular a lista
        for (Map<String, String> values : contentList) {
            String title = values.get("title");
            //Pegar imagem grande
            String urlImage = UrlBiggerImage.splitTextImdb(values.get("image"));

            Content content = new Content(title, urlImage);

            contents.add(content);
        }

        return contents;
    }
}
    