package number_group;
import java.util.Arrays;
//一般我们输出显示一个数组的内容需要使用到for循环
//但实际上我们可以直接将整个数组转换成字符串再打印即可
//需要使用到的就是arrrays.toString()方法

public class arrays_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {18,62,68,65,9};
		String content=Arrays.toString(a);
		System.out.println(content);
	}

}
