import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
 /*
 * ex19: Verificação de Múltiplo
 * Peça ao usuário para inserir um número.
 * Verifique se o número é múltiplo de 5.
 * Exiba uma mensagem dizendo se é ou não múltiplo.
 */
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número");
        
        int numero = leitor.nextInt();

            if (numero % 5 == 0) {
                System.out.println("É multiplo");
                
            } else {
                System.out.println("Não é multiplo");
            }

            leitor.close();
        
    }
}
