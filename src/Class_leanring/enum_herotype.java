package Class_leanring;
enum HeroType{
	TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING
}

public class enum_herotype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroType h=HeroType.ASSASSIN;
		switch(h)
		{
		case TANK:System.out.println("̹��");break;
		case WIZARD:System.out.println("��ʦ");break;
		case ASSASSIN:System.out.println("�̿�");break;
		case ASSIST:System.out.println("����");break;
		case WARRIOR:System.out.println("��ս");break;
		case RANGED:System.out.println("Զ��");break;
		case PUSH:System.out.println("�ƽ�");break;
		case FARMING:System.out.println("��Ұ");break;
		}

	}

}
