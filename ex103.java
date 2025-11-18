import java.util.Scanner;

public class ex103 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Pode dirigir");
            
        }else {
            System.out.println("Não pode dirigir");

        }
        leitor.close();
    }
    
}
