package homeworks.task3;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task3Servlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)	throws IOException 
	{
		resp.setContentType("text/plain; charset=utf-8");
		
		if ((req.getParameter("m")!=null)&&(req.getParameter("n")!=null))
		{
			String m = req.getParameter("m");
			float m1 = Float.parseFloat(m);
			
			String n = req.getParameter("n");
			float n1 = Float.parseFloat(n);
			
			if (Math.abs(m1-10)<Math.abs(n1-10))
				resp.getWriter().println("\"m\" ближе к 10 на "+(Math.abs(n1-10)-Math.abs(m1-10)));
			else
				if (Math.abs(m1-10)>Math.abs(n1-10))
					resp.getWriter().println("\"n\" ближе к 10 на "+(Math.abs(m1-10)-Math.abs(n1-10)));
				else
					if (m1 == n1)
						resp.getWriter().println("Никто, т.к. \"m\" = \"n\"");
			
			
				
		}

		if ((req.getParameter("m")==null)||(req.getParameter("n")==null))
		{
			// типы данных
			byte b = 127;
			resp.getWriter().println(b + "<br>");

			short s = 32767;
			resp.getWriter().println(s + "<br>");

			int i = 999999999;
			resp.getWriter().println(i + "<br>");

			// для чисел типа long обязательно добавлять 'l'
			long l = 100l;
			resp.getWriter().println(l + "<br>");

			// символьный тип данных
			char c2 = 'c';
			char c3 = 1200;
			resp.getWriter().println(c2 + "<br>");
			resp.getWriter().println(c3 + "<br>");

			// в шестнадцатиричной системе счисления
			char c = 0x0770;
			resp.getWriter().println(c + "<br>");

			/*
			 * //вывод символов for (char c1 = 1200; c1<1300;c1++){
			 * System.out.print(c1+" "); if ((c1 % 10)==0){
			 * System.out.println("==="); } }
			 */

			// приведение типов
			resp.getWriter().println((int) c + "<br>");

			int h = 3, g = 2;
			resp.getWriter().println(h / g + "<br>");
			resp.getWriter().println((float) h / g + "<br>");

			float h1 = 30000000000000000.0f, g1 = 2;
			resp.getWriter().println(h1 / g1 + "<br>");
			resp.getWriter().println((int) (h1 / g1) + "<br>");

			resp.getWriter().println("<br>");
			float f = 100000000000000000000000000000000000000.0f;
			resp.getWriter().println(f + "<br>");
			double googol = 1e100;
			double d = 1100.34;
			boolean bool = true;

			// escape-символы
			resp.getWriter().println(googol + "<br>");
			resp.getWriter().print(d + "<br>Отступ строки" + "<br>" + "<br>");

			// условный оператор switch
			int x = 1, y = 2, z, operation = 0;

			switch (operation) {
			case 0:
				z = x + y;
				break;
			case 1:
				z = x - y;
				break;
			case 2:
				z = x * y;
				break;
			default:
				z = x / y;
			}
			resp.getWriter().println(
					"Результат выполнения операции: " + z + "<br>");

			// цикл for
			long factorial = 1;
			for (l = 1l; l < 10; l++) {
				factorial *= l;
			}
			resp.getWriter().println(factorial + "<br>");

			// массивы
			int[] m1;
			int[] m2 = new int[5];
			int[] m3 = { 1, 2, 3 };
			resp.getWriter().println(m3[0] + "<br>");

			int[][] m4;
			int[][] m5 = { { 1, 2 }, { 3 } };
			resp.getWriter().println(m5[1][0] + "<br>");

			String[] str = new String[4];
			String[] seasons = { "Зима", "Весна", "Лето", "Осень" };

			for (i = 0; i < seasons.length; i++) {
				resp.getWriter().println(seasons[i] + "<br>");
			}

			double dd = Math.random();
			resp.getWriter().println(dd + "<br>");

			int random = (int) (dd * 100);
			resp.getWriter().println(random + "<br>");
		}
	}

		
}

