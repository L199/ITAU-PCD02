import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = null;
        int numero = 0;

        try {
            entrada= new Scanner(System.in);
            System.out.println("Digite um número: ");
            // numero = entrada.nextInt();
            numero = Integer.parseInt(entrada.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! ");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Classe: " + e.getClass().getName());

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! ");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Causa: " + e.getClass().getName());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro..");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Classe: " + e.getClass().getName());
        }finally{
            System.out.println("Fechar conexões...");

            try {
                entrada.close();
            } catch (Exception e) {
                // TODO: handle exception
            }


            
        }
    }
}
