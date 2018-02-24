public class IncomeTaxCalculator {
	public double calculateTax(double grossPay) {
		return grossPay*0.15;
	}
	
	public double calculateNetPay(double numOfHours) {
		return numOfHours*12;
	}
	
	public static void main(String[] args) {
		IncomeTaxCalculator tax = new IncomeTaxCalculator();
		
		System.out.println("Income tax is: $"+tax.calculateTax(480));	
		System.out.println("Net Pay is: $"+tax.calculateNetPay(40));	
	}
}