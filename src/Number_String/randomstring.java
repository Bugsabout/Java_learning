package Number_String;

public class randomstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a =new char[5];
		int n=0;
		int b=0;
		
		//这就完成了一个长度为5的随机字符串的练习，我不知道那些ASCII码，但我知道大概的范围，如果不确定，可以范围更大一些
		//
		do
		{
			b=(int)(Math.random()*200);
			if(((b>='A')&&(b<='Z'))||((b>='a')&&(b<='z'))||((b>='0')&&(b<='9')))
			{

				a[n]=(char)b;
				System.out.print(a[n]);
				n=n+1;
			}
		}while(n<5);
	}

}
