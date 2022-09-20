import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		String harf = "Ü";
		
		// Case Insensitive Yöntem
//		String[] kalınHarfler = {"A", "I", "O", "U"};
//		String[] inceHarfler = {"E", "İ", "Ö", "Ü"};
//	
//		if (Arrays.asList(kalınHarfler).contains(harf.toUpperCase())) {
//			System.out.println("Kalın Harf");
//		} else if (Arrays.asList(inceHarfler).contains(harf.toUpperCase())) {
//			System.out.println("İnce Harf");
//		} else {
//			System.out.println("Lütfen sesli harf giriniz.");
//		}
		
		switch (harf) {
			case "A":
			case "I":
			case "O":
			case "U":
				System.out.println("Kalın Harf");
				break;
			case "E":
			case "İ":
			case "Ö":
			case "Ü":
				System.out.println("İnce Harf");
				break;
			default:
				System.out.println("Lütfen sesli harf giriniz.");
		}
	}
}
