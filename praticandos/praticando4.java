import java.util.Scanner;

public class praticando4 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double perimetro = 2 * 3.1416 * raio;
        double area = 3.14 * (raio * raio);

        System.out.println("O perímetro é "+perimetro);
        System.out.println("A área é de "+area);
    }
}
