package singleTon;
//������ǵ���ģʽ�еĶ���ģʽ����������������ؾͻ�����Ψһһ������

public class GiantDragon {
	//��������»�Ĭ�ϸ���һ���յĹ��췽��������ʵ����
	private GiantDragon()
	{
		//˽�л����췽���ǵĸ����޷����ⲿͨ��new����ʵ�����������Ļ����췽����ûЧ����
	}
	private static GiantDragon instance=new GiantDragon();
	//�����̬��Ա�������๲��������ֻ������һ�Σ�����
	//����ָ��Ķ����ֻ������һ��
	public static GiantDragon getInstance()
	{
		return instance;//��������Ҫ��ȡ��ʵ���Ͼ����������ɶ�new GiantDragon()����
	}
	public static void main(String[] args)
	{
		GiantDragon g1=GiantDragon.instance;
		GiantDragon g2=GiantDragon.getInstance();
		System.out.println(g1);
		System.out.println(g2);//��ʵ�����ң�ͨ��������ľ�̬�������߱��������Ի��һ����Ч��
		//ͬʱ����Ҳ������Ϊ����Ƕ���ʽ��ȱ�㣬�����ǲ�����ֻ��ͨ������ȥ��ȡΨһʵ������ĵ�ַ��������ȫû��д�����ı�Ҫ��
	}

}
