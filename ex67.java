// Exercício 67: Receba um número e informe se ele é múltiplo de 7 ou não.

import java.util.Scanner;

public class ex67 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 7 == 0) {
            System.out.println("É multiplo");
            
        } else {
            System.out.println("Não é multiplo");
        }

        leitor.close();

    }
}