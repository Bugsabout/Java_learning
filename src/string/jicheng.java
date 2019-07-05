package string;
//这是对Java继承类的练习
class item{
	String name;
	int price;
}
public class jicheng extends item{
	int ac;//护甲类，继承了item类同时也具有自己的ac属性

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jicheng g1=new jicheng();//实例化g1
		jicheng g2=new jicheng();//实例化g2
		g1.name="木甲";
		g1.price=500;
		g1.ac=300;
		g2.name="铁甲";
		g2.price=800;
		g2.ac=400;
	}

}
