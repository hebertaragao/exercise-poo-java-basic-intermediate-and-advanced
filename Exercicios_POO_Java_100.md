## Bloco 1 – Fundamentos (01–20)

*Conceitos de classes, objetos, atributos, métodos, construtores e encapsulamento.*

**01.** Criar uma classe `Pessoa` com atributos `nome` e `idade`, e método `exibir()` que imprime os dados.  
**02.** Criar construtor com parâmetros em `Pessoa` e usá-lo no método `main()`.  
**03.** Utilizar métodos `get` e `set` para acessar e modificar os atributos.  
**04.** Criar classe `Carro` com marca, modelo e velocidade, além do método `acelerar()`.  
**05.** Implementar a classe `Produto` com atributos `preço`, `quantidade` e método `calcularTotal()`.  
**06.** Validar `preço` e `quantidade` no construtor do `Produto`, lançando exceções se necessário.  
**07.** Criar a classe `Aluno` que recebe três notas e calcula a média final.  
**08.** Classe `Retangulo` com métodos `area()` e `perimetro()`, recebendo altura e largura.  
**09.** Desenvolver `ContaBancaria` com métodos `depositar()`, `sacar()` e `consultarSaldo()`.  
**10.** Criar classe `Livro` com título e autor, e método `exibirInformacoes()`.

**11.** Criar sobrecarga do método `exibir()` com e sem argumentos.  
**12.** Adicionar múltiplos construtores em uma mesma classe.  
**13.** Criar dois objetos `Produto` e comparar se os nomes são iguais (usar `equals()`).  
**14.** Implementar atributo estático em `Usuario` para contar quantos objetos foram criados.  
**15.** Criar classe `Data` com dia, mês e ano, e método para exibir a data formatada.  
**16.** Desenvolver classe para conversão de temperatura: Celsius ↔ Fahrenheit.  
**17.** Classe `Triangulo` que determina se é equilátero, isósceles ou escaleno.  
**18.** Criar classe `Funcionario` com cálculo de aumento salarial e novo salário.  
**19.** Classe `Impressora` com método que imprime diferentes tipos de objetos.  
**20.** Criar classe `Circulo` com raio e método `calcularArea()`.

---
## Bloco 2 – Herança, Polimorfismo e Composição (21–40)

*Herança, composição, sobreposição, sobrescrita, enums e estruturas de dados.*

**21.** Criar classe `Funcionario` e herdeira `Gerente`, sobrescrevendo `exibirDados()`.  
**22.** Utilizar `@Override` para indicar sobrescrita de método.  
**23.** Composição: classe `Pessoa` com objeto do tipo `Endereco`.  
**24.** Criar classe `Empresa` que mantém lista de `Funcionarios`.  
**25.** Implementar polimorfismo: superclasse `Animal`, subclasses `Cachorro`, `Gato`, com método `fazerSom()`.  
**26.** Utilizar `super()` para acessar construtor da superclasse `Veiculo`.  
**27.** Criar vetor de `Animal`, instanciar subclasses e exibir sons com laço.  
**28.** Declarar classe abstrata `Veiculo` e herdeiras `Carro` e `Bicicleta`.  
**29.** Classe que implementa múltiplas interfaces: `Imprimivel`, `Armazenavel`.  
**30.** Criar interface `AreaCalculavel` com método `calcularArea()`, e classes `Circulo` e `Retangulo`.

**31.** Criar classe `Pedido` com lista de `Item`, e método `calcularTotal()`.  
**32.** Usar composição com construtor que recebe outro objeto (`Cliente`).  
**33.** Criar classe `Aluno` que contém `Turma` e `Endereco` (composição múltipla).  
**34.** Herança entre `ContaBancaria` e `ContaPoupanca`, com método de aplicar rendimento.  
**35.** Criar interface `Autenticavel` com método `login(usuario, senha)` e implementá-la.  
**36.** Definir enum `DiaSemana`, e usá-lo em uma classe `Agenda`.  
**37.** Criar enum `Prioridade` com construtor e método para descrever a prioridade.  
**38.** Sobrescrever `equals()` e `hashCode()` em `Aluno` baseado em `matricula`.  
**39.** Implementar `Comparable` em `Produto` para ordenar lista por `preco`.  
**40.** Criar classe com construtores e métodos sobrecarregados (`Mensagem` com variações de exibição).

---
## Bloco 3 – Exceções, Listas e Utilitários (41–60)

*Exceções, métodos estáticos, coleções, enums, varargs, generics e utilitários.*

**41.** Criar classe `Calculadora` com método `dividir(int a, int b)` usando `try/catch` para tratar divisão por zero.  
**42.** Implementar exceção customizada `SaldoInsuficienteException` em classe `Conta`.  
**43.** Simular leitura de arquivo com `try/catch/finally`, imprimindo mensagens em cada bloco.  
**44.** Classe `Matematica` com métodos estáticos: `somar()` e `fatorial()`.  
**45.** Conversor de temperaturas com métodos `celsiusParaFahrenheit()` e `fahrenheitParaCelsius()` estáticos.  
**46.** Criar lista de nomes com `ArrayList` e exibir todos com um `for-each`.  
**47.** Criar classe `Produto` e usar `ArrayList` para armazenar produtos e somar os preços.  
**48.** Usar `HashSet` para armazenar nomes e evitar duplicatas, mostrando o comportamento de sets.  
**49.** Criar `HashMap` simulando login (`usuario:senha`) e permitir tentativa de autenticação pelo console.  
**50.** Utilizar `entrySet()` para iterar sobre um `HashMap` e imprimir chave e valor de cada entrada.

**51.** Criar `HashMap<String, Produto>` em classe `Loja` e permitir busca por nome.  
**52.** Implementar método com número variável de argumentos (`varargs`) para somar valores.  
**53.** Criar classe com uma classe interna que imprime um detalhe da externa.  
**54.** Usar classe anônima para implementar interface `Runnable` e simular uma tarefa.  
**55.** Declarar constante com `final` para representar uma taxa fixa.  
**56.** Criar enum `StatusAcesso` com valores como `LIBERADO`, `NEGADO`, `EM_ANALISE`.  
**57.** Enum `PlanoSaude` com atributo `mensalidade` e método `getMensalidade()`.  
**58.** Dado um array de `Funcionario`, encontrar o com maior salário.  
**59.** Criar array de strings simulando linhas de um arquivo e iterar sobre elas com um laço.  
**60.** Classe `GeradorSenha` que usa `Random` para gerar senhas aleatórias com tamanho variável.

---
## Bloco 4 – Java Moderno e Padrões de Projeto (61–80)

*Lambdas, streams, Optional, interfaces funcionais e padrões de projeto.*

**61.** Criar lista de objetos e ordená-los com lambda e `Comparator.comparing()`.  
**62.** Utilizar `Stream.filter()` para exibir produtos acima de determinado preço.  
**63.** Aplicar `mapToDouble()` + `sum()` para calcular total de uma lista.  
**64.** Encadear `filter()`, `sorted()` e `forEach()` com streams.  
**65.** Usar `Optional.of`, `Optional.empty` e `orElse()` para tratar ausência de dados.  
**66.** Usar `flatMap()` para transformar listas de listas em uma única sequência.  
**67.** Criar classe `Pessoa` com padrão de projeto Builder para construção fluente.  
**68.** Implementar Singleton: classe `Config` com instância única acessível por método estático.  
**69.** Criar `FabricaTransporte` (padrão Factory) que retorna `Bicicleta` ou `Carro` baseado em entrada.  
**70.** Aplicar padrão Strategy com interface `PagamentoStrategy` e classes `Boleto`, `CartaoCredito`.

**71.** Criar interface funcional `Saudacao` e implementar com lambda.  
**72.** Usar `try-with-resources` para leitura segura de arquivo com `BufferedReader`.  
**73.** Ordenar lista de objetos com `Comparator.comparing()` e `sort()`.  
**74.** Usar `anyMatch()` para verificar se algum elemento de uma lista atende a uma condição.  
**75.** Implementar `equals()` e `hashCode()` baseados em atributo `codigo`.  
**76.** Criar classe genérica `Caixa<T>` com métodos `guardar()` e `obter()`.  
**77.** Usar `Predicate<T>` como argumento de método e testar com `test()`.  
**78.** Aplicar `Function<T, R>` para transformar valor: string para inteiro, etc.  
**79.** Utilizar `Objects.requireNonNull()` para proteger construtor contra valores nulos.  
**80.** Refatorar classe `Fatura`: separar responsabilidades em `CalculadoraFatura` e `ImpressoraFatura` (SRP).

---
## Bloco 5 – Arquitetura e Profissionalismo (81–100)

*Testes, MVC, padrões SOLID, arquivos, JSON, logging, Maven, serialização e mais.*

**81.** Criar classe `Calculadora` com método `somar()` e teste unitário com JUnit (`assertEquals`).  
**82.** Usar anotações `@BeforeEach` e `@AfterEach` para preparar e finalizar testes.  
**83.** Criar teste que espera exceção usando `assertThrows()` com `SaldoInsuficienteException`.  
**84.** Implementar arquitetura MVC simples com classes `Produto` (modelo), `ProdutoView` e `ProdutoController`.  
**85.** Aplicar Repository Pattern: classe `ClienteRepository` com métodos `salvar()` e `listar()`.  
**86.** Service Layer: classe `ClienteService` que valida idade mínima de cadastro.  
**87.** Usar interface `Notificador` e aplicar Inversão de Dependência em `Cadastro`.  
**88.** Aplicar OCP (Open/Closed Principle): classes de desconto diferentes para `DescontoPadrao` e `DescontoBlackFriday`.  
**89.** Aplicar ISP (Interface Segregation Principle) com interfaces `Imprimivel` e `Digitalizavel`.  
**90.** Aplicar LSP (Liskov Substitution Principle) com `Forma`, `Retangulo`, e `calcularArea()`.

**91.** Usar `java.util.logging` para registrar mensagens `info`, `warning` e `severe`.  
**92.** Calcular idade com `LocalDate` e `Period.between()`.  
**93.** Criar classe `Tarefa` com prazo (`LocalDateTime`) e enum `Status` (`PENDENTE`, `CONCLUIDA`).  
**94.** Refatorar método longo em `Relatorio` separando cabeçalho, corpo e rodapé em métodos privados.  
**95.** Criar arquivo `.properties` com configuração (`idioma=pt-BR`) e ler com `Properties.load()`.  
**96.** Serializar e desserializar objeto `Pessoa` usando `ObjectOutputStream` e `ObjectInputStream`.  
**97.** Usar biblioteca Jackson para converter objeto `Cliente` em JSON com `ObjectMapper`.  
**98.** Criar arquivo `pom.xml` com dependência `jackson-databind` para uso com Maven.  
**99.** Criar exceção customizada `DadosInvalidosException` em pacote `exceptions`.  
**100.** Mini-sistema de biblioteca com classes `Livro`, `Usuario`, e `Emprestimo` que controla disponibilidade dos livros.

---
## Créditos e Instruções Finais

**Autor e Organização:** Hebert  
**Compilado com apoio do Copilot da Microsoft**  
**Versão:** Completa com 100 exercícios organizados em blocos temáticos

---

### 📄 Como exportar este conteúdo para PDF

Você pode usar qualquer editor de texto para converter este material em um PDF legível e bonito. Aqui vão algumas opções:

#### ✅ Usando **VS Code** com extensão:
1. Instale a extensão `Markdown PDF`.
2. Salve este conteúdo como `Exercicios_POO_Java_100.md`.
3. Clique com o botão direito e selecione `Markdown PDF: Export (pdf)`.

#### ✅ Usando **Google Docs**:
1. Copie este conteúdo.
2. Cole em um novo documento no Google Docs.
3. Acesse **Arquivo → Fazer download → Documento PDF**.

#### ✅ Usando **Word**:
1. Abra o Word e cole todo o conteúdo.
2. Vá em **Arquivo → Salvar como**.
3. Escolha o formato PDF.

---

### 💡 Dica de apresentação

- Adicione uma capa personalizada com seu nome e tema.
- Insira um sumário automático se usar Word ou Docs.
- Salve uma versão editável para atualizações futuras.

---

### 👊 Parabéns!

Você acaba de montar um super compilado com **100 exercícios de POO em Java** — uma verdadeira jornada do básico ao avançado com boas práticas e conceitos modernos de desenvolvimento. Que isso se torne um guia pessoal, portfólio de estudos ou até material de mentoria para outras pessoas.

Nos vemos no próximo projeto. Código limpo, mente clara, mundo transformado! 🚀🧠

---