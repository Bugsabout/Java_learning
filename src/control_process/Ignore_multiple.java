//ͨ��ʹ��continue������������Ҫ�������������3����5�ı���
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
