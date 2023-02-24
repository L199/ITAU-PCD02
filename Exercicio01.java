import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = null;
        int num1, num2;
        boolean invalido = true;
        while (invalido) {

            try {
                sc = new Scanner(System.in);
                System.out.println("Digite um número inteiro: ");
                num1 = sc.nextInt();

                System.out.println("Digite outro número inteiro: ");
                num2 = sc.nextInt();

                Calculadora(num1, num2);
            } catch (InputMismatchException e) {
                System.out.println("Digitação inválida");
                sc.nextLine();

            } catch (NoSuchElementException e) {
                System.out.println("Digitação inválida ");
                sc.nextLine();
                sc.close();
            }
        }
    }

    private static void Calculadora(int num1, int num2) throws NoSuchElementException {
        Scanner sc = null;
        try {
            int opcao = 5;
            sc = new Scanner(System.in);
            System.out.println("\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - Sair\n\n");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtracao: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicacao: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Divisao: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Saindo...\n");
                    break;
                default:
                System.out.println("Opção Invalida");
                break;

            }
        } catch (NoSuchElementException e) {
            System.out.println("Erro switch");
            sc.close();
        }
        
    }
}
