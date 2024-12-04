# Projeto de Estudo - Trabalhando com Construtores

Este projeto tem como objetivo explorar conceitos de Orientação a Objetos (OO) em Java, utilizando herança, construtores, encapsulamento e o método `toString()` para representar e manipular objetos de maneira eficiente. O foco é no gerenciamento de produtos, incluindo produtos perecíveis com data de validade.

## Funcionalidades Principais

1. **Criação de Objetos Produto:**
    - Representação de produtos com atributos como `nome`, `preco` e `quantidade`.

2. **Herança e Especialização:**
    - Classe `ProdutoPerecivel` que herda de `Produto` e adiciona o atributo `dataValidade`.

3. **Exibição Personalizada:**
    - Sobrescrita do método `toString()` para exibir informações detalhadas de cada produto, incluindo a data de validade no caso de produtos perecíveis.

## Estrutura do Projeto

### Pacotes

- `com.constructors.application`
    - Contém a classe principal `App`, responsável pela execução das operações.

- `com.constructors.model`
    - Contém as classes de domínio `Produto` e `ProdutoPerecivel`.

### Classes

- **`App`**
    - Classe principal do projeto. Cria e manipula objetos das classes `Produto` e `ProdutoPerecivel`, exibindo suas informações.

- **`Produto`**
    - Representa um produto com os atributos:
        - `nome` (String)
        - `preco` (double)
        - `quantidade` (int)
    - Inclui métodos de acesso e uma implementação personalizada do método `toString()`.

- **`ProdutoPerecivel`**
    - Especialização da classe `Produto`, com o atributo adicional:
        - `dataValidade` (LocalDate)
    - Utiliza o construtor da classe mãe para inicializar os atributos herdados e implementa uma versão personalizada do método `toString()`.

## Como Executar o Projeto

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/seuusuario/produto-perecivel-demo.git
   ```
   
2. **Configure o ambiente Java:**
    - Certifique-se de ter o **Java 8 ou superior** instalado.


3. **Compile os arquivos:**
    - Compile as classes localizadas nos pacotes:
        - `com.constructors.application`
        - `com.constructors.model`


4. **Execute a aplicação:**
    - Execute a classe `App` para visualizar as funcionalidades.

---

## Tecnologias Utilizadas

- **Java 8 ou superior:** Linguagem utilizada para o desenvolvimento.
- **Paradigma Orientado a Objetos:** Aplicado na modelagem das classes `Produto` e `ProdutoPerecivel`.

---

## Autor
Lucas Degrande