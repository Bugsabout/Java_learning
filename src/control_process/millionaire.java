package control_process;
//百万富翁练习，我不太会，经济学知识，没有看懂那些

public class millionaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double F=0;//投资的收入
		int n=1;//年份
		double r=0.2;//年利率
		double p=12000;//本金
		while(F<=1000000)
		{
			F=(p+F)*(Math.pow(1.2,n));
			n++;
		}
		System.out.println("投资了"+n+"年");
		
		

	}

}
