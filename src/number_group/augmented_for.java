package number_group;
//这是一个强化型的for循环，他能遍历读取数组中每一个数的值，但是不能对他们做出修改，所以，我们需要一个第三变量来承载读取出来的数字
public class augmented_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {24,43,23,67,43};
		int max=a[0];
		System.out.println("现在最大的数字我设定为："+max);
		for(int each:a)
		{
			if(each>max)
			{
				max=each;
			}
		}
		System.out.println(max);

	}

}
