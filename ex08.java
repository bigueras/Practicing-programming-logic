import java.util.Scanner;
public class ex08 {
    
    public static void main(String[] args) {
       /*
        Exercício 08 - Quadrado e Cubo de um Número
    Descrição: Ler um número e exibir o quadrado e o cubo dele.
    Exemplo de saída:
    Digite um número: 2
    Quadrado: 4
    Cubo: 8
        */
       Scanner scanner = new Scanner (System.in);

       System.out.print("Digite a base");
       int base = scanner.nextInt();

       System.out.print("Digite o expoente");
       int expoente = scanner.nextInt();

       int resultado = (int) Math.pow(base, expoente);

       System.out.println(base + " " +"elevado a" + " " + expoente + " "  + "é" + " "  + resultado);

       scanner.close();


       




    
        
       }  
    }