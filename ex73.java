// Exercício 73: Verifique se um número é múltiplo de outro.

import java.util.Scanner;

public class ex73 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

      
        int numero = leitor.nextInt();
        
        int numero1 = leitor.nextInt();

        if (numero1 == 0) {
            System.out.println("Não é possível verificar múltiplo com divisor zero.");
        } else if (numero % numero1 == 0) {
            System.out.println(numero + " é múltiplo de " + numero1);
        } else {
            System.out.println(numero + " não é múltiplo de " + numero1);
        }

        leitor.close();
    }
}
