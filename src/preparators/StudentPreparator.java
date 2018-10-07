package preparators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import Helpers.Reader;
import Helpers.Messages;
import models.Student;
import models.Subject;

public class StudentPreparator {
	private List<Student> students;

	public StudentPreparator() {
		students = new ArrayList<Student>();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void createStudent() {
		String name = Reader.readString(Messages.NAME);
		String surName = Reader.readString(Messages.SUR_NAME);
		int age = Reader.readInt(Messages.AGE);
		int course = Reader.readInt(Messages.COURSE);

		students.add(new Student(name, surName, age, course));
	}

	public void removeStudent(Student student) {
		for (Student s : students) {
			if (s.equals(student)) {
				students.remove(s);
				break;
			}
		}
	}

	public void printStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void printGrades(Student student) {
		for (Entry<List<Subject>, ArrayList<Integer>> entry : student.getGrades().entrySet()) {
			System.out.printf("Subject [%s] grades: ", entry.getKey());
			for (Integer i : entry.getValue()) {
				System.out.printf("[%d],", i);
			}
			System.out.println();
		}

	}

}
