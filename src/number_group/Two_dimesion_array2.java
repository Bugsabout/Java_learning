package number_group;
//���ȶ���һ��5*8�Ķ�ά���飬Ȼ��ʹ��������������
//����arrays�����Զ�ά�����������

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
		System.out.println("�����ֵ�������Ϊ��");
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
		//5*8����ĸ�ֵ��������������Ҫ��������
		
		int[] b=new int[40];//����һ���ܷ��¶�ά�����������ֵ�һά������Ϊ��תվ
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				b[8*i+j]=a[i][j];//��a�����е�ֵ���и�ֵ
			}
		}
		Arrays.sort(b);//��b�����������
		//����������ɣ���Ҫ��b�����е����ݷ��ظ�a��ά����
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				a[i][j]=b[8*i+j];
			}
		}
		System.out.println("����������Ϊ��");
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
