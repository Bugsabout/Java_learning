//使用Scanner类需要先导入这个它才行，其中读取字符串是.nextLine(),为了正常衔接读取整数后读取字符串，我们要两次使用nextLine()方法将回车读取掉
package operation;
import java.util.Scanner;

public class test_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("读取一个整数");
		int k=sc.nextInt();
		System.out.println(k);
		System.out.println("读取一个字符串");
		String rn=sc.nextLine();//使用一次这个是为了避免我们错误读取到回车字符串
		String a=sc.nextLine();
		System.out.println(a);
	}

}
