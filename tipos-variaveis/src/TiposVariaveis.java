public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //estudem a classe Stirng que represente texto na aplicação

        String meuNome = "Gustavo Henrique";

        System.out.println(meuNome);

        double salarioMinimo = 2500;

        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);


    }
}
