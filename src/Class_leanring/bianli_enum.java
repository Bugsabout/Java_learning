package Class_leanring;
enum Season{
	Spring,Summer,Autumn,Winter;
}//ʹ�������ö���࣬����ֻ���ĸ�����

public class bianli_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ʹ����ǰ��ѧϰ����ǿ��forѭ�������
		for(Season s:Season.values())//�������ǿ���֪��.values���ص���һ������
		{
			System.out.println(s);
		}
	}

}
