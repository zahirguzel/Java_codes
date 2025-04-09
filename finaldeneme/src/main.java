
public class main {

	public static void main(String[] args) {
		EYT insan =new EYT(20, 2020);
		insan.EmeklilikRolu=new kadınemekli();
		
		
		System.out.println("Kadın emekli durrumu;  " + insan.EmeklilikRolu.emekliolabilir(5500, "4A"));
		EYT insan2 =new EYT();
		insan2.UcretRolu=new memur();
		insan2.UcretRolu.setMaas(5500);
		System.out.println("memurun primli maası " +insan2.UcretRolu.setMaas(5600) );

	}

}
