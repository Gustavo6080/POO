import java.util.Scanner;

public class praticando12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();

        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        int soma = 0;
        int contador = 0;

        System.out.print("Números pares no intervalo: ");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                soma += i;
                contador++;
            }
        }

        double media = (contador > 0) ? (double) soma / contador : 0;

        System.out.println("\nSoma dos números pares: " + soma);
        System.out.println("Média dos números pares: " + media);

        scanner.close();
    }
}
