package File;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/LOL.txt");
		try(FileInputStream fis=new FileInputStream(f)){
			byte[] all=new byte[(int)f.length()];
			fis.read(all);		
			for(byte c:all)
			{
				System.out.println(c);
			}
		}
		catch(IOException e){
			e.printStackTrace();
			//�ֽ�����ȡ�Ľ�������ֽ��룬��Ҳ������ò��ˣ�ʹ����Ҫ�Լ�����ת��
			
		}
	}

}
