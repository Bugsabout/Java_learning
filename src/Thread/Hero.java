package Thread;

public class Hero {
	public String name;
	public float hp;
	public int damage;
	public void attackHero(Hero h) {
		try {
			//Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		h.hp-=damage;
		System.out.format("%s���ڹ���%s��%s��Ѫ�����%f%n",name,h.name,h.name,h.hp);
		if(h.isDead())
			System.out.println(h.name+"���ˣ�");
	}
	
	public boolean isDead() {
		return 0>=hp?true:false;
	}

}