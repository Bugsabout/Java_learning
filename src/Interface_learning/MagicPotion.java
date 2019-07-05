package Interface_learning;

public class MagicPotion extends Item {
	public void effect()
	{
		System.out.println("蓝瓶使用后，可以恢复魔法！");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i=new Item();
		i.effect();
		MagicPotion m=new MagicPotion();
		m.effect();
	}

}
