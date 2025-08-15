// Exercício 66: Leia um número e informe se ele é positivo e par.

import java.util.Scanner;

public class ex66 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 2 == 0 && numero > 0) {
            System.out.println("É positivo e par");
            
        } else {
            System.out.println("Não é");
        }
        
        leitor.close();
    }
}