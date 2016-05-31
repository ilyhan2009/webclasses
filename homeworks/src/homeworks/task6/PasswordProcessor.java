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
		
		boolean valid = this.validate(s);
		if (!valid)
			throw new CorrectPasswordException("<div class=\"alert alert-danger\" role=\"alert\">Пароль НЕ корректен</div>");
	}
}
