// Exercício 34: Leia o ano de nascimento e informe se a pessoa pode votar (idade >= 16).

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        // Seu código aqui
        Scanner leitor = new Scanner (System.in);

        System.out.println("Informe seu ano de nascimento");

        int idade = leitor.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
            
        } else {
            System.out.println("Não pode votar");
        }

        leitor.close();
    }
}