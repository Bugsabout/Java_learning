package Number_String;
import java.util.Scanner;

public class digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入地名：");
		String place=sc.nextLine();
		System.out.println("请输入公司类型：");
		String classify=sc.nextLine();
		System.out.println("请输入公司名称：");
		String name=sc.nextLine();
		System.out.println("请输入老板的名字：");
		String boss=sc.nextLine();
		System.out.println("请输入金额");
		String money=sc.nextLine();
		System.out.println("请输入产品");
		String thing=sc.nextLine();
		System.out.println("请输入价格计量单位;");
		String gram=sc.nextLine();
		String sentence="%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了！我们没有办法拿着%s抵工资！原价一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块！%s王八蛋，你不是人！";
		System.out.printf(sentence,place,classify,name,boss,money,thing,gram,gram,gram,thing,boss);
		
		//这里编写是没有错误的，但是如果你使用拼音去输入汉字，可能会有将拼音也输入的风险，这应该时eclipse的问题吧
		
		

		

	}

}
