package Controllers;

public class University {
	private DeansOffice dean;
	
	public University() {
		this.dean = new DeansOffice();
	}

	public DeansOffice getDean() {
		return dean;
	}
}
