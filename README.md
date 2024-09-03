# Desafio Target



## Desafios

### 1. Verificação de Número na Sequência de Fibonacci

Este programa verifica se um número informado pertence à sequência de Fibonacci. A sequência de Fibonacci é gerada a partir de 0 e 1, com cada número subsequente sendo a soma dos dois números anteriores.

**Arquivo:** `FibonacciCheck.java`

**Como executar:**

1. Compile o código:
    ```bash
    javac FibonacciCheck.java
    ```
2. Execute o programa:
    ```bash
    java FibonacciCheck
    ```
3. Informe um número quando solicitado para verificar se ele pertence à sequência de Fibonacci.

### 2. Contagem da Letra 'a' em uma String

Este programa conta a quantidade de vezes que a letra 'a' (tanto maiúscula quanto minúscula) ocorre em uma string fornecida pelo usuário.

**Arquivo:** `CountLetterA.java`

**Como executar:**

1. Compile o código:
    ```bash
    javac CountLetterA.java
    ```
2. Execute o programa:
    ```bash
    java CountLetterA
    ```
3. Digite a string quando solicitado para contar a ocorrência da letra 'a'.

### 3. Valor da Variável SOMA

Este é um trecho de código que calcula a soma dos números de 2 até 11. O valor final da variável `SOMA` é calculado através de um loop.

**Código fornecido:**

```java
int INDICE = 12, SOMA = 0, K = 1;
while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
System.out.println(SOMA);
