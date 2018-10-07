package preparators;

import java.util.ArrayList;
import java.util.List;

import Helpers.Messages;
import Helpers.Reader;
import models.Subject;

public class SubjectPreparator {

	private List<Subject> subjects;

	public SubjectPreparator() {
		subjects = new ArrayList<>();
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void createSubject() {
		String name = Reader.readString(Messages.SUBJECT_NAME);
		int academuHoursAmount = Reader.readInt(Messages.ACADEMIC_HOURS);

		subjects.add(new Subject(name, academuHoursAmount));
	}

	public void removeSubject(Subject subject) {
		for (Subject s : subjects) {
			if (s.equals(subject)) {
				if (s.getStudents().isEmpty()) {
					subjects.remove(s);
				} else {
					System.out.println("The subject has a students!\n"
							+ "Do you want clear students and delete subject?\n" + "       y - yes     n - no");
					String menu = Reader.readMenu(Messages.MENU);
					switch (menu) {
					case "y": {
						removeStudens(s);
						System.out.println("Subject was deleted!");
						break;
					}
					case "n": {
						System.out.println("Operation rejected!");
						break;
					}
					}
				}
			}
		}
	}

	private void removeStudens(Subject subject) {
		for (Subject s : subjects) {
			if (s.equals(subject)) {
				s.getStudents().clear();
			}
		}
	}
}
