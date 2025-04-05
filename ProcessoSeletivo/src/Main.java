//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"ANA JÚLIA", "SAMUEL", "JOSI", "PAULO", "JOÃO", "PEDRO", "MARIA", "RAMÁ", "JUDAS", "TIAGO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este salário " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido > salarioBase) {
            System.out.println("FAZER CONTRAPROPOSTA!");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA CANDIDATO!");
        } else {
            System.out.println("AGUARDAR OUTRAS CANDIDATURAS...");
        }
    }
}