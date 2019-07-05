package number_group;
import java.util.Arrays;//这是属于集合类中的内容，详情看javaP184
//在array_merge中我我有学到使用system.arraycopy(src,srcpos,dest,despos,length)去复制一个数组到另一个数组之中
//它的缺点就是要在另外准备一个数组并分配好长度来接受复制的内容

public class arrays_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {18,62,68,82,65,9};
		//copyOfRange(int[] original,int from,int to)
		//第一个参数表示源数组
		//第二个参数表示开始位置(取得到)
		//第三个参数表示结束位置（取不到）
		int[] b=Arrays.copyOfRange(a, 0, a.length);
		for(int each:b)
		{
			System.out.println(each);//这就将我最近刚学到的强化型for循环用来显示输出结果了
		}
	}

}
