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
O projeto está configurado para utilizar o banco de dados H2 em memória para os testes. As configurações estão presentes no arquivo `application.properties`.

```properties
# Configurações do Banco de Dados H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true

