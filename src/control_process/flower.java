package control_process;
//ˮ�ɻ�������ν��ˮ�ɻ������ȱض���һ��3λ�������ÿһλ��3�η����������λ�����

public class flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n=100;n<1000;n++)
		{
			int a,b,c;
			a=n/100;
			b=(n-a*100)/10;
			c=n-a*100-b*10;
			if(n==(a*a*a+b*b*b+c*c*c))
				System.out.println("ˮ�ɻ�����"+n);
		}
	}

}
