package homeworks.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailProcessor {
	
	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public EmailProcessor() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}
	
	public boolean validate(final String hex) {
		matcher = pattern.matcher(hex);
		return matcher.matches();
	}

	public void parse(String s) throws CorrectEmailException {
		
		boolean valid = this.validate(s);
		if (valid)
			throw new CorrectEmailException("<div class=\"alert alert-success\" role=\"alert\">e-mail корректен</div>");
		else
			throw new CorrectEmailException("<div class=\"alert alert-danger\" role=\"alert\">e-mail НЕ корректен</div>");

	
	//Проверить введенные данные как делали на паре с формой, но только с исключениями. Проверка емаил, сложности пароля, числа, и другие..
		//проверка идет на сервере, и выводит на клиента
	}
}
