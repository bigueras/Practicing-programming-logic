// Exercício 40: Receba o salário e informe se ele está dentro da faixa salarial média (1000-5000).

import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Informe seu salário");

        double salario = leitor.nextDouble();
         
        if (salario >= 1000 && salario <= 5000) {
            System.out.println("Está dentro da faixa salarial");
            } else {
                System.out.println("Está fora ");
            }

           leitor.close(); 
    }
}