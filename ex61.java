// Exercício 61: Receba um número e informe se ele é um número perfeito (6, 28).

import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
    
    System.out.println("Informe 1 número");

    int numero = leitor.nextInt();

    if (numero == 6 || numero == 28) {
        System.out.println("O Número é perfeito");
        
    } else {
        System.out.println("O número não é perfeito");
    }

    leitor.close();
    
    
    
    
    }
}