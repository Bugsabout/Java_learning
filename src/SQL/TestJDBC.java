package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/how2java?serverTimezone=GMT%2B8","root", "123456");
			System.out.println("数据库连接成功！获取对象"+c);
			//GMT%2B8就是北京的东八区时间
			Statement s=c.createStatement();
			System.out.println("获取statement对象"+s);
			
			String sql="insert into newtable values(1,"+"'提莫'"+","+313.0f+","+50+")";
			s.execute(sql);
			System.out.print("执行插入语句成功！");
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
