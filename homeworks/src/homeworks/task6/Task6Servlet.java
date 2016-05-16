package homeworks.task6;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task6Servlet extends HttpServlet {
	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public Task6Servlet() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	public boolean validate(final String hex) {
		matcher = pattern.matcher(hex);
		return matcher.matches();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain; charset=utf-8");

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		try {
			EmailProcessor emailProcessor = new EmailProcessor();
			emailProcessor.parse(email);
		}
		
		catch (CorrectEmailException e) {
			resp.getWriter().println(e.getMessage());
		}
		
		
		
		try {
			PasswordProcessor passwordProcessor = new PasswordProcessor();
			passwordProcessor.parse(password);
		}
		
		catch (CorrectPasswordException e) {
			resp.getWriter().println(e.getMessage());
		}
		

	}

}
