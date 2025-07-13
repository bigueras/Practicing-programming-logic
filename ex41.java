// Exercício 41: Receba dois números e informe se são iguais ou diferentes.

import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número");
        int numero = leitor.nextInt();
        System.out.println("Informe outro número");
        int numero1 = leitor.nextInt();
         if (numero == numero1) {
            System.out.println("São iguais");
            }  else {
                System.out.println("São diferentes");
                }
            leitor.close();
    }
}