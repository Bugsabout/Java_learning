package number_group;

import java.util.Arrays;

public class arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {18,62,68,82,65,9};
		Arrays.sort(a);//使用arrays类的sort方法进行排序，没有返回值，所以直接用
		System.out.println(Arrays.toString(a));//为了输出方方便，就将排好序的数组转换为字符串
		
	}

}
