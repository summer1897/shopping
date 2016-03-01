package com.shopping.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.shopping.dao.UserDao;
import com.shopping.entity.User;
import com.shopping.utils.DataHandler;
import com.shopping.utils.JDBCTemplate;

/**
 *
 * <p>Title: UserDaoImpl</p>
 * <p>Description: @see UserDao 接口实现类</p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午10:19:14
 *
 */
@Service
public class UserDaoImpl implements UserDao {

	public int save(User user) {
		String sql = "insert into user(id,name,sex,age) values(null,?,?,?)";
		return JDBCTemplate.save(sql,
								 user.getName(),
								 user.getSex(),
								 user.getAge());
	}

	public User getById(Integer id) {
		String sql = "select *from user where id=?";
		return (User)JDBCTemplate.query(sql, new DataHandler() {
			public Object doHandler(ResultSet sets) {
				User user = null;
				try{
					if(sets.next()){
						user = new User();
						user.setId(sets.getInt(1));
						user.setName(sets.getString(2));
						user.setSex(sets.getString(3));
						user.setAge(sets.getInt(1));
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
				return user;
			}
		}, id);
	}

}
