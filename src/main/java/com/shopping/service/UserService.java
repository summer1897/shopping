package com.shopping.service;

import com.shopping.entity.User;

/**
 *
 * <p>Title: UserService</p>
 * <p>Description: @see User 实体操作服务层组件</p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午10:13:57
 *
 */

public interface UserService {

	/**
	 * 保存用户信息
	 * @param user @see User
	 * @return 操作成功返回1，失败返回-1
	 */
	public int save(User user);
	
	/**
	 * 根据用户ID获取用户信息
	 * @param id 用户ID
	 * @return 返回 @see User 实体对象
	 */
	public User getById(Integer id);
}
