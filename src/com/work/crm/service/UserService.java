package com.work.crm.service;

import java.util.List;

import com.work.crm.domain.User;

/**
 * 用户管理的Service的接口
 * @author MRZHU
 *
 */
public interface UserService {

	void regist(User user);

	User login(User user);

	List<User> findAll();

}
