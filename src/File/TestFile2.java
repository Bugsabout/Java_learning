package File;
import java.io.File;

public class TestFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/");
		
		f.list();
		//���ַ����������ʽ�����ص�ǰ�ļ��������е��ļ���ֻ�б��壩�����������ļ������ļ��У�
		
		File[] fs=f.listFiles();
		//���ļ��������ʽ�����ص�ǰ�ļ��µ������ļ���·�������������ļ������ļ��У�
		
		f.getParent();
		//�ַ�������ʽ���ػ�ȡ�����ļ���
		
		f.getParentFile();
		//���ļ���ʽ���ػ�ȡ�����ļ�
		
		f.mkdir();
		//�����ļ��ӣ�������ļ�skin�����ڣ���������Ч
		
		f.mkdirs();
		//�����ļ��У�������ļ�skin�����ڣ��ʹ������ļ�
		
		//f.createNewFile();
		//����һ�����ļ��У�������ļ�skin�����ڣ��ͻ��׳��쳣
		
		f.getParentFile().mkdirs();
		//��Ϊ�����ϵĴ�������ͨ������һ�����ļ�֮ǰ�����ᴴ����Ŀ¼
		
		f.listRoots();
		//�г����е��̷���
		
		f.delete();
		//ɾ���ļ�
		
		f.deleteOnExit();
		//��ʱ�ļ���JVM������ʱ��ɾ���ļ�
		
		
		
	}

}
