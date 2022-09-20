
public class main {

	public static void main(String[] args) {
		int number = 6;
		int sum = 0;
		
		
		for (int i = 1; i < number; i++) {
			int remainder = number % i;
			
			if (remainder == 0) {
				sum += i;	
			}
		}
		
		if (sum == number) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a perfect number");
		}
	}

}
