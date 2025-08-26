// Exercício 74: Leia um número e informe se ele é divisível por 4 mas não por 8.

import java.util.Scanner;

public class ex74 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = leitor.nextInt();

        if (numero % 4 == 0 && numero % 8 != 0) {
            System.out.println("O número é divisível por 4 mas não por 8");
        } else if (numero % 8 == 0) {
            System.out.println("O número é divisível por 4 e por 8");
        } else {
            System.out.println("O número não é divisível por 4");
        }

        leitor.close();
    }
}
