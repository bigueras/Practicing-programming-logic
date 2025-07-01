// Exercício 33: Leia um número e verifique se ele está entre 10 e 20.

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);

       System.out.println("Digite um número");

       int numero = leitor.nextInt();

       if (numero >= 10 && numero <= 20) {
        System.out.println("Está dentro");
        } else {
            System.out.println("Está fora");
        }

        leitor.close();



    }
}