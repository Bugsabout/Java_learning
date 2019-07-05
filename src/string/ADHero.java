package string;


public class ADHero extends Hero{
	public void attack() {
		System.out.println(this.name+"的攻击miss！");
	}
	public void attack(Hero...heros)
	{
		for(int i=0;i<heros.length;i++)
		{
			System.out.println(name+"攻击了"+heros[i].name);
		}//使用这种可变参数的变量，这样再对多个相同类型的数据进行操作的时候，可以变成数组
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADHero bh=new ADHero();
		bh.name="赏金猎人";
		Hero h1=new Hero();
		h1.name="盖伦";
		Hero h2=new Hero();
		h2.name="提莫";
		bh.attack();
		bh.attack(h1,h2);

	}
}
