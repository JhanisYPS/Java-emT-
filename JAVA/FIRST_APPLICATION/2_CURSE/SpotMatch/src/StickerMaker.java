import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.text.AttributedString;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;

public class StickerMaker {

    static void createSticker(InputStream inputStream, String fileName) throws MalformedURLException, IOException{

        // Leitura da imagem
        //InputStream inputStream = 
        //                 new URL("https://m.media-amazon.com/images/M/MV5BMGEzN2VkMmUtMGMboundariesZi00Y2UboundariesLTlkMDktMTlhMTdmYzZmZDlhXkEyXkFqcGdeQXVyODEyNjEwMDk@._Vboundaries_UXboundaries28_CR0,3,boundaries28,boundaries76_AL_.jpg")
        //                 .openStream();
        BufferedImage originalImage = ImageIO.read(inputStream);
        
        // cria nova imagem em memória com transparência e com tamanho novo
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        int newheight = height + 40;
        BufferedImage newImagem = new BufferedImage(width, newheight, BufferedImage.TRANSLUCENT);

        // copiar a imagem original pra novo imagem (em memória)
        Graphics2D graphics = (Graphics2D) newImagem.getGraphics();
        graphics.drawImage(originalImage, 0, 0, null);

        // configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 20);

        
        
        // Centralizar texto
        String stringSticker = "TOPZERA";

        AttributedString attributedText = new AttributedString(stringSticker);
        attributedText.addAttribute(TextAttribute.FONT, fonte);
        attributedText.addAttribute(TextAttribute.FOREGROUND, Color.BLACK);
        
        //Pegando as informações do gráfico, temanho da fonte, tipo de fonte, tudo.
        FontMetrics stringStickMetrics = graphics.getFontMetrics();

        //Largura da imagem menos comprimento da palavra, dividido por dois, para ficar ao centro
        int x = (width - stringStickMetrics.stringWidth(stringSticker))/4;
        //heiht = altura da figura, agr precisa somar a altura da letra
        int y = (newheight - stringStickMetrics.getHeight());

        int boundariesWidth = 1;

        // Draw text outline
        graphics.drawString(attributedText.getIterator(), x - boundariesWidth, y - boundariesWidth); // shift by one pixel
        graphics.drawString(attributedText.getIterator(), x + boundariesWidth, y + boundariesWidth); // shift by one pixel
        graphics.drawString(attributedText.getIterator(), x - boundariesWidth, y + boundariesWidth); // shift by one pixel
        graphics.drawString(attributedText.getIterator(), x + boundariesWidth, y - boundariesWidth); // shift by one pixel

        // Draw filled text
        attributedText.addAttribute(TextAttribute.FOREGROUND, Color.YELLOW);
        graphics.drawString(attributedText.getIterator(), x, y);

    
        //salvar imagem gerada
        ImageIO.write(newImagem, "png", new File("JAVA\\FIRST_APPLICATION\\2_CURSE\\SpotMatch\\src\\output\\" + fileName));
    }
}