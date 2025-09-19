import java.util.Scanner;

public class ex85 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero = leitor.nextInt();

        if (numero >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }
        leitor.close();
            
        
    }
}
