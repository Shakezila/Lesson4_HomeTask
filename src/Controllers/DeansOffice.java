package Controllers;

import java.util.ArrayList;
import java.util.List;
import Helpers.Messages;
import Helpers.Reader;
import models.Student;
import models.Subject;
import models.Teacher;
import preparators.GroupPreparator;
import preparators.StudentPreparator;
import preparators.SubjectPreparator;
import preparators.TeacherPreparator;

public class DeansOffice {
	private StudentPreparator studentPreparator;
	private GroupPreparator groupPreparator;
	private SubjectPreparator subjectPreparator;
	private TeacherPreparator teacherPreparator;

	public DeansOffice() {
		this.studentPreparator = new StudentPreparator();
		this.groupPreparator = new GroupPreparator();
		this.subjectPreparator = new SubjectPreparator();
		this.teacherPreparator = new TeacherPreparator();
	}

	public StudentPreparator getStudentPreparator() {
		return studentPreparator;
	}

	public GroupPreparator getGroupPreparator() {
		return groupPreparator;
	}

	public SubjectPreparator getSubjectPreparator() {
		return subjectPreparator;
	}

	public TeacherPreparator getTeacherPreparator() {
		return teacherPreparator;
	}

	public void addSubjectForStudent(Student student, Subject subject) {
		for (Student s : getStudentPreparator().getStudents()) {
			if (s.equals(student)) {
				s.getSubjects().add(subject);
			}
			for (Subject sub : getSubjectPreparator().getSubjects()) {
				if (sub.equals(subject)) {
					sub.getStudents().add(s);
					break;
				}
			}
		}
	}

	public void addSubjectForTeacher(Teacher teacher, Subject subject) {
		for (Subject s : getSubjectPreparator().getSubjects()) {
			if (s.equals(subject)) {
				for (Teacher t : getTeacherPreparator().getTeachers()) {
					if (t.equals(teacher)) {
						t.setSubject(s);
					}
				}
			}
		}
	}

	public Student getStudent() {
		System.out.println("--------------\n"
						 + "student search\n"
						 + "--------------");
		String surName = Reader.readString(Messages.SUR_NAME);
		List<Student> students = new ArrayList<>();
		for (Student s : getStudentPreparator().getStudents()) {
			if (s.getSurName().equals(surName)) {
				students.add(s);
			} else {
				System.out.println("Student not found!");
				return null;
			}
		}

		if (students.size() == 1) {
			return students.get(0);
		} else {
			String name = Reader.readString(Messages.NAME);
			for (Student s : students) {
				if (s.getName().equals(name)) {
					return s;
				}
			}
		}
		return null;
	}

	public Teacher getTeacher() {
		System.out.println("--------------\n"
				 		 + "teacher search\n"
				 		 + "--------------");
		String surName = Reader.readString(Messages.TEACHER_SURNAME);
		List<Teacher> teachers = new ArrayList<>();
		for (Teacher t : getTeacherPreparator().getTeachers()) {
			if (t.getSurName().equals(surName)) {
				teachers.add(t);
			} else {
				System.out.println("Teacher not found!");
				return null;
			}
		}

		if (teachers.size() == 1) {
			return teachers.get(0);
		} else {
			String name = Reader.readString(Messages.NAME);
			for (Teacher t : teachers) {
				if (t.getName().equals(name)) {
					return t;
				}
			}
		}
		return null;
	}

	public Subject getSubject() {
		System.out.println("--------------\n"
				 		 + "subject search\n"
				 		 + "--------------");
		String name = Reader.readString(Messages.SUBJECT_NAME);
		for (Subject s : getSubjectPreparator().getSubjects()) {
			if (s.getName().equals(name)) {
				return s;
			} else {
				System.out.println("Teacher not found!");
			}
		}
		return null;
	}
}
