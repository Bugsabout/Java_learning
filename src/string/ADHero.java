package string;


public class ADHero extends Hero{
	public void attack() {
		System.out.println(this.name+"�Ĺ���miss��");
	}
	public void attack(Hero...heros)
	{
		for(int i=0;i<heros.length;i++)
		{
			System.out.println(name+"������"+heros[i].name);
		}//ʹ�����ֿɱ�����ı����������ٶԶ����ͬ���͵����ݽ��в�����ʱ�򣬿��Ա������
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADHero bh=new ADHero();
		bh.name="�ͽ�����";
		Hero h1=new Hero();
		h1.name="����";
		Hero h2=new Hero();
		h2.name="��Ī";
		bh.attack();
		bh.attack(h1,h2);

	}
}
