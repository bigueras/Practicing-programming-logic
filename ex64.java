// Exercício 64: Receba um número e diga se ele é par ou ímpar.

import java.util.Scanner;

public class ex64 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

       int numero = leitor.nextInt();

       if (numero % 2 == 0) {
        System.out.println("É par");
        
       } else {
        System.out.println("É ímpar");
       }

       leitor.close();
    }
}