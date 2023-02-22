package FIFO.Exemplos;

import java.util.TreeSet;

public class Exemplo02 {
    public static void main(String[] args) {
        int ListaDeNumeros[]={2,4,1,6,2,3,7,4,5,8};
        TreeSet<Integer> arvore = new TreeSet<>();

        //Para cada numero do vetor de Números
        for(Integer numero:ListaDeNumeros){
            arvore.add(numero);
        }

        for(Integer numero:arvore){
            System.out.println(numero+" ");
        }
    }
}
