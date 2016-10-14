package task.E20160729.connecttodb;


import java.sql.*;

public class ConnectToDb {

	public static void main(String[] args) {
		// 声明Connection对象
		Connection con;
		// 驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名mydata
		String url = "jdbc:mysql://localhost:3306/firstdb";
		// MySQL配置时的用户名
		String user = "root";
		// MySQL配置时的密码
		String password = "root";
		// 遍历查询结果集
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 1.getConnection()方法，连接MySQL数据库！！
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			// 2.创建statement类对象，用来执行SQL语句！！
			Statement statement = con.createStatement();
			// 要执行的SQL语句
			String sql = "select * from user";
			// 3.ResultSet类，用来存放获取的结果集！！
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("-----------------");
			System.out.println("执行结果如下所示:");
			System.out.println("-----------------");
			System.out.println(" 学号" + "\t" + " 姓名");
			System.out.println("-----------------");

			String name = null;
			String psw = null;
			while (rs.next()) {
				// 获取stuname这列数据
				name = rs.getString("username");
				// 获取stuid这列数据
				psw = rs.getString("password");
				// 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
				// 然后使用GB2312字符集解码指定的字节数组。
				name = new String(name.getBytes("ISO-8859-1"), "utf-8");
				// 输出结果
				System.out.println(name + "\t" + psw);
			}
			rs.close();
			con.close();
			
/*			// 在上面while代码段后面添加以下代码段：
//			String name = null;
//
//			String id = null;
			while(rs.next()){
				// 获取stuname这列数据
				name = rs.getString("stuname");
				// 获取stuid这列数据
				id = rs.getString("stuid");
				// 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
				// 然后使用GB2312字符集解码指定的字节数组。
				name = new String(name.getBytes("ISO-8859-1"), "gb2312");
				// 输出结果
				System.out.println(id + "\t" + name);
			}

			PreparedStatement psql;
			ResultSet res;
			// 预处理添加数据，其中有两个参数--“？”
			psql=con.prepareStatement("insert into student values(?,?)");psql.setInt(1,8); // 设置参数1，创建id为5的数据
			psql.setString(2,"xiaogang"); // 设置参数2，name 为小明
			psql.executeUpdate(); // 执行更新

			// 预处理更新（修改）数据
			psql=con.prepareStatement("update student set stuname = ? where stuid = ?");psql.setString(1,"xiaowang"); // 设置参数1，将name改为王五
			psql.setInt(2,10); // 设置参数2，将id为2的数据做修改
			psql.executeUpdate();

			// 预处理删除数据
			psql=con.prepareStatement("delete from student where stuid = ?");psql.setInt(1,5);psql.executeUpdate();

			// 查询修改数据后student表中的数据
			psql=con.prepareStatement("select*from student");res=psql.executeQuery(); // 执行预处理sql语句
			System.out.println("执行增加、修改、删除后的数据");while(res.next())

			{
				name = res.getString("stuname");
				id = res.getString("stuid");
				name = new String(name.getBytes("ISO-8859-1"), "gb2312");
				System.out.println(id + "\t" + name);
			} res.close();psql.close();
*/		} catch (ClassNotFoundException e) {
			// 数据库驱动类异常处理
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// 数据库连接失败异常处理
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("数据库数据成功获取！！");
		}
	}



}