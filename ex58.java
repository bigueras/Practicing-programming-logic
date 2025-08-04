// Exercício 58: Leia uma nota e informe se o aluno está em recuperação (nota entre 4 e 6).

import java.util.Scanner;

public class ex58 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

       System.out.println("Informe sua nota");

       double nota = leitor.nextDouble();

       if (nota >= 4 && nota <= 6) {
        System.out.println("Está de recuperação");
        } else {
            System.out.println("Não está de recuperação");
        } 
        leitor.close();
    }
}