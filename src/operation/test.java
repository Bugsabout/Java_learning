package operation;
//����һ��1-7��������ʹ����Ԫ�������ж��ǲ��ǹ�����
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ܼ���");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int k=(s>=1&&s<=5)?1:2;
		if(k==1)
			System.out.println("�����ǹ�����");
		else
			System.out.println("��������ĩ");
		
	}

}
