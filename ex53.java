// Exercício 53 Verifique se um número é positivo, negativo ou zero.

import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
                                                

         Scanner leitor = new Scanner(System.in);

            System.out.println("Informe um número");

            int numero = leitor.nextInt();

            if (numero < 0) {
                System.out.println("O número é negativo");
                
            } else if (numero > 0) {
                System.out.println(" O número é positivo");
            } else {
                System.out.println(" O número é zero");
            }

            leitor.close();
    
    
    
        }

    }

