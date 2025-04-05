import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExemploTryCatch {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "mt1517.");
            scanner.close();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Digite a idade e a altura em forma numérica.");
        }

    }
}
