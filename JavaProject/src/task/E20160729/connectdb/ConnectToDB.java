package task.E20160729.connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
	//
	static Connection con;
	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/firstdb";
	static String user = "root";
	static String psw = "root";
	
	public static Connection connectToDB(){
		try {
			//加载驱动
			Class.forName(driver);
			//连接MySQL数据库
			con = DriverManager.getConnection(url, user, psw);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		} 
		return con;
	}
}
