package com.shopping.utils;

import java.sql.ResultSet;

/**
 *
 * <p>Title: DataHandler</p>
 * <p>Description: 查询回调处理接口</p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 上午10:51:30
 *
 */
public interface DataHandler {

	/**
	 * 查询回调处理
	 * @param sets 查询结果集
	 */
	public Object doHandler(ResultSet sets);
}
