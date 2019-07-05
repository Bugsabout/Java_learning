package operation;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args)
	{
		System.out.println("请输入您的身高(m)：");
		Scanner scanner=new Scanner(System.in);
		float f=scanner.nextFloat();
		System.out.println("请输入您的体重（kg）：");
		short kg=scanner.nextShort();
		System.out.println("您当前的BMI是："+(kg/(f*f)));
	}
}
