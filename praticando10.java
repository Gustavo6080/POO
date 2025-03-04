import java.util.Scanner;

public class praticando10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro n: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor inferior do intervalo: ");
        int inferior = scanner.nextInt();

        System.out.print("Digite o valor superior do intervalo: ");
        int superior = scanner.nextInt();

        if (n < inferior) {
            System.out.println("O número está antes do intervalo.");
        } else if (n > superior) {
            System.out.println("O número está depois do intervalo.");
        } else {
            System.out.println("O número está dentro do intervalo.");
        }
    }
}
