package Exericicio_Conta;

public class ContaApp {
    public static void main(String[] args) {
        
        ContaEspecial c1=new ContaEspecial(123,100);
        
        System.out.println(c1);

        ContaPoupanca.setTaxaSaque(0.1);
    
        c1.depositar(100);
        System.out.println(c1);
    
         if (c1.sacar(50)){
            System.out.println("Sucesso");
             System.out.println(c1);
         } else{
            System.out.println("Não i possível Fazer o saque");
         }

         if (c1.sacar(100)){
            System.out.println("Sucesso");
             System.out.println(c1);
         } else{
            System.out.println("Não i possível Fazer o saque");
         }
    
        c1.sacar(-50);
        System.out.println(c1);
    }


    
}
