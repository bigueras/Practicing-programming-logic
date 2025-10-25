import java.util.Scanner;

public class ex98 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();

        if (idade >= 18 ) {
            System.out.println("É maior de idade");
            
        } else {
            System.out.println("Não é maior de idade");
        }

        leitor.close();
    }
}
