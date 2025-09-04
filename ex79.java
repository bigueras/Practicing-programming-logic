// Exercício 79

import java.util.Scanner;

public class ex79 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É par");
            
        } else {
            System.out.println("É impar");
            
        }
        
        leitor.close();
        

        

    }
}