package singleTon;
//��д����ʽ����ģʽ
public class GiantDragon2 {
	private GiantDragon2() {
		//���Ȼ����ù��췽����Ч��
	}
	private static GiantDragon2 instance;//����һ����̬��Ա���ԣ���ʱδ��ֵ����Ϊnull
	private static GiantDragon2 getInstance()
	{
		if(instance==null)
		{
			instance=new GiantDragon2();
			//�����Լ�ʱ��һ��ȥ��ȡinstance��ֵ������ȻΪnull
			//�ǾͰ������е�һ��Ҳ��Ψһһ�γ�ʼ��
		}
		return instance;
	}
	public static void main(String[] args)
	{
		GiantDragon2 g1=GiantDragon2.getInstance();
		System.out.println(g1);
	}

}
