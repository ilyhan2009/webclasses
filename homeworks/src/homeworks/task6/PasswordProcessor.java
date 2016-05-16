package homeworks.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordProcessor {
	
	private Pattern pattern;
	private Matcher matcher;

	private static final String PASSWORD_PATTERN = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$";
	// Строчные и прописные латинские буквы, цифры, спецсимволы. Минимум 8 символов
	
	public PasswordProcessor() {
		pattern = Pattern.compile(PASSWORD_PATTERN);
	}
	
	public boolean validate(final String hex) {
		matcher = pattern.matcher(hex);
		return matcher.matches();
	}
	
	public void parse(String s) throws CorrectPasswordException {
			
/*		boolean uppercase = false;
		boolean digit = false;
		boolean firstSymbolIsLetter = false;
		
		for (int i=0; i<s.length(); i++) {
			char symb = s.charAt(i);
			if ((symb>=65) && (symb<=90)) {
				if (i==0) {
					uppercase = true;
					firstSymbolIsLetter = true;
				}
				else
					uppercase = true;
			}
			
			if ((symb>=97) && (symb<=122) && (i==0))
				firstSymbolIsLetter = true;
			
			if ((symb>=48) && (symb<=57))
				digit = true;
		}
		
		if ((uppercase) && (digit) && (firstSymbolIsLetter) && (s.length()>=8)) {
		
		*/

		
		boolean valid = this.validate(s);
		if (valid)
			throw new CorrectPasswordException("<br>Пароль корректен");
		else
			throw new CorrectPasswordException("<br>Пароль НЕ корректен");
	}
}
