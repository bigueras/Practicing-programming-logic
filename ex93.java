import java.util.Scanner;

public class ex93 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        if (numero >= 100 && numero <= 1000) {
            System.out.println("Está dentro");
        } else {
            System.out.println("Está fora");
        }
        leitor.close();


    }
}
