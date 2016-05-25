package homeworks.task7;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
//import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.opencsv.CSVReader;

import homeworks.task7.Administrations;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Task7Servlet extends HttpServlet {
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
		
		response.setContentType("text/plain; charset=utf-8");
			
		String csvFile = "/adm.csv";
		
		ServletContext context = getServletContext();
		InputStream stream = context.getResourceAsStream(csvFile);
		
		char cvsSplitBy = ',';
		CSVReader reader = new CSVReader(new InputStreamReader(stream, "utf-8"),cvsSplitBy);
		
		ArrayList<Administrations> AdministrationsList = new ArrayList<Administrations>();
		String[] stringOfData;
		while ((stringOfData = reader.readNext()) != null) {
			
			Administrations myAdmin = new Administrations();
			
			if (!isDigit(stringOfData[0]))
			{
				Administrations titleAdmin = new Administrations();
				titleAdmin.id = stringOfData[0];
				titleAdmin.name = stringOfData[1];
				titleAdmin.address = stringOfData[2];
				titleAdmin.chief = stringOfData[3];
				titleAdmin.phone = stringOfData[4];
				titleAdmin.fax = stringOfData[5];
				titleAdmin.email = stringOfData[6];
				titleAdmin.site = stringOfData[7];
				titleAdmin.inn = stringOfData[8];
				titleAdmin.meetingtime = stringOfData[9];
		
				request.setAttribute("titleAdmin", titleAdmin);
				continue;

			}
			myAdmin.id = stringOfData[0];
			myAdmin.name = stringOfData[1];
			myAdmin.address = stringOfData[2];
			myAdmin.chief = stringOfData[3];
			myAdmin.phone = stringOfData[4];
			myAdmin.fax = stringOfData[5];
			myAdmin.email = stringOfData[6];
			myAdmin.site = stringOfData[7];
			myAdmin.inn = stringOfData[8];
			myAdmin.meetingtime = stringOfData[9];
			
			String[] tmp = stringOfData[1].toString().split(" ");
			myAdmin.district = tmp[1];
			
			AdministrationsList.add(myAdmin);
		}
		reader.close();
		
		request.setAttribute("AdministrationsList", AdministrationsList);
		
		request.getRequestDispatcher("/WEB-INF/jsp/task7show.jsp").forward(request, response);

		return;
	}
}