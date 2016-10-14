package task.E20160729.connectdb;

import java.sql.*;

/**
 * 
 */
public class JDBCUtil {

	//结果集
	private static ResultSet rs = null ;
	//连接数据库
	private static Connection con = ConnectToDB.connectToDB();
	
	/**
	 * 查询
	 * @param sql
	 * @return 结果集
	 */
	public static ResultSet getData(String sql){
		try {
			//创建Statement
			Statement statement = con.createStatement();
			
			if (!con.isClosed()){
					//执行sql语句
					rs = statement.executeQuery(sql);
			} else {
				System.out.println("数据库连接失败...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * 添加，修改，删除
	 * @param sql
	 * @return 处理条数
	 */
	public static int exUpdate(String sql){
		//创建Statement
		Statement statement = null;
		//记录条数
		int result = 0;
		try {
			statement = con.createStatement();
			//执行sql语句
			result = statement.executeUpdate(sql);
			System.out.println("成功处理" + result + "条记录...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//返回处理的记录条数
		return result;
	}
}
