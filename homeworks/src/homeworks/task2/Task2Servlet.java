package homeworks.task2;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		if ((req.getParameter("var1")==null)&&(req.getParameter("var2")==null)&&(req.getParameter("operation")==null))
		{
			resp.getWriter().println("Hello, world");
		}
	
		
		if ((req.getParameter("var1")!=null)&&(req.getParameter("var2")!=null)&&(req.getParameter("operation")!=null))
		{
			String var1 = req.getParameter("var1");
			int i1 = Integer.parseInt(var1);
			
			String var2 = req.getParameter("var2");
			int i2 = Integer.parseInt(var2);
			
			String operation = req.getParameter("operation");
			
			switch (operation) {
			case "0":
				resp.getWriter().println(i1 + i2);
				break;
			case "1":
				resp.getWriter().println(i1 - i2);
				break;
			case "2":
				resp.getWriter().println(i1 * i2);
				break;
			case "3":
				resp.getWriter().println(i1 / i2);
				break;
			default:
				resp.getWriter().println("Error");
				break;
			}

		}

		
	}
}
