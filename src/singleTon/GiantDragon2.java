package singleTon;
//编写懒汉式单例模式
public class GiantDragon2 {
	private GiantDragon2() {
		//首先还是让构造方法无效化
	}
	private static GiantDragon2 instance;//声明一个静态成员属性，此时未赋值所以为null
	private static GiantDragon2 getInstance()
	{
		if(instance==null)
		{
			instance=new GiantDragon2();
			//发现自己时第一次去获取instance的值，它竟然为null
			//那就帮它进行第一次也是唯一一次初始化
		}
		return instance;
	}
	public static void main(String[] args)
	{
		GiantDragon2 g1=GiantDragon2.getInstance();
		System.out.println(g1);
	}

}
