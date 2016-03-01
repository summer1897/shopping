package com.shopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dao.UserDao;
import com.shopping.entity.User;
import com.shopping.service.UserService;

/**
 *
 * <p>Title: UserServiceImpl</p>
 * <p>Description: @see UserService 服务层接口实现类</p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午10:16:35
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/*注入UserDao组件*/
	@Autowired
	private UserDao userDao;
	
	public int save(User user) {
		return userDao.save(user);
	}

	public User getById(Integer id) {
		return userDao.getById(id);
	}

}
