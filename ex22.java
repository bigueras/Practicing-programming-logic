import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
          /*
 * ex22: Verificação de Maioridade
 * Peça ao usuário para inserir sua idade.
 * Se tiver 18 anos ou mais, exiba "Maior de idade".
 * Caso contrário, exiba "Menor de idade".
 */

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite sua idade");
        
        int verificaridade = leitor.nextInt();
        
        if (verificaridade >= 18) {
            System.out.println("Maior de idade");
            
        } else {
            System.out.println("Menor de idade");
        }
    
            leitor.close();

        }    
    }
