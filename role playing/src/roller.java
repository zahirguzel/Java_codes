abstract class devamdurumu{
	public  abstract boolean devam();
	int devamsızlık;
} 
class sosyalsorumluluk extends devamdurumu{
	public  boolean devam() {
		if (devamsızlık>15)
		return true;
		else return false;
	}
	
	public void Devamsızlıktankalmadurumu() {
		if(devam()) System.out.println("sosyal sorumluk ogrencisi dersten kalde");
		else System.out.println("ssyal sorumluluk ögrencisi devamsılık hakkı var");
		
	}
}
class tamzamanlı extends devamdurumu{
	public  boolean devam() {
		if (devamsızlık>10)
		return true;
		else return false;
	}
	public void Devamsızlıktankalmadurumu() {
		if(devam()) System.out.println("tam zamanlı ogrencisi dersten kalde");
		else System.out.println("tam zamanlı  ögrencisi devamsılık hakkı var");
		
	}
	
}
class normalogrenci extends devamdurumu{
	public  boolean devam() {
		if (devamsızlık>8)
		return true;
		else return false;
	}
	
	public void Devamsızlıktankalmadurumu() {
		if(devam()) System.out.println("normal ogrencisi dersten kalde");
		else System.out.println("normal ögrencisi devamsılık hakkı var");
		
	}
}
	






abstract class egitim{
	public  abstract boolean mezuniyet(double  akts_ort);
	
	
}
class lisans extends egitim{
	@Override
	public boolean mezuniyet(double akts_ort) {
		if(akts_ort>2)
		return true;
		else return false;
	}
}

class ylisans extends egitim{
	@Override
	public boolean mezuniyet(double akts_ort) {
		if(akts_ort>2.5) {
		return true; 
		}
		else {
			return false;
		}
		
	}
}



// oluşturulan roller bir temel sınıfa aktarılmalıdır

class ogrenci{
	int ogrno;
	String ad;
	// roller için egitim clasından rollerden biri tanımlanacak
	egitim egitimseviyesirolu;
	devamdurumu devamrolu;
}


public class roller {

	public static void main(String[] args) {
		ogrenci  ogr1 =new ogrenci();	
		ogr1.devamrolu =new sosyalsorumluluk();
		ogr1.devamrolu.devamsızlık=13;
		System.out.println(ogr1.devamrolu.devam());
		ogr1.devamrolu =new tamzamanlı();
		ogr1.devamrolu.devamsızlık=13;
		System.out.println(ogr1.devamrolu.devam());
		
		ogr1.egitimseviyesirolu=new ylisans();
		System.out.println(ogr1.egitimseviyesirolu.mezuniyet(2.8));
		
		ogr1.egitimseviyesirolu=new lisans();		
		
		
		}

}
