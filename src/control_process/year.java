package control_process;
import java.util.Scanner;
public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((((n%4)==0)&&(!((n%100)==0)))||((n%400)==0))//�������������ܹ���4�����������ܱ�100�������ܹ���400����������������һ����
		{
			System.out.println(n+"������");
		}
		else
			System.out.println("��������");
	}

}
