package number_group;
//����һ��ǿ���͵�forѭ�������ܱ�����ȡ������ÿһ������ֵ�����ǲ��ܶ����������޸ģ����ԣ�������Ҫһ���������������ض�ȡ����������
public class augmented_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {24,43,23,67,43};
		int max=a[0];
		System.out.println("���������������趨Ϊ��"+max);
		for(int each:a)
		{
			if(each>max)
			{
				max=each;
			}
		}
		System.out.println(max);

	}

}
