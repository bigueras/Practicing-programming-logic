

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
       /*
        * > Exercício 1: Verificação de Categoria de Preço

Peça ao usuário para inserir o preço de um produto.
Se o preço for menor que 50, categorize-o como "Barato".
Se estiver entre 50 e 100, categorize como "Médio".
Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
*/
        
        Scanner scanner = new Scanner(System.in);   

        System.out.println("Digite um numero");
        
        double preço = scanner.nextDouble();

       

        if ( 50 > preço ) {
            System.out.println("O produto é barato");
            } else if (preço <= 100) {
                System.out.println("O preço do produto é médio");
            } else{
                System.out.println("O produto é caro");

    }

    scanner.close();

    }
}
