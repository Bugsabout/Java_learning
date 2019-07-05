package control_process;
import java.util.Scanner;
public class jiechen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i=sc.nextInt();
		int sum=1;
		while(i>0)
		{
			sum=sum*i;
			i--;
		}
		System.out.println("阶乘的值为；"+sum);//这样的作法是一种凑活的做法，书上叫我们的方法实际上需要使用到递归。
	}

}
