package string;
//���Ƕ�Java�̳������ϰ
class item{
	String name;
	int price;
}
public class jicheng extends item{
	int ac;//�����࣬�̳���item��ͬʱҲ�����Լ���ac����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jicheng g1=new jicheng();//ʵ����g1
		jicheng g2=new jicheng();//ʵ����g2
		g1.name="ľ��";
		g1.price=500;
		g1.ac=300;
		g2.name="����";
		g2.price=800;
		g2.ac=400;
	}

}
