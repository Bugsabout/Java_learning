package number_group;

import java.util.Arrays;

//要使用二分搜索之前，我们需要知道它的原理，他是一个排好序的数组
//要比较的数字通过和位于数组中间的数字比较来确定它的范围，一直重复比较，重复确定范围
//直到确定到一个数字上，查看是否是我们要找的数字

/*1.排序，2.查找数字，3.返回下标*/
public class arrays_binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {18,62,68,82,65,9};
		Arrays.sort(a);
		System.out.println("排好序的数组显示如下：");
		System.out.println(Arrays.toString(a));
		System.out.println("数组中数字62的位置为：");
		System.out.println(Arrays.binarySearch(a, 62));

	}

}
