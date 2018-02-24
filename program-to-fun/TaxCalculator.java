public class TaxCalculator {
	public double calculateTax(double grossPay) {
		double roi = 0.0;

		if(grossPay > 240 && grossPay <= 480) 
			roi = 0.15;
		else if(grossPay > 480)
			roi = 0.28;
		
		return grossPay*roi;  
	}
		
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator();
		
		System.out.println("Total Tax Owed is: " +tax.calculateTax(680));
	}
}