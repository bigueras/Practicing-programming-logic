import java.util.Scanner;

public class ex101 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salario = leitor.nextDouble();
        double salarioMinimo = 1518.00;

        if (salario >= salarioMinimo) {
            System.out.println("O funcionário ganha um salário mínimo ou mais.");
            
        } else {
            System.out.println("O funcionário recebe menos que o salário mínimo.");
        }
        leitor.close();
    }
}
