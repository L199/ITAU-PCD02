package Exericicio_Conta.Dados;

import java.util.ArrayList;

import Exericicio_Conta.Conta;
import Exericicio_Conta.ContaCorrente;
import Exericicio_Conta.ContaEspecial;
import Exericicio_Conta.ContaPoupanca;

public class GerenciaContas {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContas() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaDeContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.add(new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.add(new ContaEspecial(numeroConta, limite));
    }

    public String consultarSaldo(int numeroConta) {
        // Para cada conta da ListaDeContas
        for (Conta conta : listaDeContas) {
            // Verifique se esta conta tem o número que estamos procurando
            if (conta.getNumero() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não encontrada";
    }

    public boolean depositar(int numeroConta, double valor) {
        // Para cada conta da ListaDeContas
        for (Conta conta : listaDeContas) {
            // Verifique se esta conta tem o número que estamos procurando
            if (conta.getNumero() == numeroConta) {
                // tenta fazer o depósito
                return conta.depositar(valor);
            }
        }
        return false; // não achou a conta
    }

    public boolean sacar(int numeroConta, double valor) {
        // Para cada conta da ListaDeContas
        for (Conta conta : listaDeContas) {
            // Verifique se esta conta tem o número que estamos procurando
            if (conta.getNumero() == numeroConta) {
                // tenta fazer o depósito
                return conta.sacar(valor);
            }
        }
        return false; // não achou a conta
    }

}
