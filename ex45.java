// Exercício 45: Leia três números e imprima o maior deles.

import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite três números");

        int numero = leitor.nextInt();
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        if (numero > numero1 && numero > numero2) {
            System.out.println(numero + " " +  "É o maior número");
            
        } else if (numero1 > numero && numero1 > numero2) {
            System.out.println(numero1 + " " + "É o maior número");
        } else if (numero2 > numero && numero2 > numero1) {
            System.out.println(numero2 + " " + "É o maior número");
        } else  {
            System.out.println("Número inválido");
        }
        leitor.close();
    }
}