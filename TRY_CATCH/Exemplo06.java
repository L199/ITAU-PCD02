package TRY_CATCH;

public class Exemplo06 {
    public static void main(String[] args) {
        String texto = "Lucas";


        try {
            System.out.println(vogal(texto, 1));
            System.out.println(letra(texto, 2));
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    static boolean vogal(String frase, int posicao) throws Exception{
        char vogal = letra(frase, posicao);

        if(vogal == 'a' || vogal=='e'||vogal =='i'||vogal =='o'||vogal =='u' ){
            return true;
        }
        return false;
    }

    static char letra(String frase, int posicao) throws Exception {
        if(frase==null){
         //throw dispara uma Exception (pode ser de qualquer tipo)
         //Neste caso, é uma Exeption generecia
         throw new Exception("O texto é nulo");
        }
 
        return frase.charAt(posicao);
 
     }
}
