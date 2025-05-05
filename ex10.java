import java.util.Scanner;
public class ex10 {
    
    public static void main(String[] args) {
      /*
            Exercício 10 - Soma dos 3 primeiros múltiplos de um número
        Descrição: Receber um número e mostrar a soma dos 3 primeiros múltiplos dele (exemplo: n * 1 + n * 2 + n * 3)
        Exemplo de saída:
        Digite um número: 5
        Soma dos 3 primeiros múltiplos: 5 + 10 + 15 = 30
        */
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um numero:");

        int numero = scanner.nextInt();
        System.out.println(numero * 1);
        System.out.println(numero * 2);
        System.out.println(numero * 3);

        scanner.close();

    
        
       }  
    }