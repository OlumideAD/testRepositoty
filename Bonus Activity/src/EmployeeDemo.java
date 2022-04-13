
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj = new Employee("John", 20);
		Employee obj2 = new Employee("John", 50);
		
		double pay =  obj.getTotalPay();
		double pay2 =  obj2.getTotalPay();
		System.out.println(pay);
		System.out.println(pay2);
		
	}

}
