import java.util.Scanner;

public class praticando2{
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtrai = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("A soma dos números é "+soma);
        System.out.println("A subtração é "+subtrai);
        System.out.println("A multiplicação dos números é "+multiplicacao);
        System.out.println("A divisão dos números é "+divisao);


    }
}