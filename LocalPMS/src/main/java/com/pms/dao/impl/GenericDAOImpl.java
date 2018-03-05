package com.pms.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pms.dao.GenericDAO;

@Transactional
@Repository
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {
	@PersistenceContext	
	private EntityManager entityManager;	
	

    private Class<T> klass; 
    public GenericDAOImpl(Class<T> klass) { 
        this.klass = klass; 
    } 
	@Override
	public void insert(T t) {
		// TODO Auto-generated method stub
		entityManager.persist(t);
		
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T find(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

}
