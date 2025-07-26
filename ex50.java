// Exercício 50: Receba um número e informe se ele está no intervalo aberto (10, 50).

import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

       System.out.println("Informe um número");

       int numero = leitor.nextInt();

       if (numero > 10 && numero < 50) {
        System.out.println("Está dentro");
        
       } else {
        System.out.println("Está fora");
       }
       
       leitor.close();
    }
}