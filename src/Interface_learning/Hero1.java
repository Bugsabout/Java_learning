package Interface_learning;

public class Hero1 {
	public String name;
	protected float hp;
	public String toString()
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero1 h=new Hero1();
		h.name="����";
		System.out.println(h.toString());
		//���������ģ������ʱ���׵�hpҲ����ֵ�ˣ�������hpҲ�᷵�ظ���
		System.out.println(h);
	}

}
