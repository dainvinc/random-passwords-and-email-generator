public class CreditCardPayback {
    private double FIRSTPAYBACK = 0.25/100;
    private double SECONDPAYBACK = 0.5/100;
    private double THIRDPAYBACK = 0.75/100;
    private double LASTPAYBACK = 1.0/100;
    
    
    public double calculatePayback(double c) {
        int charges = (int) c;
        double payback = 0;
        
        if(charges > 0 || charges < 500) {
            if(charges/500 >= 1)
                payback = FIRSTPAYBACK * 500;
            else 
                payback += FIRSTPAYBACK * charges;
                
            charges -= 500;
            System.out.println("Charges: "+charges);
            System.out.println("The payback for 500 = "+payback);
        } 
        
        if(charges > 0) {
            if(charges/1000 >= 1) {
                payback += SECONDPAYBACK * 1000;
            } else
            payback += SECONDPAYBACK * charges;
            
                
            charges -= 1000;
            System.out.println("Charges: "+charges);
            System.out.println("The payback for 1000 = "+payback);
        }
        
        if(charges > 0) {
            if(charges/1000 >= 1) {
                payback += THIRDPAYBACK * 1000;
            }
            else 
                payback += THIRDPAYBACK * charges;
            charges -= 1000;
            System.out.println("Charges: "+charges);
            System.out.println("The payback for next 1000= "+payback);
        }
        
        if(charges > 0) {
            payback += LASTPAYBACK * charges;    
        } 
            
        return payback;
    }
    
    public static void main(String[] args) {
        CreditCardPayback c = new CreditCardPayback();
        
        System.out.println("The Total payback = " +c.calculatePayback(400));
    }
}