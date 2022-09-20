
public class main {

	public static void main(String[] args) {
		int number1 = 17296;
		int number2 = 18416;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				sum1 += i;
			}
		}
		for (int x = 1; x < number2; x++) {
			if (number2 % x == 0) {
				sum2 += x;
			}
		}
		if (sum1 == number2 && sum2 == number1) {
			System.out.println("Friendly Numbers");
		} else if (number1 == number2) {
			System.out.println("Numbers must be different");
		} else {
			System.out.println("Not Friendly Numbers");
		}
	}
}
