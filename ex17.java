import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        scanner.close();

        double area = PI * raio * raio;

        System.out.printf("A=%.4f\n", area);
    }
}