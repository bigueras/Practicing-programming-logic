// Exercício 51: Leia um número e informe se ele é negativo ou maior que 100.

import java.util.Scanner;

public class ex51 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número");

        int numero = leitor.nextInt();

        if (numero < 0 ) {
            System.out.println("O número é nagativo");
        } else if (numero > 100) {
            System.out.println("O número é maior que 100");
        } else {
            System.out.println("O número não é negativo nem maior que 100.");
        }
        leitor.close();
    }
}