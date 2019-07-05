package Interface_learning;

public class Hero1 {
	public String name;
	protected float hp;
	public String toString()
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero1 h=new Hero1();
		h.name="盖伦";
		System.out.println(h.toString());
		//这个看情况的，如果此时盖伦的hp也被赋值了，那他连hp也会返回给你
		System.out.println(h);
	}

}
