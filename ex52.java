// Exercício 52: Receba um valor e informe se está dentro de um intervalo fechado [20, 80].

import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

       System.out.println("Informe um número");

       int numero = leitor.nextInt();

       if (numero >= 20 && numero <= 80) {
            System.out.println("Está dentro");
        
       } else {
            System.out.println("Está fora");
       }

       leitor.close();
    }
}