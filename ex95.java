import java.util.Scanner;

public class ex95 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        if (numero >= 18) {
            System.out.println("Pode dirigir");
            
        } else {
            System.out.println("Não pode dirigir");
        }
        leitor.close();
    }
}
