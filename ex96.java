import java.util.Scanner;

public class ex96 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        leitor.close();
    }
}
