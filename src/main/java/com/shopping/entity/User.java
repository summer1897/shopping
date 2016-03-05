package com.shopping.entity;

/**
 *
 * <p>Title: User</p>
 * <p>Description: 用戶信息实体类</p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午10:01:13
 *
 */

public class User {
	
	/*用户ID*/
	private Integer id;
	/*用户姓名*/
	private String name;
	/*用户性别*/
	private String sex;
	/*用户年龄*/
	private int age;
	public User(){}
	public User(Integer id, String name, String sex, int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
}
