// Exercício 57: Leia três números e informe se pelo menos um deles é negativo.

import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe 3 números");

        int numero = leitor.nextInt();
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        if (numero < 0  || numero1 < 0  || numero2 < 0) {
            System.out.println("Um ou mais números sao negativos");
        } else {
           System.out.println("Nenhum dos números é negativo");     
        }
        leitor.close();
    }
}