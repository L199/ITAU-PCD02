package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo11 {
    public static void main(String[] args) throws IOException {
        File file = new File("File/File.txt");
        FileWriter fWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        String texto = "Texto de exemplo";
        // grava usando um buFFer de memoria ao invés de gravar diretamente no disco
        // isso melhora o desempenho para o caso de gravação de grande volume de dados
        bWriter.write(texto);
        bWriter.close();
        fWriter.close();
    }
}
