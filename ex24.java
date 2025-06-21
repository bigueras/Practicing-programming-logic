import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
 /*
 * ex21: Cálculo de Média
 * Peça ao usuário para inserir duas notas.
 * Calcule a média e exiba se ele foi "Aprovado" (média >= 6) ou "Reprovado".
 */
        
        Scanner leitor = new Scanner (System.in);
        
        
        

        System.out.println("Insira a primeira  nota ");
        int nota = leitor.nextInt();
        System.out.println("Digite a segunda nota");
        int nota1 = leitor.nextInt();
        
        int notaFinal = ((nota + nota1) / 2);
        if (notaFinal >= 6) {
            System.out.println("Aprovado");
            
        } else {
            System.out.println("Reprovado");
        }

        leitor.close();
    }
}
