package control_process;
//��������ϰ���Ҳ�̫�ᣬ����ѧ֪ʶ��û�п�����Щ

public class millionaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double F=0;//Ͷ�ʵ�����
		int n=1;//���
		double r=0.2;//������
		double p=12000;//����
		while(F<=1000000)
		{
			F=(p+F)*(Math.pow(1.2,n));
			n++;
		}
		System.out.println("Ͷ����"+n+"��");
		
		

	}

}
