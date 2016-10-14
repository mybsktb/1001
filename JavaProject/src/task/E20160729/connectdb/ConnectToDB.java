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
			//��������
			Class.forName(driver);
			//����MySQL���ݿ�
			con = DriverManager.getConnection(url, user, psw);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ��");
			e.printStackTrace();
		} 
		return con;
	}
}
