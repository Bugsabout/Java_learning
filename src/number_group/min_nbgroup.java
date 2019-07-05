package number_group;

public class min_nbgroup {

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
		int min=a[0];
		for(int j=1;j<5;j++)
		{

			if(a[j]<min)
				min=a[j];
		}
		System.out.println("最小的数字"+min);
	}

}
