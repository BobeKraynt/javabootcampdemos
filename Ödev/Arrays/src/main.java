
public class main {

	public static void main(String[] args) {
		String[] sınıf = new String[4 ];
		sınıf[0] = "Engin";
		sınıf[1] = "Derin";
		sınıf[2] = "Salih";
		sınıf[3] = "Ahmet";
	
	// Klasik for döngüsü	
	for (int i = 0; i < sınıf.length; i++) {
			System.out.println(sınıf[i]);
		}
	
	System.out.println("-----");
	
	// Sık kullanılan yöntem
	for (String ogrenci:sınıf) {
		System.out.println(ogrenci);
		}
		
	}

}
