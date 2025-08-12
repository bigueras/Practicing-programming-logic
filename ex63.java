// Exercício 63: Verifique se um número é divisível por 3 e por 5 ao mesmo tempo.

import java.util.Scanner;

public class ex63 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 3  == 0 && numero % 5 == 0) {
            System.out.println("É divisível");
            
        } else {
            System.out.println(" Não é divisível");
        }

        leitor.close();
    }
}