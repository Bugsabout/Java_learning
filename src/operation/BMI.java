package operation;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args)
	{
		System.out.println("�������������(m)��");
		Scanner scanner=new Scanner(System.in);
		float f=scanner.nextFloat();
		System.out.println("�������������أ�kg����");
		short kg=scanner.nextShort();
		System.out.println("����ǰ��BMI�ǣ�"+(kg/(f*f)));
	}
}
