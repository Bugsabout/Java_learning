package control_process;
import java.util.Scanner;
public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((((n%4)==0)&&(!((n%100)==0)))||((n%400)==0))//闰年条件，①能够被4整除，但不能被100整除②能够被400整除，二者满足其一即可
		{
			System.out.println(n+"是闰年");
		}
		else
			System.out.println("不是闰年");
	}

}
