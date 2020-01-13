package homework;

import java.util.Map;

public interface Student {
	StudentVO insertStudent(StudentVO stVO);
	Map<String, String> updateStudent(StudentVO st);
	Map<String, String> deleteStudent(StudentVO st);
	Map<String, String> selectStudent(StudentVO st);
	Map<String, String> selectStudentList(StudentVO st);
}
