package homework;

import java.util.HashMap;
import java.util.Map;

public class StudentImpl implements Student {
	Map<String, StudentVO> studentList = new HashMap<String, StudentVO>();
	StudentVO stVO = new StudentVO();
	
	@Override
	public StudentVO insertStudent(StudentVO stVO) {
		studentList.put(stVO.name, stVO);
		System.out.println(studentList.get(stVO.name));
		return null;
	}

	@Override
	public Map<String, String> updateStudent(StudentVO st) {
		
		return null;
	}

	@Override
	public Map<String, String> deleteStudent(StudentVO st) {
		
		return null;
	}

	@Override
	public Map<String, String> selectStudent(StudentVO st) {

		return null;
	}

	@Override
	public Map<String, String> selectStudentList(StudentVO st) {
		
		return null;
	}

	public static void main(String[] args) {
	}
}
