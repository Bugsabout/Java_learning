//ʹ��Scanner����Ҫ�ȵ�����������У����ж�ȡ�ַ�����.nextLine(),Ϊ�������νӶ�ȡ�������ȡ�ַ���������Ҫ����ʹ��nextLine()�������س���ȡ��
package operation;
import java.util.Scanner;

public class test_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("��ȡһ������");
		int k=sc.nextInt();
		System.out.println(k);
		System.out.println("��ȡһ���ַ���");
		String rn=sc.nextLine();//ʹ��һ�������Ϊ�˱������Ǵ����ȡ���س��ַ���
		String a=sc.nextLine();
		System.out.println(a);
	}

}
