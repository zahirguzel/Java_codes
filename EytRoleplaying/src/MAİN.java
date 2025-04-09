
public class MAİN {

	public static void main(String[] args) {

		EYT insan =new EYT(2000);
		insan.EmeklilikRolu=new kadınemekli(insan.sgkyil);
		
		System.out.println("Kadın emekli durrumu;  " + insan.EmeklilikRolu.emekliolabilir(5500, "4A"));
		EYT erkek=new EYT(1990);
		erkek.EmeklilikRolu=new erkekemekli(erkek.sgkyil);
		System.out.println("erkek emekli durumu " +erkek.EmeklilikRolu.emekliolabilir(5600, "4A"));
		
		
	
		EYT insan2 =new EYT();
		EYT insan3 =new EYT();
		insan2.UcretRolu=new memur();
		
		System.out.println("memurun primli maası " +insan2.UcretRolu.setMaas(5600) );
		insan3.UcretRolu=new ıscı();
		System.out.println("isci primli maası " +insan3.UcretRolu.setMaas(5700));
		
	

	}
}
