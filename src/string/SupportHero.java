package string;

public class SupportHero extends Hero {
	double hp;
	public void Heal() {
		System.out.println("治愈失败！");
	}
	
	public void Heal(Hero h,double hp) {
		h.hp=h.hp+hp;
		System.out.println(name+"为英雄"+h.name+"治愈了"+hp+"点血量");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SupportHero s1=new SupportHero();
			s1.name="盲僧";
			Hero h1=new Hero();
			h1.name="提莫";
			h1.hp=1200;
			s1.Heal(h1, 30);
	}

}
