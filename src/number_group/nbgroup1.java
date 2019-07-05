package number_group;

public class nbgroup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ;
		a=new int[5];
		System.out.println(a.length);
		a[4]=100;
		//a[5]=101;
		//这句话会使得数组越界，产生java.lang.ArrayIndexOutOfBoundException问题
	}

}
