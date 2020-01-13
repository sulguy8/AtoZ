package homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentImpl implements Student {
	Map<String, StudentVO> rMap = new HashMap<String, StudentVO>();
	StudentVO stVO = new StudentVO();

	@Override
	public StudentVO insertStudent(List<String> stList) {
		stVO = new StudentVO();
		stVO.setName(stList.get(0));
		stVO.setAge(stList.get(1));
		stVO.setAddr(stList.get(2));
		return stVO;
	}

	@Override
	public StudentVO updateStudent(List<String> stList) {
		stVO = new StudentVO();
		stVO.setName(stList.get(0));
		stVO.setAge(stList.get(1));
		stVO.setAddr(stList.get(2));		
		return stVO;
	}

	@Override
	public int deleteStudent(String name) {
		
		return 0;
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
