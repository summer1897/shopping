package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shopping.entity.User;
import com.shopping.service.UserService;

/**
 * 
 *
 * <p>Title: UserController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午9:59:03
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {

	/*注入服务组件*/
	@Autowired
	private UserService userService;
	
	/**
	 * 用户信息注册,并以JSON数据格式返回注册信息
	 * @param user 用户实体
	 */
	@RequestMapping("/register")
	@ResponseBody
	public User register(User user){
		int key = userService.save(user);
		System.out.println("before register: "+user);
		if(key > 0)
			user.setId(key);
		return user;
	}
}
