import java.util.Scanner;

public class praticando5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int t = scanner.nextInt();

        int horas = t / 3600;
        t %= 3600;
        int minutos = t / 60;
        int segundos = t % 60;

        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);

        scanner.close();
    }
}
