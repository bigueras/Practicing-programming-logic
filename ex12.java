import java.util.Scanner;

public class ex12 {


    public static void main(String[] args) {
        /*
 * > Exercício 2: Validação de Login

Peça ao usuário para inserir um nome de usuário e uma senha.
Verifique se o nome de usuário é "admin" e a senha é "1234".
Se ambos forem corretos, exiba "Acesso permitido".
Caso contrário, exiba "Acesso negado".
 */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println( "Digite o seu usuário" );
        
        String usuário = scanner.nextLine();
        
        System.out.println("Digite a sua senha");
        
        String senha = scanner.nextLine();

        if (usuário.equals ("admin") && senha.equals("1234") ) {
            System.out.println("Acesso permitido");
            }else  { 
                System.out.println("Acesso negado");
             }
             scanner.close();

    }
}
