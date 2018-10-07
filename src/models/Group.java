package models;

import java.util.List;

public class Group {

	private static int id = 0;

	private String name;
	private int groupId;
	private List<Student> students;

	public Group(String name) {
		this.name = name;
		id++;
		this.groupId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	@Override
	public String toString() {

		return String.format("Group id[%d]: Name - %s", groupId, name);
	}
}
