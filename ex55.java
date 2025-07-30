// Exercício 55: Leia um número e informe se ele está fora do intervalo entre -10 e 10.

import java.util.Scanner;

public class ex55 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

      System.out.println("Informe um número");

      int numero = leitor.nextInt();

      if (numero >= -10 && numero <= 10) {
        System.out.println("Está dentro");
        } else {
            System.out.println("Está fora");
        }
        
    leitor.close();

    }

}