# Java Katas

Repositório de estudos com soluções de problemas de programação competitiva em Java, com foco em praticar lógica, estruturas de dados e algoritmos clássicos.

## Tecnologias

- Java 17
- Maven

## Estrutura

```
studies/
├── pom.xml
└── src/main/java/org/aritana/
    ├── Main.java          # Classe de exemplo (template do IntelliJ)
    ├── TDARational.java   # Beecrowd 1022 - TDA Racional
    └── input.txt          # Entrada de exemplo para os testes
```

## Problemas resolvidos

| # | Problema | Plataforma | Categoria | Solução |
|---|----------|------------|-----------|---------|
| 1022 | [TDA Racional](https://judge.beecrowd.com/en/problems/view/1022) | Beecrowd | Estruturas de dados e bibliotecas | [`TDARational.java`](src/main/java/org/aritana/TDARational.java) |

### 1022 - TDA Racional

Realiza as quatro operações aritméticas (`+`, `-`, `*`, `/`) entre duas frações e exibe o resultado antes e depois da simplificação.

**Conceitos praticados:**

- Operações aritméticas com frações
- `switch` com expressões (sintaxe `->`)
- Leitura de entrada com `Scanner`
- Algoritmo de Euclides para o MDC — `O(log(min(|n|, |d|)))`
- Conversão para `long` para evitar overflow nas multiplicações

**Exemplo de entrada:**

```
4
1 / 2 + 3 / 4
1 / 2 - 3 / 4
2 / 3 * 6 / 6
1 / 2 / 3 / 4
```

**Saída esperada:**

```
10/8 = 5/4
-2/8 = -1/4
12/18 = 2/3
4/6 = 2/3
```

## Como executar

Pela linha de comando, a partir da raiz do projeto:

```bash
mvn compile
java -cp target/classes org.aritana.TDARational < src/main/java/org/aritana/input.txt
```

Ou sem Maven:

```bash
javac -d out src/main/java/org/aritana/TDARational.java
java -cp out org.aritana.TDARational < src/main/java/org/aritana/input.txt
```

No IntelliJ IDEA, basta abrir o projeto e executar a classe desejada, colando a entrada no console.
