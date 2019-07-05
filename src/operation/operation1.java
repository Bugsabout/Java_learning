package operation;
import java.util.Scanner;
//Scanner是可以用来从控制端输入对象的，通过申明一个scanner对象，从控制台来获取信息，再将它赋值给其他对象，实现实时信息。
public class operation1 {
	public static void main(String[] args)
	{
		System.out.println("请输入第一个整数：");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("请输入第二个整数：");
		int b=s.nextInt();
		System.out.println("两数之和："+(a+b));
	}
}
