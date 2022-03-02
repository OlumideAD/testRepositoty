//Olumide Adeosun  - 300346122

import java.util.Scanner;

public class PurchaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("************* Payment Invoice Application**************");
		
		int invoiceNumber = userInputOne();
		int salesAmount = userInputTwo();
		
		Purchase obj1 = new Purchase(invoiceNumber, salesAmount);
		
		obj1.display();
	}
	
	//Input Methods
	
	public static int userInputOne() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Invoice Number: ");
		int invoiceNumber = input.nextInt();	
		
		while(!validateOne(invoiceNumber)) {
			System.out.println("Invalid Entry! \nInvoice Number MUST be between the range of 1,000 - 8,000");
			System.out.print("\nEnter Invoice Number(Try again): ");
			invoiceNumber = input.nextInt();
			if(validateOne(invoiceNumber)) {
				break;
			}
			
		}
		return invoiceNumber;
	}
	
	public static int userInputTwo() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Sales Amount: ");
		int salesAmount = input.nextInt();	
		
		
		while(!validateTwo(salesAmount)) {
			System.out.println("Invalid Entry! \nSales Amount must be a non-negative value");
			System.out.print("\nEnter Sales Amount (Try again): ");
			salesAmount = input.nextInt();
			if(validateTwo(salesAmount)) {
				break;
			}
			
		}
		return salesAmount;
	}
	
	//Validation methods
	
	public static boolean validateOne(int num) {
		
		if (num >= 1000 && num <= 8000) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean validateTwo(int num) {
		
		if(num >= 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
