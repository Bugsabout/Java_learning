package number_group;

public class choice_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ҫʵ��ѡ������ѡ��������Ǵӵ�һ����ʼ����������ÿһ�����ֽ��бȽϣ���С��һ��������ָ��λ�ã�Ȼ������ظ�����
		int[] a=new int[5];
		a[0]=(int)(Math.random()*100);
		a[1]=(int)(Math.random()*100);
		a[2]=(int)(Math.random()*100);
		a[3]=(int)(Math.random()*100);
		a[4]=(int)(Math.random()*100);
		
		System.out.println("�����еĸ����������");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		int i,j,k;
		System.out.println("ѡ�����������");
		for(i=0;i<a.length-1;i++)
		{
			k=i;//k����¼��Сֵ���±�
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[k])
				{
					k=j;		
				}	
			}//��ѭ��������kָ��i����С��һ����,kΪ�±�
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
