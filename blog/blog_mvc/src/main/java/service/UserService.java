package com.wxq.blog.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.wxq.blog.dao.UserDao;
import com.wxq.blog.entity.User;

@Component
public class UserService {
	@Resource
	private UserDao userDao;
	public void add(User user) {
		
	}
	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}
	
}
