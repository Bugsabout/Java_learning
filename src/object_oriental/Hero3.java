//ͨ��ʹ�������ĳ�Ա���������������Խ��иı�
package object_oriental;

public class Hero3 {
	String name;//����
	float hp;//Ѫ��
	float armor;//����
	int moveSpeed;//�ƶ��ٶ�
	
	float getArmor()
	{
		return armor;//��ȡ����ֵ�ķ���������������float
	}
	
	void keng()
	{
		System.out.println("�Ӷ��ѣ�");//�޲Σ��������͵ķ���
	}
	
	void addSpeed(int Speed)
	{
		moveSpeed=moveSpeed+Speed;
	}
	public static void main(String[] args)
	{
		Hero3 garen=new Hero3();
		garen.name="����	";
		garen.hp=350f;
		garen.moveSpeed=350;
		garen.addSpeed(50);
		System.out.println(garen.moveSpeed);
	}
}
