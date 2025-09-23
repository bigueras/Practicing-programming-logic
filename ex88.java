import java.util.Scanner;

public class ex88 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("Está dentro");
            } else {
                System.out.println("Está fora");
            }
            leitor.close();
    }
}
