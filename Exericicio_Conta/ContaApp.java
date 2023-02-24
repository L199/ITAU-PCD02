package Exericicio_Conta;

import java.util.ArrayList;
import java.util.Scanner;

import Exericicio_Conta.Dados.GerenciaContas;

public class ContaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        GerenciaContas contas = new GerenciaContas();

        while (opcao != 7) {
            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Poupança");
            System.out.println("3- Nova Conta Especial");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Depositar");
            System.out.println("6- Sacar");
            System.out.println("7- Sair");
            System.out.print("--> ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 3:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = scanner.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                case 4:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println(contas.consultarSaldo(numeroConta));
                    break;
                case 5:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Qual o valor do depósito: ");
                    valor = scanner.nextDouble();
                    if (contas.depositar(numeroConta, valor)) { // se o depósito foi feito
                        System.out.println("Sucesso");
                    } else { // se deu erro no depósito
                        System.out.println("Falha ao depositar.");
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Qual o valor do saque: ");
                    valor = scanner.nextDouble();
                    if (contas.sacar(numeroConta, valor)) { // se o depósito foi feito
                        System.out.println("Sucesso");
                    } else { // se deu erro no depósito
                        System.out.println("Falha ao sacar.");
                    }
                    break;
                case 7:
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();

        /*
         * ContaEspecial c1=new ContaEspecial(123,100);
         * 
         * System.out.println(c1);
         * 
         * ContaPoupanca.setTaxaSaque(0.1);
         * 
         * c1.depositar(100);
         * System.out.println(c1);
         * 
         * if (c1.sacar(50)){
         * System.out.println("Sucesso");
         * System.out.println(c1);
         * } else{
         * System.out.println("Não i possível Fazer o saque");
         * }
         * 
         * if (c1.sacar(100)){
         * System.out.println("Sucesso");
         * System.out.println(c1);
         * } else{
         * System.out.println("Não i possível Fazer o saque");
         * }
         * 
         * c1.sacar(-50);
         * System.out.println(c1);
         */
    }

}
