     /*
 * ex46: Classificação de Letra
 * Peça ao usuário para inserir uma letra.
 * Verifique se é maiúscula ou minúscula.
 * Exiba "Maiúscula" ou "Minúscula".
 */ 

 import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (Character.isLetter(letra)) {
            if (Character.isUpperCase(letra)) {
                System.out.println("Maiúscula");
            } else {
                System.out.println("Minúscula");
            }
        } else {
            System.out.println("Isso não é uma letra.");
        }

        scanner.close();
    }
}

