// Exercício 28: Leia dois números inteiros e imprima o maior deles.

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        
     Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o primeiro número");

     int numero1 = leitor.nextInt();
     System.out.println("Digite o segundo  número");
    
     int numero2 = leitor.nextInt();

    
     if (numero1 > numero2) {
        System.out.println(numero1 + "é maior");

        } else {
            System.out.println(numero2 + "é maior");

        }


        leitor.close();

    }
}