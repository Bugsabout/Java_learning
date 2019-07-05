package operation;

public class operation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=++i+(i++)+(++i)+(++i)+i++ ;
		System.out.println(j);
	//这个题我一开始自己算的是8，但其实要从左到右一点一点的算，因为“+”是一个双目运算符。每次算完前面两个，i的值就已经变换了，所以不能一次性去以为i还是只加一个1
	}

}
