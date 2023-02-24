package Exericicio_Conta;

public abstract class  Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar (double valor){
        if(valor>0){
            saldo+=valor; //saldo=saldo+valor;
            return true;
        }
            return false;
        
    }

    public boolean sacar (double valor){
        if(valor>0){
            saldo-=valor; //saldo=saldo+valor;
            return true;
        }
        return false;
    }
 
    @Override
    public String toString() {
        return "[numero=" + numero + ", saldo=" + saldo + "]";
    }





    
}
