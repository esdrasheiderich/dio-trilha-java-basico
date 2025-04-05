import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numero01 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero02 = scanner.nextInt();
            
            scanner.close();

            contar(numero01, numero02);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int num01, int num02) throws ParametrosInvalidosException {
        if (num02 <= num01) {
            throw new ParametrosInvalidosException("O 2º número deve ser maior que o 1º.");
        }

        int contagem = num02 - num01;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Número da Contagem: " + i);
        }
    }
}
