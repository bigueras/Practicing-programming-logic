// Exercício 68: Leia um número e informe se ele é divisível por 2 e por 5.

import java.util.Scanner;

public class ex68 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.println("É divisível");
            
        }else {
            System.out.println("Não é divisível");
        }

        leitor.close();


    }
}