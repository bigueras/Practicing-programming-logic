
import java.util.Scanner;

public class ex06 {
    
    public static void main(String[] args) {
        /*Exercício 06 - Dobro e Triplo de um Número
    Descrição: Receber um número pelo Scanner e exibir o dobro e o triplo dele.
    Exemplo de saída:
    Digite um número: 4
    Dobro: 8
    Triplo: 12
 */
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite um numero");

    int numero = scanner.nextInt();
    System.out.println(numero * 2);
    System.out.println(numero * 3);

    scanner.close();



   

       
       }  
    }