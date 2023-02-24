package Exericicio_Conta;

public class ContaPoupanca extends Conta {
    private static double taxa_saque=0.01;
    public ContaPoupanca(int numero) {
        super(numero);
        //TODO Auto-generated constructor stub
    }

    public static void setTaxaSaque(double novataxa){
        if(novataxa>0){
            taxa_saque= novataxa;

        }
        
    }

    @Override
    public boolean sacar(double valor) {
        if(valor+taxa_saque<=getSaldo()){

            return super.sacar(valor+taxa_saque);
        }
        return false; // Não tem saldo suFiciente
    }

    @Override
    public String toString() {
        
        return "Conta Poupança: " +super.toString();
    }
    
}
