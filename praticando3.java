import java.util.Scanner;

public class praticando3{
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe seu salário: ");
        int salario = scanner.nextInt();

        System.out.println("Percentual de aumento (em%): ");
        double porcento = scanner.nextDouble();

        double aumento = salario * (porcento/100);
        double novoSalario = salario + aumento;

        System.out.println("O novo salario é de "+novoSalario);
    }
}
