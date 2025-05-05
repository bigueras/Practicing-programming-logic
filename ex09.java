import java.util.Scanner;

public class ex09 {
    
    public static void main(String[] args) {
        /*
            Exercício 09 - Conversor de Temperatura (Celsius para Fahrenheit)
        Descrição: Receber uma temperatura em graus Celsius e exibir o valor em Fahrenheit.
        Fórmula: F = (C × 9/5) + 32
        Exemplo de saída:
        Digite a temperatura em Celsius: 30
        Temperatura em Fahrenheit: 86.0

         */
        Scanner scanner = new Scanner (System.in);
         
        System.out.print("Digite a temperatura em Celsius");
        double celsius = scanner.nextDouble();


        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " " + " graus Celsius é igual a " + " " + fahrenheit + " " + "graus Fahrenheit.");
  
        scanner.close();





       }  
    }