QueryDSL
========
Esta aplicação é apenas um exemplo para utilização do QueryDSL (http://www.querydsl.com) como uma alternativa ao Criteria e da Utilização do Arquillian Managed na criação de teste para Java EE.

Enfim, o exemplo contempla apenas uma simples consulta de um Cliente (Customer) pelo seu primeiro nome.
Visualizando o meu repositório de Customer (CustomerRepository / CustomerRepositoryImpl) você verá a criação da consulta.

Para criação do JPAQuery eu fiz um método que está descrito no meu GenericRepository e implementado no meu GenericRepositoryImpl.

TESTE
=====
Existe o teste para o CustomerRepository, descrito na classe de teste CustomerRepositoryTest em src/test/... 

O processo do teste é todo feito com Arquillian (http://www.jboss.org/arquillian) e já mostrando a integração de adicionar suas dependencias do pom em seu pacote war gerado pelo Arquillian.

MAIS INFO
=========
Este meu exemplo está rodando em um Container JavaEE JBoss Communty Server 7.1.1 :)


Daniel Cunha
danielsoro@gmail.com