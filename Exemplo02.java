import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 567;
        boolean entradaInvalida = true;
        while (entradaInvalida) {
            try {
                System.out.println("Digite um número: ");
                numero = entrada.nextInt();
                entradaInvalida = false;

            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um valor inteiro. ");
                entrada.nextLine();
            }
        }
        System.out.println("Você digitou: "+numero);

        entrada.close();

    }
}
