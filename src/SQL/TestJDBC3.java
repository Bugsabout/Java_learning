package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC3 {
	public static Hero get(int id)
	{
		Hero hero=null;
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
			String sql="select * from newtable where id="+id;
			ResultSet rs=s.executeQuery(sql);
			//因为id是唯一的，ResultSet最多只能有一条记录
			//所以使用if代替while
			if(rs.next())
			{
				hero=new Hero();
				String name=rs.getString(2);
				float hp=rs.getFloat("hp");
				int damage=rs.getInt(4);
				hero.name=name;
				hero.hp=hp;
				hero.damage=damage;
				hero.id=id;
			}
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return hero;
		
	}
	
	
	public static void main(String[] args)
	{
		Hero h=get(1);
		System.out.println(h.name);
	}
}
