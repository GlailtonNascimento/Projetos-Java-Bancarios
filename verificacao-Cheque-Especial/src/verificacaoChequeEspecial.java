import java.util.Scanner;

public class verificacaoChequeEspecial {
    // Constante para o limite do cheque especial
    private static final double LIMITE_CHEQUE_ESPECIAL = 500.0;
    // Constante para o saldo inicial do crédito especial
    private static final double SALDO_CREDITO_ESPECIAL = 100.0;
    // Constante para a porcentagem mínima de utilização do crédito especial para oferecer
    private static final double PORCENTAGEM_OFERECIMENTO_MINIMA = 0.2;
    // Constante para a porcentagem mínima de utilização do crédito especial para pagar
    private static final double PORCENTAGEM_PAGAMENTO_MINIMA = 0.2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saldo inicial da conta bancária
        double saldo = 0;

        // Solicita ao cliente o saldo atual da conta bancária
        System.out.println("Informe o saldo atual da conta bancária:");
        saldo = scanner.nextDouble();

        if (saldo == 0) {
            // Se a conta estiver zerada, oferece a liberação do crédito de R$ 100
            System.out.println("Aviso: Sua conta está zerada.");
            System.out.println("Liberamos um crédito especial de R$ 100 para sua utilização.");
            System.out.println("Deseja utilizá-lo agora? (Digite 1 para sim, qualquer outro valor para não)");
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                saldo = SALDO_CREDITO_ESPECIAL;
                System.out.println("Crédito especial de R$ 100 utilizado com sucesso.");
            }
        } else if (saldo < 0) {
            // Se a conta estiver negativa, informa que precisa pagar a fatura
            System.out.println("Aviso: Sua conta está negativa.");
            System.out.println("Você precisa pagar a fatura.");
        } else {
            // Se o saldo estiver positivo
            if (saldo <= SALDO_CREDITO_ESPECIAL * PORCENTAGEM_PAGAMENTO_MINIMA) {
                // Se o saldo estiver até 20% do valor do crédito, oferece a utilização do crédito
                System.out.println("Seu saldo atual é de R$" + saldo);
                System.out.println("Observação: Você tem direito a um saldo de crédito de R$ 100 quando necessário.");
                if (saldo <= SALDO_CREDITO_ESPECIAL * PORCENTAGEM_OFERECIMENTO_MINIMA) {
                    // Oferece a opção de utilizar o crédito
                    System.out.println("Deseja utilizar o saldo de crédito especial? (Digite 1 para sim, qualquer outro valor para não)");
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        saldo = SALDO_CREDITO_ESPECIAL;
                        System.out.println("Crédito especial de R$ 100 utilizado com sucesso.");
                    }
                }
            } else {
                // Se o saldo estiver acima de 20% do valor do crédito, apenas informa o saldo
                System.out.println("Seu saldo atual é de R$" + saldo);
                System.out.println("Observação: Você tem direito a um saldo de crédito de R$ 100 quando necessário.");
            }
        }

        // Exibe o saldo final da conta bancária
        System.out.println("Saldo final da conta bancária: R$" + saldo);

        scanner.close();
    }
}
