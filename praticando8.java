import java.util.Scanner;

public class praticando8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de kilowatts consumidos: ");
        double kilowattsConsumidos = scanner.nextDouble();

        System.out.print("Digite o valor do kilowatt: ");
        double valorKilowatt = scanner.nextDouble();

        double valorPago = kilowattsConsumidos * valorKilowatt;

        if (kilowattsConsumidos < 150) {
            valorPago -= valorPago * 0.10;
        }

        System.out.printf("O valor a ser pago é: R$ %.2f\n", valorPago);
    }
}
