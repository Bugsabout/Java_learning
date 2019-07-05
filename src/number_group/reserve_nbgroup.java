package number_group;
//实现随机赋值，然后数组的值进行反转，如果可以的话后面使用字符串的reserve更快
public class reserve_nbgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		a[0]=(int)(Math.random()*100);
		a[1]=(int)(Math.random()*100);
		a[2]=(int)(Math.random()*100);
		a[3]=(int)(Math.random()*100);
		a[4]=(int)(Math.random()*100);
		
		System.out.println("数组中的各个随机数：");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		//数组进行颠倒
		int b[]=new int[5];			
		int c=a.length;		
		for(int j=0;j<a.length;j++)
		{

			b[j]=a[c-1];
			c--;
			System.out.println(b[j]);
		}
		
	}

}
