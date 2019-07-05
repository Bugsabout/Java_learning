//通过使用类对象的成员方法对类对象的属性进行改变
package object_oriental;

public class Hero3 {
	String name;//姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	
	float getArmor()
	{
		return armor;//获取护甲值的方法，返回类型是float
	}
	
	void keng()
	{
		System.out.println("坑队友！");//无参，返回类型的方法
	}
	
	void addSpeed(int Speed)
	{
		moveSpeed=moveSpeed+Speed;
	}
	public static void main(String[] args)
	{
		Hero3 garen=new Hero3();
		garen.name="盖伦	";
		garen.hp=350f;
		garen.moveSpeed=350;
		garen.addSpeed(50);
		System.out.println(garen.moveSpeed);
	}
}
