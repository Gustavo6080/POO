import java.util.Scanner;

public class praticando14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeAlunos = 0;
        double somaNotas = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;

        while (true) {
            System.out.print("Digite a nota do aluno (ou -1 para encerrar): ");
            double nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            quantidadeAlunos++;
            somaNotas += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        if (quantidadeAlunos > 0) {
            double media = somaNotas / quantidadeAlunos;
            System.out.println("Quantidade de alunos: " + quantidadeAlunos);
            System.out.printf("Média da turma: %.2f\n", media);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
        } else {
            System.out.println("Nenhuma nota foi registrada.");
        }

        scanner.close();
    }
}
