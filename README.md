QueryDSL
========
Esta aplicação é apenas um exemplo para utilização do QueryDSL (http://www.querydsl.com) como uma alternativa ao Criteria.

Este framework tem uma escrita bem mais legível que Criteria e a geração dos seus type-safes são bem mais simples devido
a sua integração com o maven e ant.

Enfim, o exemplo contempla apenas uma simples consulta de um Cliente (Customer) pelo seu primeiro nome.
Visualizando o meu repositório de Customer (CustomerRepository / CustomerRepositoryImpl) você verá a criação da consulta.

Para criação do JPAQuery eu fiz um producer que está na classe JpaQueryProducer.
Ainda não implementei os meus teste unitários, mas você pode rodar o exemplo fácil.

Este meu exemplo está rodando em um Container JavaEE JBoss Communty Server 7.1.1 :)

Para mais informações do QueryDSL você pode enconrar aqui (http://www.querydsl.com/documentation)