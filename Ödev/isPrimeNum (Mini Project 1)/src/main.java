
public class main {

	public static void main(String[] args) {
		int number = 67;
		boolean isPrime = true;
		
		if (number < 1 ) {
			System.out.println("Invalid Number");
			return;
		} else if (number == 1) {
			System.out.println("The number is not prime");
			return;
		} 
		
		
		for (int i = 2; i < number; i++) {
			int remainder = number % i;	
		
			if (remainder == 0) {
				isPrime = false;
			}
		}
		if (isPrime == false) {
			System.out.println("The number is not prime.");
		} else {
			System.out.println("The number is prime.");
		}
		
		
	}	
}
