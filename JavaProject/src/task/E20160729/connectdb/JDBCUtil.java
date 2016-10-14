package task.E20160729.connectdb;

import java.sql.*;

/**
 * 
 */
public class JDBCUtil {

	//�����
	private static ResultSet rs = null ;
	//�������ݿ�
	private static Connection con = ConnectToDB.connectToDB();
	
	/**
	 * ��ѯ
	 * @param sql
	 * @return �����
	 */
	public static ResultSet getData(String sql){
		try {
			//����Statement
			Statement statement = con.createStatement();
			
			if (!con.isClosed()){
					//ִ��sql���
					rs = statement.executeQuery(sql);
			} else {
				System.out.println("���ݿ�����ʧ��...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * ��ӣ��޸ģ�ɾ��
	 * @param sql
	 * @return ��������
	 */
	public static int exUpdate(String sql){
		//����Statement
		Statement statement = null;
		//��¼����
		int result = 0;
		try {
			statement = con.createStatement();
			//ִ��sql���
			result = statement.executeUpdate(sql);
			System.out.println("�ɹ�����" + result + "����¼...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//���ش���ļ�¼����
		return result;
	}
}
