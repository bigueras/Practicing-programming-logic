import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        /*
         * Exercício 3: Identificação de Paridade com Strings
         * 
         * Peça ao usuário para inserir um número.
         * Verifique se o número é par ou ímpar, e exiba a palavra "par" ou "ímpar".
         * Use uma string para armazenar o resultado e exibi-la.
         * Depois de avaliar o número, tu vai colocar se é par ou ímpar em uma variável.
         * 
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero");

        double numero = scanner.nextDouble();

        if (numero % 2 == 1) {
            System.out.println("O numero é impar");
        } else {
            System.out.println("É par");

        }
            scanner.close();
    }
}
