package com.pms.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T> {
	
	public void insert(T t);
	public List<T> getAll();
	public void delete(T t);
	public T find(Serializable id);

}
