// Exercício 59: Receba um caractere e informe se é letra maiúscula.

import java.util.Scanner;

public class ex59 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

      System.out.println("Informe uma letra");

      char letra = leitor.nextLine().charAt(0);

      if (letra >= 'A' && letra <= 'Z') {
        System.out.println("É maiúscula");
        
      } else {
        System.out.println("Não é maiúscula");
      }

      leitor.close();

    }
}