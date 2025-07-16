// Exercício 44: Receba o nome do dia da semana e informe se é dia útil ou fim de semana.

import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o dia da semana:");
        String diaDasemana = leitor.nextLine().trim().toLowerCase();

        if (diaDasemana.equals("segunda") || diaDasemana.equals("terca") || diaDasemana.equals("terça") ||
            diaDasemana.equals("quarta") || diaDasemana.equals("quinta") || diaDasemana.equals("sexta")) {
            System.out.println("Dia útil");
        } else if (diaDasemana.equals("sabado") || diaDasemana.equals("sábado") || diaDasemana.equals("domingo")) {
            System.out.println("Final de semana");
        } else {
            System.out.println("Dia inválido");
        }

        leitor.close();
    }
}
