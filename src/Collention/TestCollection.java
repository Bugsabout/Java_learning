package Collention;
import java.util.HashMap;


public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashmap�Ĵ洢��ʽ�Ǽ�ֵ�ԣ�ֻҪ�ҵ������Ϳ��������Ӧ��ֵ��
		HashMap<String,String> dictionary=new HashMap<>();
		dictionary.put("adc", "����Ӣ��");
		dictionary.put("apc", "ħ��Ӣ��");
		dictionary.put("t", "̹��");
		
		System.out.println(dictionary.get("t"));
	}

}
