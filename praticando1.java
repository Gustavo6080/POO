import java.util.Scanner;

public class praticando1 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtrai = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("A soma dos números é "+soma);
        System.out.println("A subtração é "+subtrai);
        System.out.println("A multiplicação dos números é "+multiplicacao);
        System.out.println("A divisão dos números é "+divisao);


    }
}
