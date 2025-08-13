// Exercício 65: Leia um número e verifique se ele é múltiplo de 3.

import java.util.Scanner;

public class ex65 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 3 == 0) {
            System.out.println("É multiplo");
            
        } else {
            System.out.println("Não é multiplo");
        }

        leitor.close();
    }
}