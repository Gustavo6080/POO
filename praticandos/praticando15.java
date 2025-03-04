import java.util.Scanner;

public class praticando15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeVogais = 0;
        int quantidadeDigitos = 0;
        int quantidadeOutros = 0;

        while (true) {
            System.out.print("Digite um caractere (ou '.' para encerrar): ");
            char caractere = scanner.next().charAt(0);

            if (caractere == '.') {
                break;
            }

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                    caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
                quantidadeVogais++;
            } else if (Character.isDigit(caractere)) {
                quantidadeDigitos++;
            } else {
                quantidadeOutros++;
            }
        }

        System.out.println("Quantidade de vogais: " + quantidadeVogais);
        System.out.println("Quantidade de dígitos: " + quantidadeDigitos);
        System.out.println("Quantidade de outros caracteres: " + quantidadeOutros);

        scanner.close();
    }
}
