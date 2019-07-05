package File;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//绝对路径
		File f1=new File("d:/LOLFolder");
		System.out.println("f1的绝对路径："+f1.getAbsolutePath());
		//相对路径，相对与工作目录，如果在eclipse，就是项目目录
		File f2=new File("LOL.exe");
		System.out.println("f2的绝对路径："+f2.getAbsolutePath());
		
		//把f1作为父目录创建文件对象
		File f3=new File(f1,"LOL.exe");
		System.out.println("f3的绝对路径："+f3.getAbsolutePath());
	}

}
