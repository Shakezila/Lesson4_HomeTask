package models;

public class Teacher {

	private static int id = 0;

	private String name;
	private String surName;
	private Subject subject;
	private int teacherId;

	public Teacher(String name, String surName) {
		this.name = name;
		this.surName = surName;
		id++;
		teacherId = id;
		subject = new Subject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getTeacherId() {
		return teacherId;
	}

	@Override
	public String toString() {
		return String.format("Teacher id[%d]: Name - %s Surname - %s: subject - %s.", teacherId, name, surName,
				subject.getName());
	}
}
