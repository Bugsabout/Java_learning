package Number_String;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		Integer it=new Integer(i);
		System.out.println(it instanceof Number);
		//instanceof 用来判断是不是某个类或者它的子类，正确返回true
        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值      
        System.out.println(Integer.MIN_VALUE);
        //通过调用包装类的方法来获取最大最小值
        float a=3.14f;
        Float aa=new Float(a);
        System.out.println(aa.toString());
        
        String b="3.14";//如果使用3.1a4会抛出异常
        float bb=Float.parseFloat(b);
        System.out.println(b);
	}

}
