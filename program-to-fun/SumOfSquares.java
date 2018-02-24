public class SumOfSquares {
	private int sum = 0;
	private int squaresSum = 0;
	
	public int sumNumbers(int[] numbers) {	
		for(int num: numbers) {
			sum += num*num;
		}
		
		System.out.println("The Sum of Squares is: "+sum);
		sumSquares(sum);
		return sum;
	}
	
	public int sumSquares(int sum) {
		squaresSum  = sum*sum;
		System.out.println("The Total Sum is: "+squaresSum);
		return squaresSum;
	}
	
	public int diffOfSumOfSquares() {
		int diffSum = squaresSum - sum;
		
		System.out.println("The difference is: "+diffSum);
		
		return diffSum;
	}
	
	public static void main(String[] args) {
		SumOfSquares s = new SumOfSquares();
		int[] arr = {3,2,1};
		
		s.sumNumbers(arr);
		s.diffOfSumOfSquares();
	}
}
