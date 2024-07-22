public class CondicaoTernaria {
     public static void main(String[] args) {

        //condição ternária

        int nota = 4;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Prova de Recuperação" : "Reprovado";

        System.out.println(resultado);
        
    }
}
