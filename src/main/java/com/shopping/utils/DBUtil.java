package com.shopping.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 *
 * <p>Title: DBUtil</p>
 * <p>Description: JDBC 连接MYSQL数据库工具类</p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午10:26:27
 *
 */

public class DBUtil {
	
	private final static String FILE_PATH = "config/db";
	private  static String driver;
	private  static String url;
	private  static String userName;
	private  static String password;
	/*数据库连接对象*/
	private static Connection con = null;
	
	static{
		ResourceBundle db = ResourceBundle.getBundle(FILE_PATH);
		driver = db.getString("driver");
		url = db.getString("url");
		userName = db.getString("username");
		password = db.getString("password");
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection createConnection(){
		try {
			con =  DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection conn,Statement state,ResultSet set){
		try{
			if(null!=conn)
				conn.close();
			if(null!=state)
				state.close();
			if(null!=set)
				set.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
