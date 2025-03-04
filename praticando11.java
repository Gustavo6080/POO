import java.util.Scanner;

public class praticando11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Digite o primeiro número (a): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número (b): ");
        double b = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("%.2f %c %.2f = %.2f\n", a, op, b, resultado);
        }
    }
}
