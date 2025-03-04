import java.util.Scanner;

public class praticando9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double x = scanner.nextDouble();

        int parteInteira = (int) x;
        double parteDecimal = x - parteInteira;

        if (parteDecimal >= 0.5) {
            parteInteira++;
        }

        System.out.println("Número arredondado: " + parteInteira);

        scanner.close();
    }
}
