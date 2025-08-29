// Exercício 76: Leia um número e informe se ele é positivo e múltiplo de 4.

import java.util.Scanner;

public class ex76 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero > 0 && numero % 4 == 0) {
            System.out.println("É positvo e múltiplo de 4 ");
        } else {
            System.out.println("Não é ");
        }

        leitor.close();
    }
}