import java.util.Scanner;

public class ex71 {
    public static void main(String[] args) {
        /*
         * ex71: Verificação de Ano Bissexto
         * Peça ao usuário para inserir um ano.
         * Verifique se é bissexto (divisível por 4 e não por 100, ou divisível por 400).
         * Exiba se o ano é ou não bissexto.
         */ 
        Scanner leitor = new Scanner(System.in);

        int ano = leitor.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        leitor.close();
    }
}
