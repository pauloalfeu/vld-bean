# Instruções - Validadores com Bean Validation

**Prof. Roberta Vanessa Rojo Parcianello**
**Engenharia de Software - Análise e Desenvolvimento de Sistemas**

---

## Bean Validation

Em seu projeto `cars`, adicione os atributos `cpf` e `email` do tipo String.

Insira as seguintes validações:
* **nome** --> mínimo 3, máximo 50 caracteres, campo obrigatório e não pode aceitar espaços
* **email** --> campo obrigatório, não pode aceitar espaços em branco e deve estar no padrão de email
* **cpf** --> campo obrigatório, não pode aceitar espaços em branco e deve estar no padrão de cpf

Projeto exemplo disponível em: `https://github.com/roberta-ifpr/demo.git`

---

## Customizando Validadores

Aplicar os conceitos de validações personalizadas utilizando Jakarta Bean Validation, criando anotações próprias para validar campos da classe Driver.

### Parte 1 – Adicione os atributos
* `String placa;`
* `String cnh;`
* `int anoCarro;`
* `String comentario;`

### Parte 2 – Criar as anotações personalizadas

#### `@PlacaValida`
Valida se a placa segue o formato Mercosul.

* Use a expressão regular:
    `"^[A-Z]{3}[0-9][A-Z][0-9]{2}$"`
* **Dica:** use o método `matches()` da classe String dentro do validador.

#### `@CNHValida`
Valida se a CNH possui 11 dígitos numéricos.
* **Dica:** use a expressão `matches("\\d{11}")` e lembre-se de verificar se o valor não é nulo ou vazio.

#### `@AnoFabricacaoValido`
Valida se o ano informado é numérico, não é menor que 1886 e não é maior que o ano atual.
* **Dica:** use `LocalDate.now().getYear()` para obter o ano atual.

#### `@SemPalavrasOfensivas`
Valida se o campo `comentario` não contém palavras ofensivas.
* **Dica:** crie uma lista de palavras proibidas (ex: "burro", "idiota", "lixo").
* Converta o texto para minúsculas com `toLowerCase()` e use `contains()` para verificar se há alguma palavra ofensiva.