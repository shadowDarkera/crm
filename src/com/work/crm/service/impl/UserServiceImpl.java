package com.work.crm.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.work.crm.dao.UserDao;
import com.work.crm.domain.User;
import com.work.crm.service.UserService;
import com.work.crm.utils.MD5Utils;
/**
 * 用户管理的Service的实现类
 * @author MRZHU
 *
 */
@Transactional
public class UserServiceImpl implements UserService {
	//注入DAO
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	//业务层注册用户方法
	public void regist(User user) {
		//对密码进行加密处理
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		user.setUser_state("1");
		userDao.save(user);
		//调用DAO
	}
	
	@Override
	//业务层用户登录方法
	public User login(User user) {
		//对密码进行加密处理
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		
		return userDao.login(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
