package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        File file = new File("File/01.txt");
        try {
            if (file.exists()) {
                exibirConFig(file);
            } else {
                gravarConFig(file);
            }
        } catch (IOException e) {
            System.out.println("Erro no arquivo de conFiguração");

        }
    }

    static void exibirConFig(File file) throws IOException {
        Scanner input = new Scanner(file);
        System.out.println("ConFigurações atuais: ");
        while (input.hasNext()) { // hasNext = tem Próximo
            String linha = input.nextLine();
            System.out.println(linha);
        }
        input.close();
    }

    static void gravarConFig(File file) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome, modo, idioma;

        System.out.println("Nome do PerFil: ");
        nome = sc.nextLine();

        System.out.println("Modo de tela(claro/escuro): ");
        modo = sc.nextLine();

        System.out.println("Idioma (BR/US): ");
        idioma = sc.nextLine();

        FileWriter fWriter = new FileWriter(file);
        fWriter.write(nome + "\n");
        fWriter.write(modo + "\n");
        fWriter.write(idioma + "\n");

        fWriter.flush();
        fWriter.close();
        sc.close();

    }

}
