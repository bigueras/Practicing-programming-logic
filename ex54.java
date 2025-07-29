// Exercício 54: Receba dois números e informe se eles são iguais.

import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {   

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe 2 números");

        int numero = leitor.nextInt();
        int numero1 = leitor.nextInt();
        
       if (numero == numero1) {
        System.out.println("São iguais");
    } else {
        System.out.println("Não são iguais");
    }

    leitor.close();
        
    }
}