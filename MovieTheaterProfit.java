public class MovieTheaterProfit {
    public double calculateTotalProfit(int count) {
        double profit;
        
        profit = count*5 - 20 - count*.5;
        
        return profit;
    }
    
    public static void main(String[] args) {
        MovieTheaterProfit show = new MovieTheaterProfit();
        
        System.out.println("Total profit is: " +show.calculateTotalProfit(10));
    }
}