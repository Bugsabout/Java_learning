package number_group;

public class Two_dimesion_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[5][5];//定义一个5*5的二维数组
		System.out.println("随机赋值后的二维数组如下所示：");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				a[i][j]=(int)(Math.random()*100);
				System.out.print(a[i][j]+"\t");
				if(j==4)
				{
					System.out.println("\n");
				}
			}
		}
		//到此完成二维数组的随机赋值，现在需要进行取其中的最大值
		
		int max=a[0][0];//假设其中最大的是a[0][0]
		int m=0,n=0;//m和n主要用来保存二维数组的下标位置,需要进行初始化
		for(int k=0;k<5;k++)
		{
			for(int l=0;l<5;l++)    //首先我想到的就是之前刚学的强化型for来遍历数组，突然发现二维数组好像不太适用。
			{
				if(a[k][l]>max)
				{
					max=a[k][l];
					m=k;
					n=l;			
				}
			}
		}
		System.out.println("最大的数字是"+a[m][n]);
		System.out.println("他的坐标是：["+m+"]"+"["+n+"]");
		
	}
}
