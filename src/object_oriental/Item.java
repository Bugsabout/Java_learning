package object_oriental;

public class Item {
	String name;//��Ʒ����
	int price;//�۸�
	public static void main(String[] args)
	{
		Item it1=new Item();
		it1.name="Ѫƿ";
		it1.price=50;
		
		Item it2=new Item();
		it2.name="��Ь";
		it2.price=300;
		
		Item it3=new Item();
		it3.name="����";
		it3.price=350;
		System.out.println("������Ʒ������Ϊ��"+it1.name+it2.name+it3.name);
	}
}
