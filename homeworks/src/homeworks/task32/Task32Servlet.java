package homeworks.task32;

import java.io.IOException;
//import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task32Servlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}
	
	private static boolean isDigit(String s) throws NumberFormatException {
	    try {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	private void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		
		if ((a!=null)&&(b!=null)&&(c!=null))
		{
			if (isDigit(a)&&isDigit(b)&&isDigit(c))
			{
				int a1 = Integer.parseInt(a);
				int b1 = Integer.parseInt(b);
				int c1 = Integer.parseInt(c);

				int d = b1 * b1 - 4 * a1 * c1;

				if (d >= 0) 
				{
					request.setAttribute("x1", Double.toString((-b1 + Math.sqrt(d)) / 2 / a1));
					request.setAttribute("x2", Double.toString((-b1 - Math.sqrt(d)) / 2 / a1));
					request.setAttribute("mathres", "Корни найдены");
				} 
				else 
				{
					request.setAttribute("x1", "error");
					request.setAttribute("x2", "error");
					request.setAttribute("mathres", "Корней нет");
				}

			}
			else
			{
				request.setAttribute("errortext", "Некорректный ввод!");
				request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
				return;
			}
		}
		else
		{
			request.setAttribute("errortext", "Сервлет не получил данные с формы!");
			request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
			return;
		}
		
		
		
		
		int arr[][] = new int[8][5];
		java.util.Random r = new java.util.Random(System.currentTimeMillis());
		for (int i=0; i<8; i++)
		{
			for (int j=0; j<5; j++)
			{
				arr[i][j] =  r.nextInt(90)+10;
			}

		}
		request.setAttribute("arr", arr);
		
		int arr2[][] = new int[5][8];
		java.util.Random r2 = new java.util.Random(System.currentTimeMillis());
		int max = -99;
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<8; j++)
			{
				arr2[i][j] =  r2.nextInt(199)-99;
				if (arr2[i][j]>max)
					max = arr2[i][j];
			}

		}
		request.setAttribute("arr2", arr2);
		request.setAttribute("max", max);
		
		request.getRequestDispatcher("/WEB-INF/jsp/show.jsp").forward(request, response);
		return;
	}
}