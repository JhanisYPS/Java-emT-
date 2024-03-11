import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Fazer uma conexão HTTP e buscar os top 250 contents
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060"; // API do IMDB
        
        var http = new HttpClientPersonal();
        String body = http.searchData(url);
        
        //Print dos dados
        System.out.println(body);

        
        System.out.println(contentList.size());
        System.out.println(contentList.get(0));
        
        //Formatação de desafio
        

        for (Map<String,String> content : contentList) {

            //Pegar imagem grande
            String urlImagem = UrlBiggerImage.splitTextImdb(content.get("image"));

            //Pagar Json Rating em formato string
            String imDbRating = content.get("imDbRating");
            //Transforma String em Double
            double imDbStarRating = Double.parseDouble(imDbRating)/2;
            //Arredonda o Double em valor inteiro
            int imDbIntStarRating = (int)imDbStarRating;
            //Em Python seria print("*"*imDbIntStartRating), mas em java:
            // Declaração de uma variável do tipo char chamada 'a' e atribuição do valor '*' a ela.
            char a = '*';
            // Declaração de um array de caracteres chamado 'arrayDeAs' com tamanho igual à variável 'imDbIntStarRating'.
            char[] arrayDeAs = new char[imDbIntStarRating];
            // Preenche o array 'arrayDeAs' com o caractere '*' usando o método fill da classe Arrays.
            Arrays.fill(arrayDeAs, a);
            // Cria uma nova String chamada 'stringComOsAs' a partir do array 'arrayDeAs'.
            String stringComOsAs = new String(arrayDeAs);
            //\u001b[48;5;26m - Deixa o fundo do terminal azul
            //\u001b[38;5;240m - Deixa a letra cinza
            //\u001b[m - Indica final da formatação
            System.out.println("\u001b[48;5;26m\u001b[38;5;240mtitle: \u001b[m"+"\u001b[48;5;26m"+content.get("title")+ " \u001b[m");
            System.out.println(urlImagem);
            System.out.println("\u001b[38;5;220m" + stringComOsAs + "\u001b[m");
            
            //
            String titulo = content.get("title");

            InputStream inputStream = new URL(urlImagem).openStream();
            String nomeArquivo = titulo + ".png";

            StickerMaker.createSticker(inputStream, nomeArquivo);

           
        }
    }
}
