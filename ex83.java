import java.util.Scanner;

public class ex83 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

       int numero = leitor.nextInt();

       if (numero % 2 == 0) {
        System.out.println("O número é par");
        
       } else {
        System.out.println("O número é impar");
       }

       leitor.close();
    }
}
