package homeworks.task5.people;

public class CarDriver {
	public String name = "Unnamed";
	public boolean protection = false; // ���� �� �����
	public int money = 0;
	public int toning = 40; // ������� �������������� (�� 0 �� 100)
	public boolean medicineChest = true; // ���� �� �������
	public boolean penalty = false; // ����������
	
	public void setName(String value) {
		this.name = value;
	}
	
	public void setProtection(boolean value) {
		this.protection = value;
	}
	
	public void addMoney(int value) {
		this.money = this.money + value;
	}
	
	public void setToning(int value) {
		if ((value>=0)&&(value<=100))
			this.toning = value;
		else
			System.out.println("Incorrect \"toning\" value");
	}
	
	public void setMedicineChest(boolean value) {
		this.medicineChest = value;
	}
	
	public String getDriverInfo() {
		return ("Name: "+name+", protection: "+protection+", money: "+money+".\nToning: "+toning+"%, medicine chest: "+medicineChest+", penalty: "+penalty+".");
	}	
	

}
