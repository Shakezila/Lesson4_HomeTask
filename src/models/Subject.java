package models;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private static int id = 0;

	private String subjectName;
	private int academuHoursAmount;
	private List<Student> students;
	private int subjectId;
	
	public Subject() {
		
	}

	public Subject(String name, int academuHoursAmount) {
		this.subjectName = name;
		this.academuHoursAmount = academuHoursAmount;
		id++;
		this.subjectId = id;
		students = new ArrayList<>();
	}

	public String getName() {
		return subjectName;
	}

	public void setName(String name) {

		this.subjectName = name;
	}

	public int getAcademuHoursAmount() {
		return academuHoursAmount;
	}

	public void setAcademuHoursAmount(int academuHoursAmount) {
		this.academuHoursAmount = academuHoursAmount;
	}

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return String.format("Subject id[%d]: Name - %s, hours amount - %d", subjectId, subjectName,
				academuHoursAmount);
	}
}
