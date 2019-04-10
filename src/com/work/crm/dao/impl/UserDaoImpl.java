package com.work.crm.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.work.crm.dao.UserDao;
import com.work.crm.domain.User;
/**
 * 用户管理的DAO的实现类
 * @author MRZHU
 *
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	//DAO中根据用户名和密码进行查询方法
	public User login(User user) {
		List<User> list = (List<User>) this.getHibernateTemplate().find(
				"from User where user_code=? and user_password=?",
				user.getUser_code(), user.getUser_password());
		if(list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
