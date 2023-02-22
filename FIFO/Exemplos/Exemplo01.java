package FIFO.Exemplos;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo01 {
    public static void main(String[] args) {
        //Queue é uma interce e por isso não pode instanciar (gerar) objetos
        //Podemos usar uma Lista ligada que é uma classe que implementa Queue
        Queue<Integer> Fila = new LinkedList<>();

        //Inserindo alguns números na Fila
        Fila.add(1);
        Fila.add(2);
        Fila.add(3);
        Fila.add(4);

        //exibindo a Fila atraves do método toString
        System.out.println(Fila);
        System.out.println("*****************");
        
        while(!Fila.isEmpty()){
            System.out.println("Removendo: "+Fila.remove());
             System.out.println(Fila);
        }


    }
    
}