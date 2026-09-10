# Gerenciador de tarefas

Este projeto é uma API RESTful desenvolvida com Java e Spring boot framework para gerenciar tarefas, com CRUD completo para as entidades.

## Tecnologias

- [Java 21](https://docs.oracle.com/en/java/javase/21/)
- [GraalVM](https://www.graalvm.org/)
- [Gradle](https://gradle.org/)
- [Spring Boot 3.3.2](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/reference/)
- [Spring Web Starter](https://docs.spring.io/spring-boot/reference/web/index.html)
- [Spring Validation Starter](https://docs.spring.io/spring-framework/reference/core/validation/beanvalidation.html)
- [Spring HATEOAS](https://docs.spring.io/spring-hateoas/docs/current/reference/html/)
- [Springdoc OpenAPI + Swagger](https://springdoc.org/)
- [REST](https://ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm)
- [DTO](https://martinfowler.com/eaaCatalog/dataTransferObject.html)
- [SQLite](https://sqlite.org/)

## Ferramentas

- [IntelliJ](https://www.jetbrains.com/pt-br/idea/)
- [Postman](https://www.postman.com/)

- ## API Reference e endpoints

- #### Obter todos os usuarios 

```http
  GET /usuarios
```

- #### Obter usuario por id 

```http
  GET /usuarios/${id}
```

| Parâmetro | Tipo   | Descrição                                    |
|:----------|:-------|:---------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id do usuario a ser buscado |

- #### Criar usuario

```http
  POST /usuarios
```

Body:

```json
{
    "nome": "João da Silva",
    "email": "joao.silva@example.com"
}
```

| Parâmetro | Tipo     | Descrição                       |
|:----------|:---------|:--------------------------------|
| `nome`    | `String` | Nome do usuario a ser criado   |
| `email`   | `String` | E-mail do usuario a ser criado |

- #### Atualizar usuario

```http
  PUT /usuarios/${id}
```

| Parâmetro | Tipo   | Descrição                                       |
|:----------|:-------|:------------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id do usuario a ser atualizado |

Body:

```json
{
    "nome": "João da Silva",
    "email": "joao.silva@example.com"
}
```

| Parâmetro | Tipo     | Descrição                       |
|:----------|:---------|:--------------------------------|
| `nome`    | `String` | Nome do usuario a ser atualizado   |
| `email`   | `String` | E-mail do usuario a ser atualizado |

- #### Excluir usuario 

```http
  DELETE /usuarios/${id}
```

| Parâmetro | Tipo   | Descrição                                     |
|:----------|:-------|:----------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id do usuario a ser excluído |

- #### Obter todas as categorias 

```http
  GET /categorias
```

- #### Obter categoria por id 

```http
  GET /categorias/${id}
```

| Parâmetro | Tipo   | Descrição                                    |
|:----------|:-------|:---------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id da categoria a ser buscada |

- #### Criar categoria

```http
  POST /categorias
```

Body:

```json
{
    "nome": "trabalho"
}
```

| Parâmetro | Tipo     | Descrição                       |
|:----------|:---------|:--------------------------------|
| `nome`    | `String` | Nome da categoria a ser criada   |

- #### Atualizar categoria

```http
  PUT /categorias/${id}
```

| Parâmetro | Tipo   | Descrição                                       |
|:----------|:-------|:------------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id da categoria a ser atualizada |

Body:

```json
{
    "nome": "trabalho"
}
```

| Parâmetro | Tipo     | Descrição                       |
|:----------|:---------|:--------------------------------|
| `nome`    | `String` | Nome da categoria a ser atualizada   |

- #### Excluir categoria 

```http
  DELETE /categorias/${id}
```

| Parâmetro | Tipo   | Descrição                                     |
|:----------|:-------|:----------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id da categoria a ser excluída |

- #### Obter todas as tarefas 

```http
  GET /tarefas
```

- #### Obter tarefa por id 

```http
  GET /tarefas/${id}
```

| Parâmetro | Tipo   | Descrição                                    |
|:----------|:-------|:---------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id da tarefa a ser buscada |

- #### Criar tarefa

```http
  POST /tarefas
```

Body:

```json
{
    "titulo": "projeto task manager",
    "descricao": "desenvolver projeto de gerenciador de tarefas",
    "prioridade": "ALTA",
    "status": "EM_ANDAMENTO",
    "prazo": "22/10/2026 23:59:59",
    "usuarioId": 1,
    "categoriaId": 1
}
```

| Parâmetro     | Tipo            | Descrição                                                    |
|:--------------|:----------------|:-------------------------------------------------------------|
| `titulo`      | `String`        | Titulo da tarefa a ser criada                                |
| `descricao`   | `String`        | Descrição da tarefa a ser criada                             |
| `prioridade`  | `String`        | Prioridade da tarefa a ser criada                            |
| `status`      | `String`        | Status da tarefa a ser criada                                |
| `prazo`       | `LocalDateTime` | Prazo da tarefa a ser criada                                 |
| `usuarioId`   | `String`        | ID do usuario no qual a tarefa a ser criada será atribuida   |
| `categoriaId` | `String`        | ID da categoria na qual a tarefa a ser criada será atribuida |

- #### Atualizar tarefa

```http
  PUT /tarefas/${id}
```

| Parâmetro | Tipo   | Descrição                                       |
|:----------|:-------|:------------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id da tarefa a ser atualizada |

Body:

```json
{
    "titulo": "projeto task manager",
    "descricao": "desenvolver projeto de gerenciador de tarefas",
    "prioridade": "ALTA",
    "status": "EM_ANDAMENTO",
    "prazo": "22/10/2026 23:59:59",
    "usuarioId": 1,
    "categoriaId": 1
}
```

| Parâmetro     | Tipo            | Descrição                                                    |
|:--------------|:----------------|:-------------------------------------------------------------|
| `titulo`      | `String`        | Titulo da tarefa a ser criada                                |
| `descricao`   | `String`        | Descrição da tarefa a ser criada                             |
| `prioridade`  | `String`        | Prioridade da tarefa a ser criada                            |
| `status`      | `String`        | Status da tarefa a ser criada                                |
| `prazo`       | `LocalDateTime` | Prazo da tarefa a ser criada                                 |
| `usuarioId`   | `String`        | ID do usuario no qual a tarefa a ser criada será atribuida   |
| `categoriaId` | `String`        | ID da categoria na qual a tarefa a ser criada será atribuida |

- #### Excluir tarefa 

```http
  DELETE /tarefas/${id}
```

| Parâmetro | Tipo   | Descrição                                     |
|:----------|:-------|:----------------------------------------------|
| `id`      | `Long` | **Obrigatório**. Id da tarefa a ser excluída |
