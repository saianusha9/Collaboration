package com.collaborativeportal.dao;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.collaborativeportal.model.UserBlog;

@Repository("userdetailDao")
public class UserdetailDaoImpl implements UserdetailDao {
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.SUPPORTS)
	public int insertRow(UserBlog user) {
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(user);
		  tx.commit();
		  Serializable usid = session.getIdentifier(user);
		  session.close();
		  return (Integer) usid;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public List getList() {
		Session session = sessionFactory.openSession();
		  @SuppressWarnings("unchecked")
		  List supplierList = session.createQuery("from User")
		    .list();
		  session.close();
		  return supplierList;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public UserBlog getRowById(int usid) {
		Session session = sessionFactory.openSession();
		  UserBlog user = (UserBlog) session.load(UserBlog.class, usid);
		  return user;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int updateRow(UserBlog user) {
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(user);
		  tx.commit();
		  Serializable usid = session.getIdentifier(user);
		  session.close();
		  return (Integer) usid;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteRow(int usid) {
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  UserBlog user = (UserBlog) session.load(UserBlog.class, usid);
		  session.delete(user);
		  session.flush();
		  tx.commit();
		  Serializable ids = session.getIdentifier(user);
		  session.close();
		  return (Integer) ids;
	}
	
}