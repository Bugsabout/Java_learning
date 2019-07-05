package operation;

public class logic_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		boolean b=!(i++==3)^(i++==2)&&(i++==3);
		System.out.println(b);
		System.out.println(i);
	}

}
