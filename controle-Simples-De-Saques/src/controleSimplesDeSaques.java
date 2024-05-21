import java.util.InputMismatchException;
import java.util.Scanner;

public class controleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = solicitarLimiteDiario(scanner);

        for (int i = 1; ; i++) {
            double valorSaque = solicitarValorSaque(scanner, i);

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            if (valorSaque > limiteDiario) {
                System.out.println("Desculpe, o valor do saque excede o limite diário de saque. Tente novamente.");
                continue;
            }

            limiteDiario -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso. Limite restante: R$" + limiteDiario);
        }

        scanner.close();
    }

    private static double solicitarLimiteDiario(Scanner scanner) {
        double limiteDiario = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Informe o limite diário de saque: R$");
                limiteDiario = scanner.nextDouble();

                if (limiteDiario < 0) {
                    System.out.println("O limite diário de saque não pode ser negativo. Tente novamente.");
                    continue;
                }

                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico válido.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }

        return limiteDiario;
    }

    private static double solicitarValorSaque(Scanner scanner, int numeroSaque) {
        double valorSaque = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Informe o valor do saque " + numeroSaque + " (ou 0 para encerrar): R$");
                valorSaque = scanner.nextDouble();

                if (valorSaque < 0) {
                    System.out.println("O valor do saque não pode ser negativo. Tente novamente.");
                    continue;
                }

                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico válido.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }

        return valorSaque;
    }
}
