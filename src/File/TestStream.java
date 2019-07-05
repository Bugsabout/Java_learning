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
			//字节流读取的结果都是字节码，你也许根本用不了，使用需要自己进行转换
			
		}
	}

}
