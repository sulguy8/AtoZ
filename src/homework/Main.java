package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.등록 2.수정 3.삭제 4.검색 5.리스트 6.종료");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StudentVO stVO = new StudentVO();
		Student st = new StudentImpl();
		Map<String, StudentVO> studentList = new HashMap<String, StudentVO>();

		while () {

			if ("1".equals(str)) {
				System.out.println("이름을 쓰거라");
				String name = scan.nextLine();
				System.out.println("나이를 쓰거라");
				String age = scan.nextLine();
				System.out.println("주소를 쓰거라");
				String addr = scan.nextLine();

				stVO.setName(name);
				stVO.setAge(age);
				stVO.setAddr(addr);

				studentList.put(stVO.getName(), stVO);

			} else if ("2".equals(str)) {
				System.out.println("수정");
			} else if ("3".equals(str)) {
				System.out.println("삭제");
			} else if ("4".equals(str)) {
				System.out.println("검색");
			} else if ("5".equals(str)) {
				System.out.println(studentList);
			} else {
				System.out.println("정확한 번호를 입력해주세요");
			}

			System.out.println("1.등록 2.수정 3.삭제 4.검색 5.리스트 6.종료");
			str = scan.nextLine();

			if ("6".equals(str)) {
				System.out.println("종료");
				break;
			}
		}
	}
}
