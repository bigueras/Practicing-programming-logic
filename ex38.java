// Exercício 38: Leia a quantidade de horas trabalhadas e informe se o funcionário tem direito a horas extras.

import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Informe a quantidade de horas trabalhadas");

        int horasTrabalhadas = leitor.nextInt();

        if (horasTrabalhadas > 220) {
            System.out.println("Tem direito a horas extras");
         } else {
            System.out.println("Não tem direito a horas extras");
         }

         leitor.close();
    }
}