package control_process;
import java.util.Scanner;
public class season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸öÔÂ·İ£º");
		int month=sc.nextInt();
		switch(month)
		{
		case 1:System.out.println("¶¬¼¾£¡");break;
		case 2:System.out.println("¶¬¼¾£¡");break;
		case 3:System.out.println("´º¼¾£¡");break;
		case 4:System.out.println("´º¼Ù£¡");break;
		case 5:System.out.println("´º¼¾£¡");break;
		case 6:System.out.println("ÏÄ¼¾£¡");break;
		case 7:System.out.println("ÏÄ¼¾£¡");break;
		case 8:System.out.println("ÏÄ¼¾£¡");break;
		case 9:System.out.println("Çï¼¾£¡");break;
		case 10:System.out.println("Çï¼¾£¡");break;
		case 11:System.out.println("Çï¼¾£¡");break;
		case 12:System.out.println("¶¬¼¾£¡");break;
		default:System.out.println("ÄúÊäÈëµÄÔÂ·İ²»ÕıÈ·");
		}
	}

}
