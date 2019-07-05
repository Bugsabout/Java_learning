package control_process;
//水仙花数，所谓的水仙花数首先必定是一个3位数，其次每一位的3次方都和这个三位数相等

public class flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n=100;n<1000;n++)
		{
			int a,b,c;
			a=n/100;
			b=(n-a*100)/10;
			c=n-a*100-b*10;
			if(n==(a*a*a+b*b*b+c*c*c))
				System.out.println("水仙花数："+n);
		}
	}

}
