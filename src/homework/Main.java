package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student st = new StudentImpl();
	
		System.out.println("1.등록 2.수정 3.삭제 4.검색 5.리스트 6.종료");
	
		Map<String, StudentVO> studentList = new HashMap<String, StudentVO>();
		List<String> stList = new ArrayList<String>();
		String str = scan.nextLine();
		
		boolean flag = true;
		
		while(flag) {
			if ("1".equals(str)) {
				System.out.println("학생의 이름을 작성하시오");
				stList.add(scan.nextLine());
				System.out.println("학생의 나이를 작성하시오");
				stList.add(scan.nextLine());
				System.out.println("학생의 주소를 작성하시오");
				stList.add(scan.nextLine());
				studentList.put(stList.get(0), st.insertStudent(stList));
				
				stList.clear();
				
			} else if ("2".equals(str)) {
				System.out.println("수정할 학생의 이름을 작성하시오");
				stList.add(scan.nextLine());
				String name = stList.get(0);
				
				if(studentList.get(name) != null) {
					System.out.println("수정할 학생의 나이를 작성하시오");
					stList.add(scan.nextLine());
					System.out.println("수정할 학생의 주소를 작성하시오");
					stList.add(scan.nextLine());	
					studentList.put(stList.get(0), st.updateStudent(stList));
				} else {
					System.out.println("학생이름을 정확하게 적어라");
				}
				
				stList.clear();
				
			} else if ("3".equals(str)) {
				System.out.println("삭제할 학생의 이름을 작성하시오");
				String name = scan.nextLine();		
				
				if(studentList.remove(name) != null) {
					studentList.remove(name);
					System.out.println("삭제 완료!");
				} else {
					System.out.println("삭제 실패!");
				}
				
			} else if ("4".equals(str)) {
				System.out.println("검색할 학생의 이름을 작성하시오");
				String name = scan.nextLine();
				if(studentList.get(name) != null) {
					System.out.println(studentList.get(name));
				} else {
					System.out.println("학생이름을 정확하게 적어라");
				}
				
			} else if ("5".equals(str)) {
				System.out.println(studentList);
				
			} else if ("6".equals(str)) {
				System.out.println("종료");
				flag = false;
				
			} else {
				System.out.println("정확한 번호를 입력해주세요");
			} 
			
			if(flag == true) {
				System.out.println("1.등록 2.수정 3.삭제 4.검색 5.리스트 6.종료");
				str = scan.nextLine();
			}
		}
	}
}
