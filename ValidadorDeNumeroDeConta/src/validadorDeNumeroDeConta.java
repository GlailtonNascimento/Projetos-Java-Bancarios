import java.util.Scanner;

public class validadorDeNumeroDeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean contaValida = false;

        while (!contaValida) {
            try {
                // Prompt the user to enter the account number
                System.out.print("Digite o número da conta (8 dígitos): ");
                
                // Read user input and trim any leading or trailing whitespace
                String numeroConta = scanner.nextLine().trim();

                // Verify the account number
                verificarNumeroConta(numeroConta);

                // If no exception is thrown, the account number is valid
                System.out.println("Número de conta válido.");
                contaValida = true; // Set the flag to true to exit the loop

            } catch (IllegalArgumentException e) {
                // Print the error message if an exception is caught
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, tente novamente.");
            }
        }

        // Close the scanner resource
        scanner.close();
    }

    // Method to verify if the account number has exactly 8 digits and all characters are digits
    private static void verificarNumeroConta(String numeroConta) {
        // Check if the account number is empty
        if (numeroConta.isEmpty()) {
            throw new IllegalArgumentException("Número de conta inválido. O campo não pode estar vazio.");
        }

        // Check if the account number has exactly 8 characters
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }

        // Check if all characters in the account number are digits
        for (char c : numeroConta.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Número de conta inválido. Todos os caracteres devem ser dígitos.");
            }
        }
    }
}
