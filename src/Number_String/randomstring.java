package Number_String;

public class randomstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a =new char[5];
		int n=0;
		int b=0;
		
		//��������һ������Ϊ5������ַ�������ϰ���Ҳ�֪����ЩASCII�룬����֪����ŵķ�Χ�������ȷ�������Է�Χ����һЩ
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
