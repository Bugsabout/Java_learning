package singleTon;
//这个就是单例模式中的饿汉模式，不能怎样，类加载就会生成唯一一个对象。

public class GiantDragon {
	//正常情况下会默认给类一个空的构造方法来进行实例化
	private GiantDragon()
	{
		//私有化构造方法是的该类无法在外部通过new进行实例化，这样的话构造方法就没效果了
	}
	private static GiantDragon instance=new GiantDragon();
	//这个静态成员被整个类共享，所以它只会生成一次，所以
	//它所指向的对象就只能是这一个
	public static GiantDragon getInstance()
	{
		return instance;//最后别人想要获取的实际上就是上面生成额new GiantDragon()对象
	}
	public static void main(String[] args)
	{
		GiantDragon g1=GiantDragon.instance;
		GiantDragon g2=GiantDragon.getInstance();
		System.out.println(g1);
		System.out.println(g2);//事实告诉我，通过调用类的静态方法或者变量都可以获得一样的效果
		//同时，我也可以认为这就是饿汉式的缺点，它还是不仅仅只能通过方法去获取唯一实例对象的地址，这样完全没有写方法的必要性
	}

}
