// Exercício 75: Leia um número e informe se ele é negativo e ímpar.

import java.util.Scanner;

public class ex75 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero < 0 && numero % 2 != 0) {
            System.out.println("É negativo e ímpar");
            
        } else {
            System.out.println("Não é negativo nem ímpar");
        }

        leitor.close();
            
        
    }
}