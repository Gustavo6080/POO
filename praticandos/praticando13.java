import java.util.Scanner;

public class praticando13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / n;
        System.out.printf("A média da turma é: %.2f\n", media);

        scanner.close();
    }
}
