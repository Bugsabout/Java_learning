package control_process;
import java.util.Scanner;
public class jiechen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		int i=sc.nextInt();
		int sum=1;
		while(i>0)
		{
			sum=sum*i;
			i--;
		}
		System.out.println("�׳˵�ֵΪ��"+sum);//������������һ�ִջ�����������Ͻ����ǵķ���ʵ������Ҫʹ�õ��ݹ顣
	}

}
