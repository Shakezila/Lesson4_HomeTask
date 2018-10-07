import Controllers.University;
import models.*;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		University university = new University();
		university.getDean().getStudentPreparator().createStudent();
		university.getDean().getStudentPreparator().printStudents();
		university.getDean().getSubjectPreparator().createSubject();
		university.getDean().getTeacherPreparator().createTeacher();
		Student student = university.getDean().getStudent();
		Teacher teacher = university.getDean().getTeacher();
		Subject subject = university.getDean().getSubject();
		university.getDean().addSubjectForTeacher(teacher, subject);
		university.getDean().addSubjectForStudent(student, subject);
		university.getDean().getTeacherPreparator().setGrade(student, teacher);
		university.getDean().getTeacherPreparator().setGrade(student, teacher);
		university.getDean().getStudentPreparator().printGrades(student);
		
		
	}
}
