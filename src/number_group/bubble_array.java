package number_group;

public class bubble_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如何实现（我要实现冒泡）排序法的关键就是从第一个开始，一直和相邻的数字进行比较，大的往后放，直到最大的在最后之后
		int[] a=new int[5];
		a[0]=(int)(Math.random()*100);
		a[1]=(int)(Math.random()*100);
		a[2]=(int)(Math.random()*100);
		a[3]=(int)(Math.random()*100);
		a[4]=(int)(Math.random()*100);
		
		System.out.println("数组中的各个随机数：");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);//随机赋值，对数组进行冒泡排序
		
		
		//冒泡的思路就是不断将最小的移到最前
		int[] b=new int[5];
		System.out.println("排序后的结果如下所示：");
		for(int i=0;i<a.length;i++)//i的值一直往后移，每当它往后移动，他的前面这个值必定已经成为整个数组中最小的一个数字
		{
			for(int j=a.length-1;j>i;j--)//j的值每次内循环都是数组最后一位往前走，相邻的数组进行比较，小的往前移动，知道j-1和i的值相遇停止，这样i的值就是j-1就是后面最小的一个数，这个时候内循环结束一次
			{
				int temp;
				if(a[j-1]>a[j])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
			System.out.println(a[i]);
		}
		

	}

}
