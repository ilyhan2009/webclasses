package homeworks.task5.people;


public class Policeman {
	public String name = "Unnamed";
	public int neededMoney = 20000;
	public boolean isFired = false;
	
	public void setName(String value) {
		this.name = value;
	}
	
	public void setNeededMoney(int value) {
		this.neededMoney = value;
	}
	
	public String getPolicemanInfo() {
		return ("Name: "+name+", is fired? -"+isFired+", needed money: "+neededMoney+".");
	}
	
	public void stopCarDriver(CarDriver carDriver){
		if (carDriver.protection)
			this.isFired = true;
		else
		{
			if(!carDriver.medicineChest)
			{
				if(carDriver.money>=1500){
					carDriver.money = carDriver.money-1500;
					this.neededMoney = this.neededMoney-1500;
				}
				else
					carDriver.penalty = true;
			}
			
			if(carDriver.toning > 60){
				if(carDriver.money>=800){
					carDriver.money = carDriver.money-800;
					this.neededMoney = this.neededMoney-800;
				}
				else
					carDriver.penalty = true;
			}
		}
	}
	
	public String isEnoughMoney(){
		if (this.neededMoney<=0)
			return ("Yes, we'll buy new TV! Got Extra "+Integer.toString(0-this.neededMoney)+"rub.");
		else
			return ("No, need "+Integer.toString(this.neededMoney)+"rub.");
	}
	
	

}
