import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        /*
         * Exercício 6: Classificação de Letra
Peça ao usuário para inserir uma letra.
Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante.
Exiba "Vogal" ou "Consoante" de acordo com a entrada.
Considere tanto letras maiúsculas quanto minúsculas.
         */

        Scanner scanner = new Scanner (System.in);
        
         System.out.println("Digite uma letra");


         char letra = scanner.next().toLowerCase().charAt(0);

         switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            
            default:
                System.out.println("Consoante");
                break;
         }

         scanner.close();

        




         
        



       



         


    }
}
