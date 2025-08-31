// Exercício 77: Receba dois números e informe se o primeiro é múltiplo do segundo.

import java.util.Scanner;

public class ex77 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        int numero1 = leitor.nextInt();

        if (numero % numero1 == 0) {
            System.out.println("São múltiplos");
            
        } else {
            System.out.println("Não São múltiplos");
        }   
        leitor.close();
    }
}