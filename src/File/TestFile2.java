package File;
import java.io.File;

public class TestFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/");
		
		f.list();
		//以字符串数组的形式，返回当前文件夹下所有的文件（只有本体）（不包含子文件及子文件夹）
		
		File[] fs=f.listFiles();
		//以文件数组的形式，返回当前文件下的所有文件的路径（不包含子文件及子文件夹）
		
		f.getParent();
		//字符串的形式返回获取所在文件夹
		
		f.getParentFile();
		//以文件形式返回获取所在文件
		
		f.mkdir();
		//创建文件加，如果父文件skin不存在，创建就无效
		
		f.mkdirs();
		//创建文件夹，如果夫文件skin不存在，就创建父文件
		
		//f.createNewFile();
		//创建一个新文件夹，如果父文件skin不存在，就会抛出异常
		
		f.getParentFile().mkdirs();
		//因为有以上的错误，所以通常创建一个空文件之前，都会创建父目录
		
		f.listRoots();
		//列出所有的盘符；
		
		f.delete();
		//删除文件
		
		f.deleteOnExit();
		//临时文件，JVM结束的时候，删除文件
		
		
		
	}

}
