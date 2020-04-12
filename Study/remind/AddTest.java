package review.remind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

class Test4 {

}
public class AddTest extends Test4 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new LinkedHashMap<String, String>();
		List<HashMap<String,String>> lst = new ArrayList<HashMap<String,String>>();	
		lst.add(map);
		lst.add(map);
		lst.add(map);
		
		map.put("하이", "하이루");
		map.put("하이2", "하이루2");
		map.put("하이3", "하이루3");
		
		

		
		
		map.put("호잇", "호이루");
		map.put("호잇2", "호이루2");
		map.put("호잇3", "호이루3");
		
		
		map = new LinkedHashMap<String, String>();
		
		
		map.put("호오잇", "호오이루");
		map.put("호오잇2", "호오이루2");
		map.put("호오잇3", "호오이루3");

		for(int i=0; i<lst.size(); i++) {
		System.out.println(lst.get(i));
		}
		
	}			
}

