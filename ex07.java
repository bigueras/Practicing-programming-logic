import java.util.Scanner;

public class ex07 {
    
    public static void main(String[] args) {
            /* Exercício 07 - Soma de Dois Números e Produto
        Descrição: Ler dois números e mostrar a soma e o produto entre eles.
        Exemplo de saída:
        Digite o primeiro número: 3
        Digite o segundo número: 5
        Soma: 8
        Produto: 15
        */
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um numero:");
        System.out.println("Digite o Segundo numero:");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        System.out.println(numero1 + numero2  +" " + "Essa é a soma");
        System.out.println(numero1 * numero2 + " " + "Esse é o produto");

        scanner.close();






        }
        

    }



