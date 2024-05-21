import java.util.Scanner;

public class verificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean reiniciar = true;

        while (reiniciar) {
            try {
                // Solicita ao usuário que insira sua idade
                System.out.print("Por favor, insira sua idade: ");
                int idade = Integer.parseInt(scanner.nextLine()); 

                // Verifica se a idade é maior ou igual a 18 e imprime uma mensagem correspondente:
                if (idade >= 18) {
                    System.out.println("Você está elegível para criar uma conta bancária.");
                } else {
                    System.out.println("Você não está elegível para criar uma conta bancária.");
                }

                // Pede para reiniciar o sistema
                System.out.print("Deseja verificar outra idade? (S/N): ");
                String resposta = scanner.nextLine().trim().toUpperCase();
                if (!resposta.equals("S")) {
                    reiniciar = false;
                }
            } catch (NumberFormatException e) {
                // Caso o usuário insira algo que não seja um número
                System.out.println("Erro: Por favor, insira um número válido para a idade.");
            }
        }

        // Fecha o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}

