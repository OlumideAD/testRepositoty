//Olumide Adeosun  - 300346122

public class Purchase {

	//Data fields
	private int invoiceNumer, amountOfSale;
	private double salesTax;
	
	//Set Methods
	
	public void setAmountOfSale(int amountOfSale) {
		this.amountOfSale = amountOfSale;
		salesTax = 0.05 * amountOfSale;
	}
	
	public void setInvoiceNumer(int invoiceNumer) {
		this.invoiceNumer = invoiceNumer;
	}

	//Display method
	public void display() {
		System.out.println("\nInvoice number is: "+getInvoiceNumer());
		System.out.println("Total Item Purchased is: $"+getAmountOfSale());
		System.out.println("Sales Tax is: $"+getSalesTax());
	}
	
	//Get Methods
	
	public int getInvoiceNumer() {
		return invoiceNumer;
	}

	public int getAmountOfSale() {
		return amountOfSale;
	}
	
	public double getSalesTax() {
		return salesTax;
	}

	//Constructors
	public Purchase(int InvoiceNumber, int AmountOfSales) {
		setInvoiceNumer(InvoiceNumber);	
		setAmountOfSale(AmountOfSales);
	}
			

	
}
