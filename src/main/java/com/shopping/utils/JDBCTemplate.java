package com.shopping.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * <p>Title: JDBCTemplate</p>
 * <p>Description: JDBC访问数据库模板类</p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午10:46:33
 *
 */
public class JDBCTemplate {

	/**
	 * 添加操作
	 * @param sql SQL语句
	 * @param args 参数
	 * @return 操作成功返回生成的主键值，失败返回0
	 */
	public static int save(String sql,Object...args){
		int flag = -1;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet set = null;
		try{
			conn = DBUtil.createConnection();
			pst = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			for(int i=0;i<args.length;++i){
				pst.setObject(i+1, args[i]);
			}
			pst.executeUpdate();
			set = pst.getGeneratedKeys();
			if(set.next())
				flag = set.getInt(1);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pst, set);
		}
		return flag;
	}
	
	/**
	 * 查询操作
	 * @param sql SQL语句
	 * @param handler 查询回调处理
	 * @param args 查询参数
	 * @return
	 */
	public static Object query(final String sql,DataHandler handler,Object... args){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet sets = null;
		Object result = null;
		try{
			conn = DBUtil.createConnection();
			pst = conn.prepareStatement(sql);
			for(int i=0;i<args.length;++i){
				pst.setObject(i+1, args[i]);
			}
			sets = pst.executeQuery();
			result = handler.doHandler(sets);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pst, sets);
		}
		return result;
	}
}
