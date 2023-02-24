import java.util.Scanner;
import java.util.InputMismatchException;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        try {

            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ");
            //e.getMessage pode trazer a mensagem de erro, caso o a Exception tenha uma mensagem
            System.out.println("Mensagem: "+e.getMessage());
            //podemos capturar toda a stack (pilha) de chamadas de métodos
            e.printStackTrace();
            
            numero=0; // um possivel tratamento para a lta de valor digitado
        }
        System.out.println("Você digitou: " + numero);
        System.out.println("Final do programa.");
        entrada.close();

    }

}
