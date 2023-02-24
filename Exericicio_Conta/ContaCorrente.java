package Exericicio_Conta;

import java.util.Scanner;

public class ContaCorrente extends Conta {

    private static final double TAXA_DEPOSITO =0.10;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            return super.sacar(valor);
        }
        return false;
    }

    @Override
    public boolean depositar(double valor) {
       return super.depositar(valor-TAXA_DEPOSITO);
    }

    @Override
    public String toString() {
        return "ContaCorrente: "+super.toString();
    }

    

}
