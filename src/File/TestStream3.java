package File;

import java.io.IOException;
import java.io.InputStream;

public class TestStream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(InputStream is =System.in){
			while(true) {
				//
				int i=is.read();
				System.out.println(i);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
