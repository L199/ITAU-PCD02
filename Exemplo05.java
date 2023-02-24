public class Exemplo05 {
    public static void main(String[] args) {
        String texto = null;


        try {
            
            System.out.println(letra(texto, 1));
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
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
