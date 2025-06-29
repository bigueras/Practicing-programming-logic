// Exercício 30: Leia a idade de uma pessoa e verifique se ela é maior de idade.

import java.util.Scanner;

public class ex30 {public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

      System.out.println("Digite a sua idade");

      int idade = leitor.nextInt();

      if (idade >= 18) {
        System.out.println("Maior de idade");

        } else {
            System.out.println("Menor de idade");
        }

        leitor.close();

    }
}