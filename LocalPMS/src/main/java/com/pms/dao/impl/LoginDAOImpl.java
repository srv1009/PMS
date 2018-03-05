package com.pms.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pms.dao.LoginDAO;
import com.pms.model.User;
@Transactional
@Repository
public class LoginDAOImpl  implements LoginDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	

	@Override
	public int validateUser(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
		return 0;
	}

}
