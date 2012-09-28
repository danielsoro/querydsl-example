package br.com.ivia.querydsl.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.ivia.querydsl.model.Model;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.EntityPath;


public abstract class GenericRepositoryImpl<T extends Model> implements GenericRepository<T> {

	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public T save(T entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public T update(T entity) {
		return em.merge(entity);
	}

	@Override
	public void delete(T entity) {
		em.remove(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public T findById(T entity) {
		return (T) em.find(entity.getClass(), entity.getId());
	}

	@Override
	public JPAQuery from(EntityPath<T> o) {
		return new JPAQuery(em).from(o);
	}
}
