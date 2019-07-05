package Interface_learning;

public class Support extends Hero implements Healer{
	public void heal()
	{
		System.out.println("治愈！");
	}//@override接口方法

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Support s1=new Support();
		s1.heal();
		
	}

}
