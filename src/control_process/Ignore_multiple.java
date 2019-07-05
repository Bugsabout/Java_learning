//通过使用continue可以跳过不想要的数，例如忽略3或者5的倍数
package control_process;

public class Ignore_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(((i%3)==0)||((i%5)==0))
			{
				continue;
			}
			else
				System.out.println(i);
		}
	}

}
