// Exercício 69: Leia um número e informe se ele é múltiplo de 10.

import java.util.Scanner;

public class ex69 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 10 == 0) {
            System.out.println("É múltiplo");
            
        } else {
            System.out.println("Não é múltiplo");
        }
        leitor.close();
    }
}