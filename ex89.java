import java.util.Scanner;

public class ex89 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();
        
        if (numero < 0) {
            System.out.println("É ímpar");
            
        } else {
            System.out.println("É par");
        }
        
        leitor.close();

    }
}
