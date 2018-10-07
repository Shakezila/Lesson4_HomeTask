package Helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	static boolean stringValidator(String string) {
		Pattern p = Pattern.compile("^[a-zA-z]{1,20}$");
		Matcher m = p.matcher(string);
		return m.matches();
	}

	static boolean groupValidator(String string) {
		Pattern p = Pattern.compile("^[a-zA-z]{2,2}[0-9]{4,4}$");
		Matcher m = p.matcher(string);
		return m.matches();
	}
	
	static boolean menuValidator(String string) {
		Pattern p = Pattern.compile("^[a-z]{1,1}$");
		Matcher m = p.matcher(string);
		return m.matches();
	}
}
