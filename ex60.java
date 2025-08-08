import java.util.Scanner;

public class ex60 {
    public static void main(String[] args) {
        /*
 * ex17: Verificação de Número Positivo ou Negativo
 * Peça ao usuário para inserir um número.
 * Se o número for maior ou igual a zero, exiba "Número positivo".
 * Caso contrário, exiba "Número negativo".
 */
        Scanner leitor =  new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = leitor.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
        leitor.close();

     }
}
