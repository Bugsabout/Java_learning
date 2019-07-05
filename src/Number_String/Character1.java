package Number_String;
import java.util.Scanner;

public class Character1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串");
		String str=sc.nextLine();
		System.out.println(str);
		char[] a=str.toCharArray();
		for(char each:a)
		{
			if(((each>='A')&&(each<='Z'))||((each>='0')&&(each<='9')))//如果不适用强化型for循环我们就可以使用isUppercase和isletter来判断
			{
				System.out.println(each);
			}
		}
		
	}

}
