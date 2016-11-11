package com.collaborativeportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.collaborativeportal.dao.UserdetailDao;
import com.collaborativeportal.model.UserBlog;


@Service("userdetailService")
public class UserdetailServiceImpl implements UserdetailService {
	@Autowired
	UserdetailDao userdetailDao;
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public int insertRow(UserBlog user) {
		return userdetailDao.insertRow(user);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List getList() {
		return userdetailDao.getList();
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public UserBlog getRowById(int usid) {
		return userdetailDao.getRowById(usid);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public int updateRow(UserBlog user) {
		return userdetailDao.updateRow(user);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public int deleteRow(int usid) {
		return userdetailDao.deleteRow(usid);
	}

}