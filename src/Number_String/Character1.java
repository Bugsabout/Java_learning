package Number_String;
import java.util.Scanner;

public class Character1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ַ���");
		String str=sc.nextLine();
		System.out.println(str);
		char[] a=str.toCharArray();
		for(char each:a)
		{
			if(((each>='A')&&(each<='Z'))||((each>='0')&&(each<='9')))//���������ǿ����forѭ�����ǾͿ���ʹ��isUppercase��isletter���ж�
			{
				System.out.println(each);
			}
		}
		
	}

}
