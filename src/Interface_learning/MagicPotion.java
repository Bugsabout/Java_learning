package Interface_learning;

public class MagicPotion extends Item {
	public void effect()
	{
		System.out.println("��ƿʹ�ú󣬿��Իָ�ħ����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i=new Item();
		i.effect();
		MagicPotion m=new MagicPotion();
		m.effect();
	}

}
