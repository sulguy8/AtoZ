package review;

import java.util.HashMap;
import java.util.Map;

public class Prac {
	
	int pracInt (Map<String,String> map) {
		
		int a = map.size();
		
		return a;
	}
	
	public static void main(String[] args) {
		Prac prc = new Prac();
		Map<String,String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		System.out.println(prc.pracInt(map));
		

	}
	
}