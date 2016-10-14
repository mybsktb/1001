package task.E20160729.connectdb;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args){
		//查询语句
		String sql = "select * from user";
		//更新语句
		String sqlUpdate = "update user set password = '1234' where username = 'asdhkj'";
		String name = null;
		String psw = null;
		
		JDBCUtil.exUpdate(sqlUpdate);
		ResultSet rs = JDBCUtil.getData(sql);
		
		try {
			while(rs.next()){
				name = rs.getString("username");
				psw = rs.getString("password");
				
				name = new String(name.getBytes("ISO-8859-1"), "utf-8");
				// 输出结果
				System.out.println(name + "\t" + psw);
				
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
	}

}
