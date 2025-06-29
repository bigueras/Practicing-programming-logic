// Exercício 31: Peça ao usuário para digitar um número e diga se está entre 0 e 100.

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");

        int numero = leitor.nextInt();

        if (numero > 0 && numero <= 100) {
        System.out.println("Está dentro");
            
        } else {
            System.out.println("Está fora");
        }
        
        leitor.close();
    }
}