import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        /*
         * Exercício 5: Verificação de Intervalo com AND
Peça ao usuário para inserir um número.
Verifique se o número está no intervalo de 10 a 20, inclusive.
Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
         */

         Scanner scanner = new Scanner (System.in);
         

         System.out.println("Digite um numero");

         int numero;

         numero = scanner.nextInt();
         
         if (numero >= 10 && numero <= 20 ) {
            System.out.println("Está dentro");
             } else {
                System.out.println("Está fora");
             }

            scanner.close();

    }
     
}   
