package control_process;
import java.util.Scanner;
public class season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���·ݣ�");
		int month=sc.nextInt();
		switch(month)
		{
		case 1:System.out.println("������");break;
		case 2:System.out.println("������");break;
		case 3:System.out.println("������");break;
		case 4:System.out.println("���٣�");break;
		case 5:System.out.println("������");break;
		case 6:System.out.println("�ļ���");break;
		case 7:System.out.println("�ļ���");break;
		case 8:System.out.println("�ļ���");break;
		case 9:System.out.println("�＾��");break;
		case 10:System.out.println("�＾��");break;
		case 11:System.out.println("�＾��");break;
		case 12:System.out.println("������");break;
		default:System.out.println("��������·ݲ���ȷ");
		}
	}

}
