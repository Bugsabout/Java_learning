package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=GMT%2B8","root","123456");
				Statement s=c.createStatement();
				)
		{
			String name="dashen";
			String password="thisispassword1";
			String sql="select * from user where name='"+name+"' and password='"+password+"'";
			ResultSet rs=s.executeQuery(sql);
			if(rs.next())
			{
				System.out.println("’À∫≈√‹¬Î’˝»∑");
			}
			else {
				System.out.println("’À∫≈√‹¬Î¥ÌŒÛ");
			}
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
