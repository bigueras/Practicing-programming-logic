// Exercício 49: Leia dois valores e troque-os de lugar se o primeiro for maior que o segundo.

import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numero = leitor.nextInt();

        System.out.println("Informe o segundo número:");
        int numero1 = leitor.nextInt();

        if (numero > numero1) {
            int aux = numero;
            numero = numero1;
            numero1 = aux;
        }

        System.out.println("Valores em ordem:");
        System.out.println(numero);
        System.out.println(numero1);

        leitor.close();
    }
}