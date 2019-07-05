package operation;
//输入一个1-7的整数，使用三元操作符判断是不是工作日
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("今天是周几：");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int k=(s>=1&&s<=5)?1:2;
		if(k==1)
			System.out.println("今天是工作日");
		else
			System.out.println("今天是周末");
		
	}

}
