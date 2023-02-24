package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo09 {
    public static void main(String[] args) throws IOException {
        FileReader fReader = new FileReader("File/arquivo.txt");
        String saida = "";
        int letra;

        while((letra=fReader.read())!=-1){
            saida = saida +(char) letra;
        }

        System.out.println(saida);

        fReader.close();

    }

}
