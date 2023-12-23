# Projeto Spring Boot - Desafio CRUD de Clientes

## Descrição do Projeto
Este projeto é uma aplicação Spring Boot que implementa um CRUD completo para a entidade `Client`, seguindo os requisitos fornecidos. A aplicação fornece serviços REST para realizar as operações básicas em um recurso de clientes, incluindo busca paginada, busca por ID, inserção, atualização e exclusão.

## Tecnologias Utilizadas
- Spring Boot
- Banco de Dados H2 (em memória)
- Maven
- Java

## Estrutura do Projeto
A estrutura do projeto segue as práticas comuns de organização de um projeto Spring Boot:


## Configuração do Ambiente de Testes
O projeto está configurado para utilizar o banco de dados H2 em memória para os testes. As configurações estão presentes no arquivo `application-test.properties`.

```properties
# Dados de conexão com o banco H2
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
# H2 Client
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## Endpoints
- GET `/clients:` Retorna a lista de clientes de forma paginada.
- GET `/clients/{id}`: Retorna as informações do cliente com o ID especificado.
- POST `/clients:` Insere um novo cliente com base nos dados fornecidos no corpo da requisição.
- PUT `/clients/{id}`: Atualiza as informações do cliente com o ID especificado, com base nos dados fornecidos no corpo da requisição.
- DELETE `/clients/{id}`: Deleta o cliente com o ID especificado.
