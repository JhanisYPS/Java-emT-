import java.net.*;

public class UrlBiggerImage {

    static String splitTextImdb(String urlImagem) {
        try {
            java.net.URL url = new URI(urlImagem).toURL();
            String path = url.getPath();
            
            // Find the index of "@." and ".jpg" in the path
            int startIndex = path.indexOf("@") + 1; // Adding 1 to skip "@"
            int endIndex = path.indexOf(".jpg");

            // Extract the substring between "@." and ".jpg"
            String splitText = path.substring(startIndex, endIndex);

            String result = urlImagem.replaceAll(splitText, "");
            
            return result;
        } catch (MalformedURLException | URISyntaxException | StringIndexOutOfBoundsException e) {
            // Handle the exceptions, you can print the stack trace or return a default value
            e.printStackTrace();
            return "Error: Invalid URL";
        }
    }

}
