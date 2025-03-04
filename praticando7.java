import java.util.Scanner;

public class praticando7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double n = scanner.nextDouble();

        if (n % 2 == 0){
            System.out.print(n + " é par");
        }else{
            System.out.println(n + " é impar");
        }
    }
}