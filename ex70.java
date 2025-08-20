// Exercício 70: Leia um número e informe se ele é múltiplo de 2, 3 ou 5.

import java.util.Scanner;

public class ex70 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0) {
            System.out.println("É multiplo ");
            
        } else {
            System.out.println("Não é  mútiplo");
        }

        leitor.close();
    }
}