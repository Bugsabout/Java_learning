package Number_String;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		Integer it=new Integer(i);
		System.out.println(it instanceof Number);
		//instanceof �����ж��ǲ���ĳ��������������࣬��ȷ����true
        //int�����ֵ
        System.out.println(Integer.MAX_VALUE);
        //int����Сֵ      
        System.out.println(Integer.MIN_VALUE);
        //ͨ�����ð�װ��ķ�������ȡ�����Сֵ
        float a=3.14f;
        Float aa=new Float(a);
        System.out.println(aa.toString());
        
        String b="3.14";//���ʹ��3.1a4���׳��쳣
        float bb=Float.parseFloat(b);
        System.out.println(b);
	}

}
