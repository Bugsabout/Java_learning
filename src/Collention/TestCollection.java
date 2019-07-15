package Collention;
import java.util.HashMap;


public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashmap的存储方式是键值对，只要找到键，就可以求出相应的值了
		HashMap<String,String> dictionary=new HashMap<>();
		dictionary.put("adc", "物理英雄");
		dictionary.put("apc", "魔法英雄");
		dictionary.put("t", "坦克");
		
		System.out.println(dictionary.get("t"));
	}

}
