package number_group;

public class Two_dimesion_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[5][5];//����һ��5*5�Ķ�ά����
		System.out.println("�����ֵ��Ķ�ά����������ʾ��");
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
		//������ɶ�ά����������ֵ��������Ҫ����ȡ���е����ֵ
		
		int max=a[0][0];//��������������a[0][0]
		int m=0,n=0;//m��n��Ҫ���������ά������±�λ��,��Ҫ���г�ʼ��
		for(int k=0;k<5;k++)
		{
			for(int l=0;l<5;l++)    //�������뵽�ľ���֮ǰ��ѧ��ǿ����for���������飬ͻȻ���ֶ�ά�������̫���á�
			{
				if(a[k][l]>max)
				{
					max=a[k][l];
					m=k;
					n=l;			
				}
			}
		}
		System.out.println("����������"+a[m][n]);
		System.out.println("���������ǣ�["+m+"]"+"["+n+"]");
		
	}
}
