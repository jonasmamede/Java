# Jonas Investimentos - Simulador Premium

## Proposta do Sistema

**Jonas Investimentos** é um simulador de investimentos com interface gráfica desenvolvido em Java Swing. O sistema resolve um problema real: muitas pessoas têm dificuldade em entender qual investimento é mais vantajoso e quanto seu dinheiro renderá ao longo do tempo.

O simulador permite realizar simulações de investimentos de forma intuitiva, visual e profissional, facilitando a tomada de decisões financeiras informadas.

---

## Requisitos Funcionais

- **RF1:** Simular investimentos de diferentes tipos (Poupança, CDB, Tesouro Direto)
- **RF2:** Comparar investimentos lado a lado com a mesma entrada
- **RF3:** Exibir gráfico comparativo em barras horizontais
- **RF4:** Manter histórico de simulações realizadas durante a execução
- **RF5:** Validar todas as entradas do usuário
- **RF6:** Calcular rentabilidade, lucro e valor final do investimento
- **RF7:** Exibir informações detalhadas de cada simulação

---

## Requisitos Não Funcionais

- **RNF1:** Interface gráfica amigável e intuitiva utilizando Java Swing
- **RNF2:** Aplicação robusta sem possibilidade de travamento por erro
- **RNF3:** Fácil utilização sem necessidade de linha de comando
- **RNF4:** Código totalmente orientado a objetos
- **RNF5:** Sem dependências externas (banco de dados, bibliotecas externas)
- **RNF6:** Execução imediata ao iniciar a aplicação

---

## Conceitos de POO Aplicados

### Encapsulamento

- Todos os atributos das classes são privados
- Acesso controlado através de getters e setters
- Proteção de dados contra modificações indevidas

### Abstração

- Classe abstrata `Investimento` define o contrato para todos os investimentos
- Métodos abstratos: `calcularRetorno()` e `obterDescricao()`
- Oculta complexidade, expondo apenas interfaces necessárias

### Herança

- Classe `Poupanca` herda de `Investimento`
- Classe `CDB` herda de `Investimento`
- Classe `TesouroDireto` herda de `Investimento`
- Cada classe implementa sua própria lógica de rendimento

### Polimorfismo

- Utilização de `List<Investimento>` para armazenar diferentes tipos
- Chamada de `calcularRetorno()` sem conhecer o tipo específico
- Diferentes implementações para o mesmo método abstrato

---

## Estrutura do Projeto

```
ProjetoPOO/
│
└── src/
    ├── Main.java
    ├── MainFrame.java
    ├── Investimento.java
    ├── Poupanca.java
    ├── CDB.java
    ├── TesouroDireto.java
    ├── SimuladorService.java
    ├── ValorInvalidoException.java
    └── TempoInvalidoException.java
```

---

## Descrição das Classes

### Investimento (Abstrata)

Classe base que define a estrutura de todos os investimentos.

- Atributos: nome, taxaAnual, valorInicial, tempoMeses
- Métodos abstratos: calcularRetorno(), obterDescricao()

### Poupanca

Implementação concreta de investimento em poupança.

- Taxa anual: 0,5%
- Cálculo com juros compostos

### CDB

Implementação concreta de investimento em CDB.

- Taxa anual: 8%
- Cálculo com juros compostos

### TesouroDireto

Implementação concreta de investimento em Tesouro Direto.

- Taxa anual: 6,5%
- Cálculo com juros compostos

### SimuladorService

Classe de serviço que gerencia as simulações.

- Método simularInvestimento(): realiza cálculo individual
- Método compararInvestimentos(): compara três tipos
- Método adicionarAoHistorico(): registra simulação
- Método obterHistorico(): retorna lista de simulações

### MainFrame

Interface gráfica principal utilizando Java Swing.

- Campos de entrada: valor inicial, tempo em meses
- ComboBox para seleção de tipo de investimento
- Botões: Simular, Comparar Investimentos, Limpar, Sair
- Áreas de texto para resultado, histórico e gráfico

### Main

Classe de inicialização da aplicação.

### Exceções Personalizadas

- `ValorInvalidoException`: lançada quando valor é inválido
- `TempoInvalidoException`: lançada quando tempo é inválido

---

## Tecnologias Utilizadas

- **Java 17+**: Linguagem de programação
- **Java Swing**: Framework para interface gráfica
- **Programação Orientada a Objetos**: Paradigma de desenvolvimento
- **Tratamento de Exceções**: Robustez e confiabilidade

---

## Como Compilar e Executar

### Compilação

Navegue até o diretório `src` e execute:

```bash
javac *.java
```

### Execução

```bash
java Main
```

Ou diretamente:

```bash
java MainFrame
```

A aplicação iniciará imediatamente com a interface gráfica.

---

## Guia de Uso

### 1. Simular um Investimento

1. Digite o **Valor Inicial** em reais
2. Digite o **Tempo** em meses
3. Selecione o **Tipo de Investimento** (Poupança, CDB ou Tesouro Direto)
4. Clique em **Simular**
5. O resultado será exibido na área central

### 2. Comparar Investimentos

1. Digite o **Valor Inicial** em reais
2. Digite o **Tempo** em meses
3. Clique em **Comparar Investimentos**
4. Uma tabela comparativa será exibida
5. Um gráfico em barras mostrará visualmente a comparação
6. O melhor investimento será destacado

### 3. Visualizar Histórico

- Cada simulação realizada aparece automaticamente no **Histórico**
- O histórico mostra: tipo, valor, tempo e resultado

### 4. Limpar Dados

- Clique em **Limpar** para resetar todos os campos e histórico

### 5. Sair

- Clique em **Sair** para encerrar a aplicação

---

## Tratamento de Erros

A aplicação implementa tratamento robusto de erros:

- **Campos vazios**: Mensagem de aviso
- **Valores inválidos**: Rejeição de letras em campos numéricos
- **Valores negativos ou zero**: Validação com exceção
- **Tempo inválido**: Validação com exceção
- **Erros inesperados**: Captura e exibição de mensagens

Todas as mensagens de erro são exibidas em caixas de diálogo amigáveis (JOptionPane).

---

## Funcionalidades Principais

### Simulação Individual

Calcula o rendimento de um único investimento com fórmula de juros compostos:

VF = VI × (1 + taxa_mensal)^meses

Onde:

- VF = Valor Final
- VI = Valor Inicial
- taxa_mensal = taxa_anual / 12

### Comparação Automática

Cria automaticamente os três investimentos com mesmos parâmetros e mostra:

- Valor final de cada um
- Qual o melhor investimento
- Visualização em gráfico de barras

### Gráfico Visual

Representa os resultados com barras horizontais proporcionais, facilitando a visualização comparativa.

### Histórico Dinâmico

Mantém registro de todas as simulações realizadas durante a execução, permitindo acompanhar as decisões tomadas.

---

## Validações Implementadas

✓ Campo de valor aceita apenas números e ponto decimal
✓ Campo de tempo aceita apenas números inteiros
✓ Rejeita valores menores ou iguais a zero
✓ Rejeita campos vazios
✓ Trata exceções com mensagens amigáveis
✓ Previne travamento da aplicação
✓ Impede saída da aplicação por erro

---

## Exemplo de Uso

**Entrada:**

- Valor: 1000
- Tempo: 12 meses
- Tipo: CDB

**Resultado:**

- Tipo do Investimento: CDB
- Valor Investido: R$ 1000.00
- Tempo: 12 meses
- Taxa Utilizada: 8.00% ao ano
- Valor Final: R$ 1082.30
- Lucro Obtido: R$ 82.30
- Rentabilidade: 8.23%

---

## Notas Importantes

- A aplicação não requer instalações adicionais além do JDK
- Não utiliza banco de dados (dados mantidos em memória)
- Não utiliza arquivos externos
- Não utiliza bibliotecas externas
- Código compilável em qualquer IDE Java (IntelliJ, NetBeans, Eclipse, VS Code)

---

## Autor

**Projeto desenvolvido como exercício de Programação Orientada a Objetos**

---

## Licença

Este projeto é fornecido como material educacional.
