package control_process;
import java.util.Scanner;
public class BMI_2rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������������ߣ�");
		float height=sc.nextFloat();
		System.out.println("�������������أ�");
		int kg=sc.nextInt();
		float bmi=kg/(height*height);
		if(bmi<18.5)
			System.out.println("���ع��ᣡ");
		else if(bmi<24)
		{
			System.out.println("����������");
		}
		else if(bmi<27)
			System.out.println("���ع��أ�");
		else if(bmi<30)
			System.out.println("�׸����֣�");
		else if(bmi<35)
			System.out.println("�жȷ��֣�");
		else
			System.out.println("�ضȷ��֣�");
	}

}
