package preparators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Helpers.Messages;
import Helpers.Reader;
import models.Student;
import models.Teacher;

public class TeacherPreparator {
	private List<Teacher> teachers;

	public TeacherPreparator() {
		teachers = new ArrayList<Teacher>();
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void createTeacher() {
		String name = Reader.readString(Messages.TEACHER_NAME);
		String surName = Reader.readString(Messages.TEACHER_SURNAME);
		teachers.add(new Teacher(name, surName));
	}

	public void removeTeacher(Teacher teacher) {
		for (Teacher t : teachers) {
			if (t.equals(teacher)) {
				teachers.remove(t);
				break;
			}
		}
	}

	public void printTeachers() {
		for (Teacher t : teachers) {
			System.out.println(t);
		}
	}

	public void setGrade(Student student, Teacher teacher) {
		Random r = new Random();
		if (student.getGrades().isEmpty()) {
			student.setFirstGrades(teacher.getSubject(), r.nextInt(10));
		} else {
			student.setGrades(teacher.getSubject(), r.nextInt(10));
		}
	}
}
