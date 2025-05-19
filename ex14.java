import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
     /*
      * Exercício 4: Identificação de Dia Útil

Peça ao usuário para inserir um número de 1 a 7, representando os dias da semana (1 para domingo, 2 para segunda, etc.).
Use switch para verificar se o dia é um dia útil (segunda a sexta) ou final de semana (sábado e domingo).
Exiba uma mensagem correspondente.

      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreve um numero de 1 a 7");

        

        int diasDaSemana ;

        diasDaSemana = scanner.nextInt();

        switch (diasDaSemana) {
          case 1:
          System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda-feira");
            break;
            case 3:
            System.out.println("Terça-feira");
            break;
            case 4:
            System.out.println("Quarta-feira");
            break;
            case 5:
            System.out.println("Quinta-feira");
            break;
            case 6:
            System.out.println("Sexta-feira");
            break;
            case 7:
            System.out.println("Sabado");
            break;

        
          
        }
        scanner.close();
    }
}
