public class ResultadoEscolar2 {
    public static void main(String[] args) {

        //condicional encadeada


        int nota = 5;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");
    }
    
}
