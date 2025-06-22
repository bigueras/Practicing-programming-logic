import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
 /*
 * ex29: Identificação de Estação
 * Peça ao usuário para inserir um número de mês (1 a 12).
 * Exiba a estação correspondente:
 * Verão (12 a 2), Outono (3 a 5), Inverno (6 a 8), Primavera (9 a 11).
 */
            Scanner leitor = new Scanner(System.in);
            System.out.println("Insira um numero que corresponda a um mês do ano 1 a 12");

            int mesDoano = leitor.nextInt();

            switch (mesDoano) {
                case 1:
                System.out.println("Verão");
                    
                    break;
                case 2:
                System.out.println("Verão");
                    
                    break;
                case 3:
               System.out.println("Outono");
                    
                    break;
                case 4:
               System.out.println("Outono");
                    
                    break;
                case 5:
                System.out.println("Outono");
                    
                    break;
                case  6:
                System.out.println("Inverno");
                    
                    break;
                case 7:
                System.out.println("Inverno");
                    
                    break;
                case 8:
               System.out.println("Inverno");
                    
                    break;
                case 9:
                System.out.println("Primavera");
                    
                    break;                        
                case 10:
                System.out.println("Primavera");
                    
                    break;
                case 11:
                System.out.println("Primavera");
                    
                    break;
                case 12:
                System.out.println("Verão");
                    
                    break;        
                default:
                    System.out.println("Mês Inválido");
                    break;
            }

            leitor.close();
    }
}
