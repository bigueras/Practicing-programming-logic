import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        /*
 * ex23: Classificação de Temperatura
 * Peça ao usuário para inserir a temperatura em graus Celsius.
 * Se for menor que 15, exiba "Frio".
 * Se estiver entre 15 e 25, exiba "Agradável".
 * Se for maior que 25, exiba "Quente".
 */

        Scanner leitor = new  Scanner (System.in);

        System.out.println("Insira uma temperatura em graus celsius");

        int temperatura = leitor.nextInt();

        if (temperatura < 15) {
            System.out.println("Frio");
        }
        else if  (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Agradável");
        } 
        else if (temperatura > 25) {
            System.out.println("Quente");

        }
        leitor.close();
    }
}
