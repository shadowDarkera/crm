package com.work.crm.dao;

import com.work.crm.domain.User;

/**
 * 用户管理的DAO的接口
 * @author MRZHU
 *
 */
public interface UserDao extends BaseDao<User>{

	User login(User user);

}
