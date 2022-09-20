import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int[] sayılar = new int[] {1, 2, 5, 7, 9, 0};
		int aranacak = 10;
		boolean varMı = false;
		
		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMı = true;
				break;
			}
		}	
		if (varMı == true) {
			System.out.println("Sayı mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}
	}
}