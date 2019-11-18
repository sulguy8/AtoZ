import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("가나다");
		strList.add("나다");
		strList.add("가다");
		strList.add("오라");
		
		String searchStr = "나";

		for(int i=0;i<strList.size();i++) {
			if(strList.get(i).indexOf(searchStr)==-1) {
				strList.remove(i);
			}
		}
		
		System.out.println(lst);
		
//		List<String> tmpLst = new ArrayList<String>();
//		for (int i = 0; i < lst.size(); i++) {
//			for (int a = 0; a<=2; a++) {
//				if (lst.get(i).indexOf(str) == a) {
//					tmpLst.add(lst.get(i));
//				}
//			}
//		}
//		System.out.println(tmpLst);
		
		}
}