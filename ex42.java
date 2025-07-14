import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
       /*
 * ex42: Sistema de Notas com Conceito
 * Peça ao usuário para inserir uma nota de 0 a 10.
 * Exiba o conceito correspondente:
 * A (9-10), B (7-8.9), C (5-6.9), D (3-4.9), E (0-2.9)
 */
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira sua nota");

    int nota = leitor.nextInt();

    if (nota >= 9 && nota <= 10) {
        System.out.println("Nota A");
    } else if (nota <= 8 && nota >= 7) {
        System.out.println("Nota B");
    } else if ( nota <= 6 && nota >= 5) {
        System.out.println("Nota C");
    } else if (nota > 3 && nota <= 4) {
        System.out.println("Nota D");
    } else if (nota > 0 && nota <= 2) {
        System.out.println("Nota E");
    } else {
        System.out.println("Nota invalida");
    }
        leitor.close();

    }
}
