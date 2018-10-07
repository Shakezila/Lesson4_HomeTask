package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Student {

	private static int id = 0;

	private String name;
	private String surName;
	private int age;
	private int rating;
	String group;
	private int course;
	private int studentId;
	private List<Subject> subjects;
	private Map<List<Subject>, ArrayList<Integer>> grades;

	public Student(String name, String surName, int age, int course) {
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.course = course;
		id++;
		this.studentId = id;
		subjects = new ArrayList<>();
		grades = new HashMap<>();
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRaiting() {
		return rating;
	}

	public void setRaiting(int raiting) {
		this.rating = raiting;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects.add(subjects);
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Map<List<Subject>, ArrayList<Integer>> getGrades() {
		return grades;
	}

	public void setFirstGrades(Subject subject, Integer grade) {
		this.grades.put(subjects, new ArrayList<>(Arrays.asList(grade)));
	}

	public void setGrades(Subject subject, Integer grade) {
		for (Entry<List<Subject>, ArrayList<Integer>> entry : grades.entrySet()) {
			if (entry.getKey().contains(subject)) {
				
			} else {
				setFirstGrades(subject, grade);
			}
		}
	}

	public int getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return String.format("Student id[%d]: Name - %-10s Surname - %-10s: age - %d, course - %d, has raiting - %d",
				studentId, name, surName, age, course, rating);
	}
}
