package number_group;
//��2�������е����ݺϲ�
//����������������ʱ����ǹ̶��������ˣ����ĳ��Ȳ��ܸı䣬������������һ���µ����飬����Ϊ��һ������͵ڶ�������֮�͡�
//system.arraycopy(src,srcpos,dest,destpos,length)
//����src����Դͷ���飻
//srcpos���Ǵ�Դ������ĸ��±꿪ʼ
//length����Ҫ���Ƶĳ���
public class array_merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {65,70,86,77,43,10};
		int[] b=new int[] {24,39,23,28,26,67,89};
		int[] c=new int[20];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		for(int each:c)
		{
			System.out.println("c�����е�����Ϊ��"+each);
		}
		
	}

}
