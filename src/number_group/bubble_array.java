package number_group;

public class bubble_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ʵ�֣���Ҫʵ��ð�ݣ����򷨵Ĺؼ����Ǵӵ�һ����ʼ��һֱ�����ڵ����ֽ��бȽϣ��������ţ�ֱ�����������֮��
		int[] a=new int[5];
		a[0]=(int)(Math.random()*100);
		a[1]=(int)(Math.random()*100);
		a[2]=(int)(Math.random()*100);
		a[3]=(int)(Math.random()*100);
		a[4]=(int)(Math.random()*100);
		
		System.out.println("�����еĸ����������");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);//�����ֵ�����������ð������
		
		
		//ð�ݵ�˼·���ǲ��Ͻ���С���Ƶ���ǰ
		int[] b=new int[5];
		System.out.println("�����Ľ��������ʾ��");
		for(int i=0;i<a.length;i++)//i��ֵһֱ�����ƣ�ÿ���������ƶ�������ǰ�����ֵ�ض��Ѿ���Ϊ������������С��һ������
		{
			for(int j=a.length-1;j>i;j--)//j��ֵÿ����ѭ�������������һλ��ǰ�ߣ����ڵ�������бȽϣ�С����ǰ�ƶ���֪��j-1��i��ֵ����ֹͣ������i��ֵ����j-1���Ǻ�����С��һ���������ʱ����ѭ������һ��
			{
				int temp;
				if(a[j-1]>a[j])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
			System.out.println(a[i]);
		}
		

	}

}
