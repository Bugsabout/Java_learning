//
package variable;

public class variable6 {
	public static void main(String[] args)
	{
		short a=1;
		short b=2;//问的是a+b是什么类型的数据
		System.out.println(a+b);//其实这个时候返回的是int类型，因为a+b默认就是int类型，你要想回到short类型就要进行强制转换
		
	}
}
