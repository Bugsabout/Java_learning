package string;

public class SupportHero extends Hero {
	double hp;
	public void Heal() {
		System.out.println("����ʧ�ܣ�");
	}
	
	public void Heal(Hero h,double hp) {
		h.hp=h.hp+hp;
		System.out.println(name+"ΪӢ��"+h.name+"������"+hp+"��Ѫ��");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SupportHero s1=new SupportHero();
			s1.name="äɮ";
			Hero h1=new Hero();
			h1.name="��Ī";
			h1.hp=1200;
			s1.Heal(h1, 30);
	}

}
