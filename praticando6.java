import java.util.Scanner;

public class praticando6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distância percorrida (em KM): ");
        int distancia = scanner.nextInt();

        System.out.println("Informe a quantidade de combustível consumido (em Litros): ");
        int litros = scanner.nextInt();

        System.out.println("Informe o tempo gasto(em horas): ");
        int tempo = scanner.nextInt();

        int v_media = distancia/tempo;
        int consumo = distancia/litros;

        System.out.println("A velocidade média foi de "+v_media+"KM/H");
        System.out.print("O consumo foi de "+consumo+"KM/L");


    }
}