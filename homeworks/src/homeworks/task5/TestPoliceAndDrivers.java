package homeworks.task5;

import homeworks.task5.people.*;

public class TestPoliceAndDrivers {

	public static void main(String[] args) {
		CarDriver carDriver1 = new CarDriver();
		carDriver1.setName("Ilya");
		carDriver1.addMoney(2301);
		carDriver1.setMedicineChest(false);
		
		CarDriver carDriver2 = new CarDriver();
		carDriver2.setProtection(true);
		
		Policeman policeman1 = new Policeman();
		policeman1.setNeededMoney(1400);
		
		Policeman policeman2 = new Policeman();
		policeman2.setName("Ivan");
		
		System.out.println();
		System.out.println(carDriver1.getDriverInfo());
		System.out.println(carDriver2.getDriverInfo());
		System.out.println(policeman1.getPolicemanInfo());
		System.out.println(policeman1.isEnoughMoney());
		System.out.println(policeman2.getPolicemanInfo());
		
		policeman1.stopCarDriver(carDriver1);
		
		System.out.println();
		System.out.println(carDriver1.getDriverInfo());
		System.out.println(policeman1.getPolicemanInfo());
		System.out.println(policeman1.isEnoughMoney());
		
		carDriver1.setToning(80);
		carDriver1.setMedicineChest(true);
		
		policeman1.stopCarDriver(carDriver1);
		
		System.out.println();
		System.out.println(carDriver1.getDriverInfo());
		System.out.println(policeman1.getPolicemanInfo());
		System.out.println(policeman1.isEnoughMoney());
		
		//carDriver1.setToning(80);
		carDriver1.setMedicineChest(false);
		
		policeman1.stopCarDriver(carDriver1);
		
		System.out.println();
		System.out.println(carDriver1.getDriverInfo());
		System.out.println(policeman1.getPolicemanInfo());
		System.out.println(policeman1.isEnoughMoney());
		
		policeman1.stopCarDriver(carDriver2);
		
		System.out.println();
		System.out.println(policeman1.getPolicemanInfo());
		System.out.println(policeman1.isEnoughMoney());
	}

}