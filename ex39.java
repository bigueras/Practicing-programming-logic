import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a sua idade");

        int idade = leitor.nextInt();

        if (idade >= 65) {
            System.out.println("Está apto a se aposentar");
        } else {
            System.out.println("Não está apto a se aposentar");
        }

        leitor.close();
    }
}
