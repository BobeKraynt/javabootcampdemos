
public class main {

	public static void main(String[] args) {
		int sayi1 = 1;
		int sayi2 = 25;
		int sayi3 = 8;
		
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		} else if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En Büyük: " + enBuyuk);
	}
	

}
