package number_group;

import java.util.Arrays;

//Ҫʹ�ö�������֮ǰ��������Ҫ֪������ԭ������һ���ź��������
//Ҫ�Ƚϵ�����ͨ����λ�������м�����ֱȽ���ȷ�����ķ�Χ��һֱ�ظ��Ƚϣ��ظ�ȷ����Χ
//ֱ��ȷ����һ�������ϣ��鿴�Ƿ�������Ҫ�ҵ�����

/*1.����2.�������֣�3.�����±�*/
public class arrays_binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {18,62,68,82,65,9};
		Arrays.sort(a);
		System.out.println("�ź����������ʾ���£�");
		System.out.println(Arrays.toString(a));
		System.out.println("����������62��λ��Ϊ��");
		System.out.println(Arrays.binarySearch(a, 62));

	}

}
