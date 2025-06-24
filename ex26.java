import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
 /*
 * ex28: Cálculo de IMC
 * Peça ao usuário para inserir peso e altura.
 * Calcule o IMC (peso / altura²) e exiba a faixa:
 * Abaixo do peso, Peso normal, Sobrepeso, Obesidade.
 */
        Scanner leitor = new Scanner (System.in);

        System.out.println("Informe sua altura");
    
        double altura = leitor.nextDouble();

        System.out.println("Informe seu peso");

        double peso = leitor.nextDouble();
        
         double imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é: %.2f\n", imc);


         if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau 2");
        } else {
            System.out.println("Classificação: Obesidade grau 3");
        }

        leitor.close();

    }
}
