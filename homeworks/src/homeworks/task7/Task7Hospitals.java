package homeworks.task7;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.opencsv.CSVReader;

import homeworks.task7.Hospitals;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Task7Hospitals extends HttpServlet {
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
			
		String district = request.getParameter("district");
		
		if (district!=null)
		{
			String csvFile = "/hospitals.csv";
		
			ServletContext context = getServletContext();
			InputStream stream = context.getResourceAsStream(csvFile);
			
			char cvsSplitBy = ',';
			CSVReader reader = new CSVReader(new InputStreamReader(stream, "utf-8"),cvsSplitBy);
			
			ArrayList<Hospitals> HospitalsList = new ArrayList<Hospitals>();
			String[] stringOfData;
			while ((stringOfData = reader.readNext()) != null) {
				
				Hospitals myHospital = new Hospitals();
			
				if (!isDigit(stringOfData[0]))
				{
					Hospitals titleHospital = new Hospitals();
					
					titleHospital.id = stringOfData[0];
					titleHospital.type = stringOfData[1];
					titleHospital.address = stringOfData[2];
					titleHospital.district = stringOfData[3];
					titleHospital.chief = stringOfData[4];
					titleHospital.phone = stringOfData[5];
					titleHospital.fax = stringOfData[6];
					titleHospital.opentime = stringOfData[7];
					titleHospital.name = stringOfData[8];
					request.setAttribute("titleHospital", titleHospital);
					continue;
					
				}
				
				int subNameLength = stringOfData[3].toString().length()-2;
				String districtSubName = stringOfData[3].toString().substring(0, subNameLength);
				if (district.toString().contains(districtSubName))
				{
					myHospital.id = stringOfData[0];
					myHospital.type = stringOfData[1];
					myHospital.address = stringOfData[2];
					myHospital.district = stringOfData[3];
					myHospital.chief = stringOfData[4];
					myHospital.phone = stringOfData[5];
					myHospital.fax = stringOfData[6];
					myHospital.opentime = stringOfData[7];
					myHospital.name = stringOfData[8];
					HospitalsList.add(myHospital);
					if (HospitalsList.size()==1)
						request.setAttribute("districtName", district);
						//если это первый правильный госпиталь, то задаем атрибут названи€ района
				}
				
			}
			reader.close();
			
			request.setAttribute("HospitalsList", HospitalsList);
			
			request.getRequestDispatcher("/WEB-INF/jsp/task7hospitals.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("errortext", "—ервлет не получил данные о районе!");
			request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
			return;
		}

		return;
	}
}