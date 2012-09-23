package br.com.ivia.querydsl.produces;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mysema.query.jpa.impl.JPAQuery;

public class JpaQueryProducer {
	@PersistenceContext
	private EntityManager em;
	
	private JPAQuery jpaQuery;
	
	@Produces
	public JPAQuery getJpaQuery() {
		return new JPAQuery(em);
	}
}
