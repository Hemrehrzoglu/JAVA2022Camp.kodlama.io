
public class diziler {

	public static void main(String[] args) { 
		
		String ogrenci1 = "Emre";
		String ogrenci2= "ALİ";
		String ogrenci3 = "Metin";
		String ogrenci4 = "Feyyaz";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("------------");
		
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]= "EMRE";
		ogrenciler[1]= "ALİ";
	    ogrenciler[2]= "Metin"	;
	    ogrenciler[3]= "Feyyaz";

	    for(int i=0;i<ogrenciler.length;i++) {
	    	System.out.println(ogrenciler[i]);
	    	
			System.out.println("------------");
			
	    for(String ogrenci: ogrenciler) {
	    	System.out.println(ogrenci);
	    	
	    }

	    }
	}

}
