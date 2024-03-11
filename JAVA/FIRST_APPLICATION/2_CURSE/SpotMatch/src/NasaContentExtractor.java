import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NasaContentExtractor implements ContentExtractor {

    public List<Content> ContentExtract(String json) {

        // Extrair dados de foco: título, poster, classificação
        JsonParser parser = new JsonParser();
        List<Map<String, String>> contentList = parser.parse(json);

        List<Content> contents = new ArrayList<>();

        // popular a lista
        for (Map<String, String> values : contentList) {
            String title = values.get("title");
            String urlImage = values.get("hdurl");

            Content content = new Content(title, urlImage);

            contents.add(content);
        }

        return contents;
    }
}