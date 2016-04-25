package homeworks.task4;

import java.util.Scanner;

public class Task4Servlet {
	
	public static String description = "This is unofficial BRICS site.";
	public static String descriptionCommand = "-d";
	public static String descriptionText = "Breaf site info";

	public static String askCountry = "What is requested country's first letter? ";
	public static String countryText = "Getting some info about requested country";
	public static String countryCommand = "-c";
	public static String sayB = "�������� � 7-� ��������� ���� �� �������� ���, ������ �������������������� ����������, ������ � ��������� ������� ������.";
	public static String sayR = "������ � 6-� ��������� ���� �� �������� ���, ���������� ������ ����������� ��������, ����� ���������� � ���� ����������, ������� �������, ���� �� ���� ���������� � ���� ������� �����������, �������������� ������������, ���� �� ������� ����� �����������.";
	public static String sayI = "����� � 3-� ��������� ���� �� �������� ���, ������� ���������������� �������, ���� �� ���� ����� � ����� ��� ����������� ����������, ������� �������, ������ � ��������� ������� ������.";
	public static String sayC = "����� � 1-� ��������� ���� �� �������� ��� � 1-� � ���� �������� (�������� �������), ���������� ���������� � ���� �������� ��������, ����� ���������� � ���� ���������, ������� �������, ������� �������, ���� �� ���� ������������� ����������� �������.";
	public static String sayS = "����-����������� ���������� � 25-��29-� ��������� ���� �� �������� ���, ������������� ��������� �������, ������� ����������� ������������ �������.";
	
	public static String allCommand = "-all";
	public static String allText = "All commands";
	
	public static String myLetter;
	
	public static String[][] commands;
	
	public static Scanner in = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		createAllCommands();
		
		
		if(args.length !=0) {
			
			if(args[0].equals(descriptionCommand)) {
				
				getDescription();
				
			} else if (args[0].equals(countryCommand)) {
				
				getCountryInfo();
				
			} else if(args[0].equals(allCommand)) {
				
				all();
				
			} 
		}
	}


	private static void createAllCommands() {

		commands = new String[3][2];
		
		commands[0][0] = descriptionCommand;
		commands[0][1] = descriptionText;
		
		commands[1][0] =countryCommand;
		commands[1][1] = countryText;
		
		commands[2][0] = allCommand;
		commands[2][1] = allText;
		
	}


	private static void all() {
		
		System.out.println(allText);
		
		for(String[] s : commands) {
			System.out.println(s[0] + ": "+s[1]);
		}
		
//		for(int i=0; i<commands.length;i++) {
//			System.out.println(commands[i][0] + ": "+commands[i][1]);
//		}
//		
	}
	
	private static void getCountryInfo() {
		
		Boolean key = true;
		while(key) {
			System.out.print(askCountry);
			myLetter  = in.next();
			switch (myLetter.toLowerCase()) { 
				case "b": System.out.println(sayB); key=false; break; 
				case "r": System.out.println(sayR); key=false; break; 
				case "i": System.out.println(sayI); key=false; break;
				case "c": System.out.println(sayC); key=false; break;
				case "s": System.out.println(sayS); key=false; break; 
				default: System.out.println("Try again.."); break; 
			}
		}
	}
	
	private static void getDescription() {
		System.out.println("Description: "+description);
	}

}
