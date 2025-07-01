// Exercício 34: Leia o salário e informe se ele é maior que 1000.

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner ( System.in);

      System.out.println("Informe o seu salário");

      double salario = leitor.nextDouble();

      if (salario > 1000) {
        System.out.println("É maior");

        } else {
            System.out.println("É menor");
        }

        leitor.close();
    }
}