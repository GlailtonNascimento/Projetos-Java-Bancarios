import java.util.Scanner;

public class simulacaoBancaria {

    public static void iniciarSimulacao() {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        
        while (true) { 
            // Exibe o menu de opções
            System.out.println("Escolha uma operação:");
            System.out.println("1. Depositar ");
            System.out.println("2. Sacar ");
            System.out.println("3. Consultar Saldo ");
            System.out.println("0. Encerrar ");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt(); 
            
            // Implementa as condições necessárias para avaliar a opção escolhida
            switch(opcao) {
                case 1: // Depositar
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
                    break;
                
                case 2: // Sacar
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double valorSaque = scanner.nextDouble();
                    if(valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente. Saldo atual: R$ " + saldo);
                    }
                    break;
                
                case 3: // Consultar Saldo
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;
                
                case 0: // Encerrar
                    System.out.println("Encerrando o sistema. Obrigado por usar nossos serviços.");
                    scanner.close();
                    return; // Sai do método e encerra a simulação.
                
                default: // Caso a opção seja inválida
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        iniciarSimulacao();
    }
}
