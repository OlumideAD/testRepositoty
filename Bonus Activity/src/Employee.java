
public class Employee {

	String name;
	double totalPay, hours;
	final double hourlyRate = 15.0;
	final double overtimeHours = 16.5; 
	
	public Employee(String name, double hours){
		
		this.name = name;
		this.hours = hours;
	}
		
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHours() {
		return hours;
	}

	public double getTotalPay() {
		double pay = 0.0;
		if(hours  <= 40 ) {
			 pay = (hourlyRate + overtimeHours)*hours;
		}else {
			pay = hourlyRate * hours;
		}
		return pay;
	}

	public void setTotalPay(double totalPay) {
		totalPay =  getTotalPay();
		//this.totalPay = totalPay;
		
	}
	
	
	
}
