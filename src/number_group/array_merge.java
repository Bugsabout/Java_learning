package number_group;
//将2个数组中的数据合并
//首先数组在声明的时候就是固定下来的了，他的长度不能改变，所以我们声明一个新的数组，长度为第一个数组和第二个数组之和。
//system.arraycopy(src,srcpos,dest,destpos,length)
//其中src就是源头数组；
//srcpos就是从源数组的哪个下标开始
//length就是要复制的长度
public class array_merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {65,70,86,77,43,10};
		int[] b=new int[] {24,39,23,28,26,67,89};
		int[] c=new int[20];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		for(int each:c)
		{
			System.out.println("c数组中的内容为："+each);
		}
		
	}

}
