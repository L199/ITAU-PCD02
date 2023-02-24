
import java.lang.NullPointerException;
public class Exemplo04 {
    public static void main(String[] args) {
        String texto = "Bom dia";
        
        //exibe a letra que está na segunda posição dentro do texto
        System.out.println(letra(texto, 1));
        

        
    }
    //retorna a letra de uma Frase que está na posição indicada
    static char letra(String frase, int posicao){
        try{
            return frase.charAt(posicao);
            
        }catch(Exception e){
            System.out.println("Erro dentro do método letra");
            System.out.println(e.getMessage());
            return '@';
        }

    }
}
    