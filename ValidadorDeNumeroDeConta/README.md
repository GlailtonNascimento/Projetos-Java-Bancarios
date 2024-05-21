# ValidadorDeNumeroDeConta

## Descrição
O **ValidadorDeNumeroDeConta** é um programa Java que verifica se um número de conta bancária é válido. O número de conta deve conter exatamente 8 dígitos. O programa continuará solicitando a entrada do usuário até que um número de conta válido seja fornecido.

## Funcionalidades
- Verifica se o número de conta possui exatamente 8 dígitos.
- Verifica se todos os caracteres do número de conta são dígitos.
- Fornece mensagens de erro específicas para entradas inválidas.
- Solicita a entrada do usuário até que um número de conta válido seja fornecido.

## Como Usar
1. Certifique-se de ter o Java instalado em seu sistema.
2. Clone este repositório ou baixe os arquivos do projeto.
3. Compile o programa usando o seguinte comando:
    ```sh
    javac ValidadorDeNumeroDeConta.java
    ```
4. Execute o programa:
    ```sh
    java ValidadorDeNumeroDeConta
    ```
5. Siga as instruções na tela para inserir o número de conta.

## Exemplo de Uso
```sh
Digite o número da conta (8 dígitos): 1234567
Erro: Número de conta inválido. Digite exatamente 8 dígitos.
Por favor, tente novamente.

Digite o número da conta (8 dígitos): 12345678
Número de conta válido.
