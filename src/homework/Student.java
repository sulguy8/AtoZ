package homework;

import java.util.List;
import java.util.Map;

public interface Student {
	StudentVO insertStudent(List<String> stList);
	StudentVO updateStudent(List<String> stList);
	int deleteStudent(String name);
	Map<String, String> selectStudent(StudentVO st);
	Map<String, String> selectStudentList(StudentVO st);
}
