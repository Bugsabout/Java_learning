package File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/LOL.txt");
		try (FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr)){
			while(true) {
				//一次读一行
				String line=br.readLine();
				if(line==null)
					break;
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
