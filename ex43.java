// Exercício 43: Verifique se uma senha digitada é igual à senha cadastrada (1234).

import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

       System.out.println("Digite sua senha");

       String senha = leitor.nextLine();

       if (senha.equals("1234")) {
        System.out.println("É igual");
        
       } else {
        System.out.println("Não é igual");
       }

       leitor.close();
    }
}