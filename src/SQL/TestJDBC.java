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
			System.out.println("���ݿ��������سɹ�");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/how2java?serverTimezone=GMT%2B8","root", "123456");
			System.out.println("���ݿ����ӳɹ�����ȡ����"+c);
			//GMT%2B8���Ǳ����Ķ�����ʱ��
			Statement s=c.createStatement();
			System.out.println("��ȡstatement����"+s);
			
			String sql="insert into newtable values(1,"+"'��Ī'"+","+313.0f+","+50+")";
			s.execute(sql);
			System.out.print("ִ�в������ɹ���");
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
