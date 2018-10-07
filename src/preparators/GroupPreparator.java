package preparators;

import java.util.ArrayList;
import java.util.List;
import Helpers.Reader;
import Helpers.Messages;
import models.Group;

public class GroupPreparator {
	private List<Group> groups;

	public GroupPreparator() {
		groups = new ArrayList<Group>();
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void createGroup() {
		groups.add(new Group(Reader.readGroup(Messages.GROUP_NAME)));
	}

	public void removeGroup(Group group) {
		for (Group g : groups) {
			if (g.equals(group)) {
				if (g.getStudents().isEmpty()) {
					groups.remove(g);
				} else {
					System.out.println("The group has a students!\n" + "Do you want clear students and delete group?\n"
							+ "       y - yes     n - no");
					String menu = Reader.readMenu(Messages.MENU);
					switch (menu) {
					case "y": {
						removeStudens(g);
						System.out.println("Group was deleted!");
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

	private void removeStudens(Group group) {
		for (Group g : groups) {
			if (g.equals(group)) {
				g.getStudents().clear();
			}
		}
	}
}
