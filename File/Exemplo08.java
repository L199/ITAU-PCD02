package File;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo08 {
    public static void main(String[] args) throws IOException {
    FileWriter FWriter = new FileWriter("File/arquivo.txt",true);
    String texto = "\nLinha de deu \nOutra oi";
    FWriter.write(texto);
    FWriter.close();
    }
}
