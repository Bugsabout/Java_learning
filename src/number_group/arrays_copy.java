package number_group;
import java.util.Arrays;//�������ڼ������е����ݣ����鿴javaP184
//��array_merge��������ѧ��ʹ��system.arraycopy(src,srcpos,dest,despos,length)ȥ����һ�����鵽��һ������֮��
//����ȱ�����Ҫ������׼��һ�����鲢����ó��������ܸ��Ƶ�����

public class arrays_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {18,62,68,82,65,9};
		//copyOfRange(int[] original,int from,int to)
		//��һ��������ʾԴ����
		//�ڶ���������ʾ��ʼλ��(ȡ�õ�)
		//������������ʾ����λ�ã�ȡ������
		int[] b=Arrays.copyOfRange(a, 0, a.length);
		for(int each:b)
		{
			System.out.println(each);//��ͽ��������ѧ����ǿ����forѭ��������ʾ��������
		}
	}

}
