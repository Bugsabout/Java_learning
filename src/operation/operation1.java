package operation;
import java.util.Scanner;
//Scanner�ǿ��������ӿ��ƶ��������ģ�ͨ������һ��scanner���󣬴ӿ���̨����ȡ��Ϣ���ٽ�����ֵ����������ʵ��ʵʱ��Ϣ��
public class operation1 {
	public static void main(String[] args)
	{
		System.out.println("�������һ��������");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("������ڶ���������");
		int b=s.nextInt();
		System.out.println("����֮�ͣ�"+(a+b));
	}
}
