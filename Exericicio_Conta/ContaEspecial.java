package Exericicio_Conta;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero,double limite) {
        super(numero);
        this.limite =limite;
    }


    public void setLimite(double novoLimite) {
        if(novoLimite>0){
            this.limite = novoLimite;

        }
    }

    @Override
    public boolean sacar(double valor) {
        if(valor<=getSaldo()+limite){
            return super.sacar(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Conta Especial: "+super.toString()+" limite: "+limite;
    }
    
}