package variable;

public class variable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="盖伦";
		char a='c';
		//转义字符的使用有几种方式，当然也可以使用\0xabcd,\0ab这样的不同进制，因为java用的是unicode编码，每两个字节一读，而ASCII码的255个完全够用
		char tab='\t';//制表符
		char carriageReturn='\r';//回车
		char newLine='\n';//换行
		char doubleQuote='\"';//双引号
		char singleQuote='\'';//单引号
		char backslash='\\';//反斜杠符号
		System.out.println(tab);
		System.out.println(carriageReturn);
		System.out.println(newLine);
		System.out.println(doubleQuote);
		System.out.println(singleQuote);
		System.out.println(backslash);





	}

}
