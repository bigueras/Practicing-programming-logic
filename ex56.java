// Exercício 56: Leia três números e informe se são todos iguais.

import java.util.Scanner;

public class ex56 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe 3 números");

        int numero = leitor.nextInt();
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        if (numero == numero1 && numero == numero2) {
            System.out.println("São Iguais");
        } else {
            System.out.println("Não são iguais");
        }
        
        leitor.close();
    }

}