class sifreler<T>{
	public T deger;
	String algoritma="";
	
	void cagir() {
		System.out.println(deger.getClass().getName());
	}
	
	void olustur(T parametre) {
		if (deger.getClass().getName()=="java.lang.Integer") {
			System.out.println("deger integer");
			
		}
		else if (deger.getClass().getName()=="java.lang.String"){
			System.out.println("deger string");
		}
		
	}
}
class sifrelemecomplex<T,G>{
	public T deger;
	public G algoritma;

	void olustur(T a) {
		if (deger.getClass().getName()=="java.lang.Integer") {
			System.out.println("deger integer");
			
		}
		else if (deger.getClass().getName()=="java.lang.String"){
			System.out.println("deger string");
		}
	
}
}
class kenditipim<M>{
	public M id;
}
class tipintipi<kenditipim>{
	public kenditipim degiskentipi;
} 
class tipintipinintipi<tipintipi>{
	 public tipintipi degiskentipitipi;
}


public class genericturler {

	public static void main(String[] args) {
		sifreler<String> a =new  sifreler<String>();
		a.deger="deneme";
		a.olustur("parametrem");
		
		sifreler<Integer> b=new  sifreler<Integer>();
		b.deger=5;
		b.olustur(55);
		
		sifrelemecomplex<Integer,String> c= new sifrelemecomplex<>()	 ;
		c.deger=10;
		c.algoritma="md5";
		
		sifreler<kenditipim<String>> d =new sifreler<>();
		tipintipi<kenditipim<Integer>> e =new tipintipi<>();
		tipintipinintipi<tipintipi<kenditipim<Integer>>> f =new tipintipinintipi<>();
	
		

	}

}
