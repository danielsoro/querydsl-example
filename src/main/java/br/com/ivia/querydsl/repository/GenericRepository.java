package br.com.ivia.querydsl.repository;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.EntityPath;

import br.com.ivia.querydsl.model.Model;

public interface GenericRepository<T extends Model> {
	T save(T entity);
	T update(T entity);
	void delete(T entity);
	T findById(T entity);
	JPAQuery from(EntityPath<T> o);
}
