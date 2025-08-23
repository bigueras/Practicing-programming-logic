// Exercício 72: Calcule a diferença entre dois números e informe se o resultado é positivo.

import java.util.Scanner;

public class ex72 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        int numero1 = leitor.nextInt();

        int resultado = Math.abs(numero - numero1);

        if (resultado > 0) {
            System.out.println("É postivo");
         }else {
            System.out.println("É negativo");
        }
        leitor.close();
    }
}

