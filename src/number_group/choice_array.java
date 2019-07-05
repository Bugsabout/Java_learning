package number_group;

public class choice_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//要实现选择排序，选择排序就是从第一个开始和数组后面的每一个数字进行比较，最小的一个放在所指的位置，然后后移重复操作
		int[] a=new int[5];
		a[0]=(int)(Math.random()*100);
		a[1]=(int)(Math.random()*100);
		a[2]=(int)(Math.random()*100);
		a[3]=(int)(Math.random()*100);
		a[4]=(int)(Math.random()*100);
		
		System.out.println("数组中的各个随机数：");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		int i,j,k;
		System.out.println("选择排序后结果：");
		for(i=0;i<a.length-1;i++)
		{
			k=i;//k来记录最小值的下标
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[k])
				{
					k=j;		
				}	
			}//内循环结束，k指向i后最小的一个数,k为下标
			if(k>i)
			{
				int temp;
				temp=a[k];
				a[k]=a[i];
				a[i]=temp;
			}
		}
		for(int n=0;n<a.length;n++)
		{
			System.out.println(a[n]);
		}
	}

}
