import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        double saldo = 2500.0;

        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", o conta " + numero + ".");
        System.out.println("Seu saldo, " + saldo + " já está disponível para saque.");

    }
}
