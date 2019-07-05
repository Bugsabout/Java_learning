package object_oriental;
public class Hero4 {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	void legendary()
	{
		System.out.println("³¬Éñ£¡");
	}
	
	float getHp()
	{
		return this.hp;
	}
	
	void recovery(float blood)
	{
		hp=hp+blood;
	}
}
