// Exercício 32: Leia o salário e diga se é maior que o salário mínimo.
import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
         
        System.out.println("Informe o seu salário");

        double salario = leitor.nextDouble();
        double salarioMinimo = 1518.00;
            
        if (salario > salarioMinimo) {
            System.out.println("É maior");
            } else { 
                System.out.println("É menor");
            }

        leitor.close();
    }
}