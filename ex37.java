// Exercício 37: Leia a velocidade e informe se está acima do limite permitido (80 km/h).

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a velocidade");

        int velocidade = leitor.nextInt();

        if (velocidade <= 80) {
            System.out.println("Dentro do limite");
            } else {
                System.out.println("Acima do limite");
            }

            leitor.close();
    }
}