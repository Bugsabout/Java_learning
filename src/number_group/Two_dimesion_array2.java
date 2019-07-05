package number_group;
//首先定义一个5*8的二维数组，然后使用随机数进行填充
//借助arrays方法对二维数组进行排序

import java.util.Arrays;

public class Two_dimesion_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[5][8];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				a[i][j]=(int)(Math.random()*100);
			}
		}
		System.out.println("随机赋值后的数组为：");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(a[i][j]+"\t");
				if(j==7)
				{
					System.out.println("\n");
				}
			}
		}
		//5*8数组的赋值结束，接下来需要进行排序
		
		int[] b=new int[40];//声明一个能放下二维数组所有数字的一维数组作为中转站
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				b[8*i+j]=a[i][j];//将a数组中的值进行赋值
			}
		}
		Arrays.sort(b);//对b数组进行排序
		//至此排序完成，需要将b数组中的内容返回给a二维数组
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				a[i][j]=b[8*i+j];
			}
		}
		System.out.println("排序后的数组为：");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(a[i][j]+"\t");
				if(j==7)
				{
					System.out.println("\n");
				}
			}
		}
		

	}

}
