import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CFWdeduplication {
	
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		Random rd = new Random();
			
			for(int i=0; i<6; i++) {
				int rNum = rd.nextInt(45)+1;
				if (lst.indexOf(rNum) == -1) {
					lst.add(rNum);
				} else {
					i--;
				}		
			}
		System.out.println(lst);	// List의 중복제거
	
		int[] lst2 = new int[6];
		Random r = new Random();
		
			for(int a=0; a<lst2.length; a++) {	
				lst2[a] = r.nextInt(45);
				for(int b= a-1; b>=0; b--) {
					if(a == b) {						
						a--;
						break;
					}						
				}	
		System.out.println(lst2[a]); // 배열의 중복제거
			}
	}	
}

