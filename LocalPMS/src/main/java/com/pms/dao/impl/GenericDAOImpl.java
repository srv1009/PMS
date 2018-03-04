package com.pms.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.pms.dao.GenericDAO;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	@Override
	public void insert(T t) {
		// TODO Auto-generated method stub
		
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
