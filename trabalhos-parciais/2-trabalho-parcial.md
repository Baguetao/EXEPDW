# 2º Trabalho Parcial — Sistema de Eventos

## 🎯 Objetivo

Desenvolver, utilizando **Java, JPA e Lombok**, as entidades necessárias para representar um **Sistema de Gerenciamento de Eventos**.

Além da criação das entidades e seus relacionamentos, o projeto deverá possuir um arquivo `import.sql` contendo dados iniciais para todas as entidades.

O objetivo da atividade é praticar:

- criação de entidades;
- definição de atributos;
- utilização de JPA;
- utilização do Lombok;
- definição de relacionamentos;
- carga inicial de dados utilizando `import.sql`;
- utilização do GitHub;
- utilização do GitHub Codespaces;
- utilização do Controle de Código Fonte do Codespaces.

---

# 🏗️ 1. Projeto-base

O trabalho deverá ser desenvolvido **a partir do projeto-base disponibilizado pelo professor no GitHub**.

> ⚠️ **Não crie um repositório novo do zero.**
>
> Cada aluno deverá criar um **Fork** do projeto-base e desenvolver sua atividade dentro desse repositório.

---

# 🍴 2. Faça um Fork do projeto

Acesse o repositório do projeto-base disponibilizado pelo professor.

No GitHub:

1. Clique em **Fork**.
2. Selecione sua conta do GitHub.
3. Confirme a criação do Fork.

Após esse processo, você terá uma cópia do projeto na sua própria conta.

### Exemplo

```text
Repositório do professor
        │
        │ Fork
        ▼
Seu repositório
```

> ⚠️ A partir deste momento, **o seu Fork será o repositório utilizado para desenvolver e entregar o trabalho**.

---

# ☁️ 3. Abra o projeto no GitHub Codespaces

Com o seu Fork aberto no GitHub:

1. Clique no botão **Code**.
2. Selecione a aba **Codespaces**.
3. Clique em **Create codespace on main**.
4. Aguarde o ambiente ser criado.

O GitHub irá abrir um ambiente de desenvolvimento completo no navegador.

Você não precisa instalar Java, IDE ou configurar o projeto em seu computador.

---

# 💻 4. Desenvolva o trabalho

Todo o desenvolvimento deverá ser realizado diretamente no **GitHub Codespaces**.

As alterações deverão ser realizadas na branch `main`.

> ⚠️ **Não altere o projeto-base original do professor.**
>
> Trabalhe somente no seu próprio Fork.

---

# 📦 5. Sistema de Eventos

O sistema deverá possuir as seguintes entidades:

1. `Evento`
2. `Categoria`
3. `Local`
4. `Palestrante`
5. `Participante`
6. `Inscricao`

As entidades deverão ser desenvolvidas utilizando **Java, JPA e Lombok**.

---

# 🧩 6. Entidades e atributos

## 6.1 Evento

A entidade `Evento` deverá possuir:

- `id`
- `nome`
- `descricao`
- `dataInicio`
- `dataFim`
- `capacidade`
- `status`
- `categoria`
- `local`
- `palestrante`

---

## 6.2 Categoria

A entidade `Categoria` deverá possuir:

- `id`
- `nome`
- `descricao`

---

## 6.3 Local

A entidade `Local` deverá possuir:

- `id`
- `nome`
- `endereco`
- `capacidade`

---

## 6.4 Palestrante

A entidade `Palestrante` deverá possuir:

- `id`
- `nome`
- `miniBio`
- `email`

---

## 6.5 Participante

A entidade `Participante` deverá possuir:

- `id`
- `nome`
- `email`
- `telefone`

---

## 6.6 Inscricao

A entidade `Inscricao` deverá possuir:

- `id`
- `dataInscricao`
- `status`
- `evento`
- `participante`

---

# 🔗 7. Relacionamentos

Os relacionamentos deverão ser implementados utilizando as anotações apropriadas do **JPA**.

## Categoria e Evento

Uma Categoria pode possuir vários Eventos, e cada Evento pertence a uma Categoria.

```text
Categoria 1 ─────────── N Evento
```

---

## Local e Evento

Um Local pode receber vários Eventos, e cada Evento ocorre em um Local.

```text
Local 1 ─────────── N Evento
```

---

## Palestrante e Evento

Um Palestrante pode participar de vários Eventos, e cada Evento possui apenas um Palestrante.

```text
Palestrante 1 ─────────── N Evento
```

---

## Evento e Inscricao

Um Evento pode possuir várias Inscrições, e cada Inscrição pertence a um Evento.

```text
Evento 1 ─────────── N Inscricao
```

---

## Participante e Inscricao

Um Participante pode realizar várias Inscrições, e cada Inscrição pertence a um Participante.

```text
Participante 1 ─────────── N Inscricao
```

---

# 🗃️ 8. Arquivo `import.sql`

Além das entidades, o projeto deverá possuir um arquivo chamado:

```text
import.sql
```

Esse arquivo deverá ser utilizado para realizar a **carga inicial dos dados do sistema**.

O arquivo deverá conter **5 registros para cada entidade**.

Como o sistema possui 6 entidades, deverão ser cadastrados:

| Entidade | Quantidade |
|---|---:|
| Evento | 5 |
| Categoria | 5 |
| Local | 5 |
| Palestrante | 5 |
| Participante | 5 |
| Inscricao | 5 |
| **Total** | **30** |

---

## ⚠️ Atenção aos relacionamentos

Os registros do `import.sql` deverão respeitar os relacionamentos definidos entre as entidades.

Por exemplo, ao inserir um `Evento`, a categoria, o local e o palestrante utilizados no registro deverão existir previamente no banco de dados.

Da mesma forma, os registros de `Inscricao` deverão utilizar:

- um `Evento` existente;
- um `Participante` existente.

### Ordem recomendada

Para evitar problemas com as chaves estrangeiras, recomenda-se inserir os dados na seguinte ordem:

```text
1. Categoria
2. Local
3. Palestrante
4. Participante
5. Evento
6. Inscricao
```

> 💡 Os dados utilizados no `import.sql` ficam a critério do aluno. Crie dados fictícios, mas coerentes com o sistema de eventos.

---

# 🧩 9. Requisitos técnicos

O projeto deverá utilizar:

- **Java**
- **JPA**
- **Lombok**
- **GitHub**
- **GitHub Codespaces**
- **import.sql**

As classes deverão ser configuradas corretamente como entidades JPA.

Utilize as anotações necessárias para representar:

- entidades;
- chave primária;
- geração do identificador;
- relacionamentos;
- demais configurações necessárias para o funcionamento das entidades.

Utilize **Lombok** para reduzir código repetitivo, como getters, setters e construtores, quando apropriado.

---

# 🧪 10. Teste do projeto

Antes da entrega, execute o projeto no Codespaces e verifique se:

- o projeto inicia corretamente;
- não existem erros de compilação;
- as entidades são reconhecidas pelo JPA;
- os relacionamentos estão configurados corretamente;
- o `import.sql` é executado sem erros;
- os dados são inseridos corretamente no banco de dados.

> ⚠️ Um `import.sql` com erros de relacionamento, nomes de tabelas/colunas incorretos ou referências para registros inexistentes poderá impedir a inicialização correta da aplicação.

---

# 💾 11. Salvando o trabalho no GitHub

Durante o desenvolvimento, utilize o **Controle de Código Fonte** disponível no GitHub Codespaces.

No lado esquerdo do Codespaces, acesse o ícone:

**Controle de Código Fonte**

Você verá os arquivos que foram modificados.

### Para salvar suas alterações no GitHub:

1. Abra o **Controle de Código Fonte**.
2. Confira os arquivos modificados.
3. Adicione uma mensagem para o commit.

Exemplo:

```text
Implementa sistema de eventos
```

4. Clique em **Commit**.
5. Depois de realizar o commit, utilize a opção **Sync Changes** ou **Sincronizar Alterações** para enviar as alterações ao GitHub.

> ⚠️ Certifique-se de que as alterações foram sincronizadas antes de realizar a entrega.

---

# 📤 12. Entrega

A atividade deverá ser realizada **individualmente**.

A entrega deverá ser feita por meio do **link do seu repositório no GitHub**.

O repositório deverá estar **público**, permitindo que o projeto seja acessado e avaliado.

### Informe:

```text
Nome:
RA:
Link do repositório:
```

> ⚠️ **Atenção:** envie o link do **seu Fork**, e não o link do projeto-base do professor.

---

# ✅ 13. Checklist antes da entrega

Antes de enviar o trabalho, confirme:

### GitHub e Codespaces

- [✅] Fiz o Fork do projeto-base.
- [✅] Estou trabalhando no meu próprio repositório.
- [✅] Utilizei o GitHub Codespaces.
- [✅] Desenvolvi o trabalho na branch `main`.
- [✅] Realizei o commit das alterações.
- [✅] Sincronizei as alterações com o GitHub.
- [✅] Meu repositório está público.

### Entidades

- [✅] Criei a entidade `Evento`.
- [✅] Criei a entidade `Categoria`.
- [✅] Criei a entidade `Local`.
- [✅] Criei a entidade `Palestrante`.
- [✅] Criei a entidade `Participante`.
- [✅] Criei a entidade `Inscricao`.
- [✅] Todos os atributos solicitados foram implementados.
- [✅] Os relacionamentos foram implementados utilizando JPA.
- [✅] Utilizei Lombok.

### `import.sql`

- [✅] Criei o arquivo `import.sql`.
- [✅] Existem 5 registros de `Categoria`.
- [✅] Existem 5 registros de `Local`.
- [✅] Existem 5 registros de `Palestrante`.
- [✅] Existem 5 registros de `Participante`.
- [✅] Existem 5 registros de `Evento`.
- [✅] Existem 5 registros de `Inscricao`.
- [✅] Os registros respeitam os relacionamentos entre as entidades.
- [✅] O projeto inicia sem erros relacionados ao `import.sql`.

### Entrega

- [✅] O projeto compila sem erros.
- [✅] As alterações estão disponíveis no GitHub.
- [✅] O repositório está público.
- [✅] Enviei o link correto do meu Fork.

---

# 🎯 14. Fluxo completo da atividade

O fluxo que deverá ser seguido é:

```text
          PROJETO-BASE
               │
               ▼
             FORK
               │
               ▼
       SEU REPOSITÓRIO
               │
               ▼
       GITHUB CODESPACES
               │
               ▼
       DESENVOLVIMENTO
           NA MAIN
               │
               ▼
        ENTIDADES + JPA
               │
               ▼
          import.sql
        5 registros/entidade
               │
               ▼
      CONTROLE DE CÓDIGO
          FONTE
               │
               ▼
            COMMIT
               │
               ▼
       SINCRONIZAR
        ALTERAÇÕES
               │
               ▼
       SEU REPOSITÓRIO
          NO GITHUB
               │
               ▼
             ENTREGA
```

---

# 📚 Resultado esperado

Ao final da atividade, o projeto deverá representar a estrutura básica de um **Sistema de Gerenciamento de Eventos**, contendo:

- 6 entidades;
- seus respectivos atributos;
- os relacionamentos utilizando JPA;
- utilização do Lombok;
- um arquivo `import.sql`;
- **5 registros para cada entidade**, totalizando **30 registros**;
- projeto disponível no GitHub por meio do Fork realizado pelo aluno.

O fluxo de trabalho esperado será:

**Fork → Codespaces → Desenvolvimento → `import.sql` → Controle de Código Fonte → Commit → Sincronizar → Entrega**
