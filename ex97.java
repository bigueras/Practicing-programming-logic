import java.util.Scanner;

public class ex97 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        if (numero % 2 != 0) {
            System.out.println("o número é ímpar");
            
        } else {
            System.out.println("O número é par");
        }

        leitor.close();
    }
}
