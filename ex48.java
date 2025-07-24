// Exercício 48: Leia dois números e informe o menor deles.

import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe dois números");

        int numero = leitor.nextInt();
        int numero1 = leitor.nextInt();

        if (numero < numero1) {
            System.out.println(numero  + " " +  "é menor");
        } else if (numero1 < numero) {
             System.out.println(numero1 + " " + "é menor");
            
        } else {
            System.out.println("Os números são iguais");
        } 
            
        
        leitor.close();
    }
}