package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) throws IOException {
        File file = new File("File/arquivo.txt");

        // direciona o Scanner para ler o File (arquivo)
        Scanner sc = new Scanner(file);

        //enquanto existe mais conteudo para ler
        while(sc.hasNext()){ //hasNext = tem Próximo
            String linha = sc.nextLine();
            System.out.println(linha);
        }
        sc.close();
    }
}
