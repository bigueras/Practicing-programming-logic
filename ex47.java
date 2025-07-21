// Exercício 47: Leia dois números e informe se a soma deles é maior que 100.

import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      System.out.println("Informe dois números");

      int numero = leitor.nextInt();

      int numero1 = leitor.nextInt();

      if (numero + numero1 > 100) {
        System.out.println("É maior");
        
      } else {
        System.out.println("Não é maior");
      }

      leitor.close();

    }
}