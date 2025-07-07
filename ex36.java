// Exercício 36: Leia a idade e informe se a pessoa é criança, adolescente, adulto ou idoso.

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a sua idade");

        int idade = leitor.nextInt();

        if (idade <= 11) {
            System.out.println("Criança");
            
        } else if (idade >= 12 && idade <= 17 ) {
            System.out.println("Jovem ");
            }
        else if (idade >= 30 && idade <= 59) {
            System.out.println("Adulto");
        }
        else  {
            System.out.println("Idoso");
        }  
        
        leitor.close();
    }
}