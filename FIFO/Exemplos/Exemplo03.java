package FIFO.Exemplos;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap<Integer,String> mapa = new HashMap<>();


        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Três");
        mapa.put(4, "Quatro");

        //exibir alguns contéudos a partir da chvae Fornecida
        System.out.println("Key 3 = "+mapa.get(3));
        System.out.println("Key 4 = "+mapa.get(4));

        System.out.println("Key 5 = "+mapa.get(2));

        //lista todas as chaves do conjunto de chaves do hash (KeySet)
        for(Integer key:mapa.keySet()){
            System.out.println(key);
        }
        
    }
}
