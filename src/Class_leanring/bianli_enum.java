package Class_leanring;
enum Season{
	Spring,Summer,Autumn,Winter;
}//使用特殊的枚举类，其中只有四个季节

public class bianli_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这里我们使用了前面学习的增强型for循环类遍历
		for(Season s:Season.values())//所以我们可以知道.values返回的是一个数组
		{
			System.out.println(s);
		}
	}

}
