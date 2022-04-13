import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPay() {
		//fail("Not yet implemented");
		
		Employee obj = new Employee("John", 20);
		Employee obj2 = new Employee("John", 50);
		
		assertEquals(630.0, obj.getTotalPay(),0.01,"The expected and actual are not the same");
		assertEquals(750.0, obj2.getTotalPay(),0.01,"The expected and actual are not the same");
		
	}

}
