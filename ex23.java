import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
/*
 * ex30: Validação de Nota
 * Peça ao usuário para inserir uma nota de 0 a 10.
 * Se a nota estiver fora desse intervalo, exiba "Nota inválida".
 * Caso contrário, exiba "Nota válida".
 */

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite sua nota");

       
        int nota = leitor.nextInt();

        if (nota >= 0 && nota <= 10  ) {
            System.out.println("nota válida");
            
        }else {
            System.out.println("Nota inválida");
        }
        leitor.close();


        
    }
}
