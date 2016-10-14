package task.E20160729.connecttodb;


import java.sql.*;

public class ConnectToDb {

	public static void main(String[] args) {
		// ����Connection����
		Connection con;
		// ����������
		String driver = "com.mysql.jdbc.Driver";
		// URLָ��Ҫ���ʵ����ݿ���mydata
		String url = "jdbc:mysql://localhost:3306/firstdb";
		// MySQL����ʱ���û���
		String user = "root";
		// MySQL����ʱ������
		String password = "root";
		// ������ѯ�����
		try {
			// ������������
			Class.forName(driver);
			// 1.getConnection()����������MySQL���ݿ⣡��
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			// 2.����statement���������ִ��SQL��䣡��
			Statement statement = con.createStatement();
			// Ҫִ�е�SQL���
			String sql = "select * from user";
			// 3.ResultSet�࣬������Ż�ȡ�Ľ��������
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("-----------------");
			System.out.println("ִ�н��������ʾ:");
			System.out.println("-----------------");
			System.out.println(" ѧ��" + "\t" + " ����");
			System.out.println("-----------------");

			String name = null;
			String psw = null;
			while (rs.next()) {
				// ��ȡstuname��������
				name = rs.getString("username");
				// ��ȡstuid��������
				psw = rs.getString("password");
				// ����ʹ��ISO-8859-1�ַ�����name����Ϊ�ֽ����в�������洢�µ��ֽ������С�
				// Ȼ��ʹ��GB2312�ַ�������ָ�����ֽ����顣
				name = new String(name.getBytes("ISO-8859-1"), "utf-8");
				// ������
				System.out.println(name + "\t" + psw);
			}
			rs.close();
			con.close();
			
/*			// ������while����κ���������´���Σ�
//			String name = null;
//
//			String id = null;
			while(rs.next()){
				// ��ȡstuname��������
				name = rs.getString("stuname");
				// ��ȡstuid��������
				id = rs.getString("stuid");
				// ����ʹ��ISO-8859-1�ַ�����name����Ϊ�ֽ����в�������洢�µ��ֽ������С�
				// Ȼ��ʹ��GB2312�ַ�������ָ�����ֽ����顣
				name = new String(name.getBytes("ISO-8859-1"), "gb2312");
				// ������
				System.out.println(id + "\t" + name);
			}

			PreparedStatement psql;
			ResultSet res;
			// Ԥ����������ݣ���������������--������
			psql=con.prepareStatement("insert into student values(?,?)");psql.setInt(1,8); // ���ò���1������idΪ5������
			psql.setString(2,"xiaogang"); // ���ò���2��name ΪС��
			psql.executeUpdate(); // ִ�и���

			// Ԥ������£��޸ģ�����
			psql=con.prepareStatement("update student set stuname = ? where stuid = ?");psql.setString(1,"xiaowang"); // ���ò���1����name��Ϊ����
			psql.setInt(2,10); // ���ò���2����idΪ2���������޸�
			psql.executeUpdate();

			// Ԥ����ɾ������
			psql=con.prepareStatement("delete from student where stuid = ?");psql.setInt(1,5);psql.executeUpdate();

			// ��ѯ�޸����ݺ�student���е�����
			psql=con.prepareStatement("select*from student");res=psql.executeQuery(); // ִ��Ԥ����sql���
			System.out.println("ִ�����ӡ��޸ġ�ɾ���������");while(res.next())

			{
				name = res.getString("stuname");
				id = res.getString("stuid");
				name = new String(name.getBytes("ISO-8859-1"), "gb2312");
				System.out.println(id + "\t" + name);
			} res.close();psql.close();
*/		} catch (ClassNotFoundException e) {
			// ���ݿ��������쳣����
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// ���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("���ݿ����ݳɹ���ȡ����");
		}
	}



}