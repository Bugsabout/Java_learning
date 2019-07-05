package object_oriental;

public class Item {
	String name;//物品名称
	int price;//价格
	public static void main(String[] args)
	{
		Item it1=new Item();
		it1.name="血瓶";
		it1.price=50;
		
		Item it2=new Item();
		it2.name="草鞋";
		it2.price=300;
		
		Item it3=new Item();
		it3.name="长剑";
		it3.price=350;
		System.out.println("三个物品的名称为："+it1.name+it2.name+it3.name);
	}
}
