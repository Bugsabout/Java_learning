package control_process;
import java.util.Scanner;
public class BMI_2rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的身高：");
		float height=sc.nextFloat();
		System.out.println("请输入您的体重：");
		int kg=sc.nextInt();
		float bmi=kg/(height*height);
		if(bmi<18.5)
			System.out.println("体重过轻！");
		else if(bmi<24)
		{
			System.out.println("体重正常！");
		}
		else if(bmi<27)
			System.out.println("体重过重！");
		else if(bmi<30)
			System.out.println("亲赴肥胖！");
		else if(bmi<35)
			System.out.println("中度肥胖！");
		else
			System.out.println("重度肥胖！");
	}

}
