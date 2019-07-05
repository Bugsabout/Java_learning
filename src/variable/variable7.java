//属性的作用域在方法中，参数的作用域也在方法中，如果属性和参数的命名相同，那么到底会取哪一个值。

package variable;

public class variable7 {
	int i=1;
	public void method1(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		new variable7().method1(5);//这是直接创建了一个variable7类型的对象，并引用了他的方法
	}
}
