
public class Hayvan { 
	public static double kilo=0 ,boy=0;
	public static String yasadıgıyer ="";
	// parametresiz kurucu kurucularda void kurucular değer dödürmez
	 Hayvan(){
		 System.out.println("hayvan sınıfın parametresiz kurucu tetiklendi");
	 }
	 Hayvan(double kilo){
		 this.kilo= kilo;
		 System.out.println("hayvan sınıfının parametreli kurucu tetiklendi");
	 }
	 public void Hayvan() {
		 System.out.println("Hayvan isminde fonksiyon çalıştırıldı");
		 // kurucu değildir
	 }
	 public void Beslenme() {
		 System.out.println("hayvan.beslenme fonksiyonu her hayvan beslenir");
		 
	 }
	 public static void Yasadıgıyer() {
		 System.out.println("hayvan.yasadıgıyer tetiklendi");
	 }
	 public void Solunum() {
		 System.out.println("hayvan.solunum fonksiyonu her hayvan beslenir,her hayvan solunum yapar");
		 
	 }
	 public void Ceneyapısı() {
		 System.out.println("hayvan.cene yapısıı fonksiyonu tetiklendi,her hayvanın çenesi vardır");
	 }
	 public void Goster() {
		 System.out.println("kilosu: " + this.kilo + "boyu: " + this.boy);
	 }
	 

}

class Etcil extends Hayvan{
	
	public Etcil() {
	System.out.println("etçil sınıfının parametresiz kurucu tetiklendi");
	}
	
	// kalıtıldığı sınıfta var olan fonksiyonun üzerine  bindirmek
	// yeni özellikle eklemek
	@Override
	public void Beslenme() {
		System.out.println("etçil.beslenme tetiklendi. etle beslenirler");
	}
	@Override
	 public void Ceneyapısı() {
		 System.out.println("etcil.cene yapısıı fonksiyonu tetiklendi,etcil hayavanların keskin dişleri gelişmiştir");
			 
	 }
	/*
	 * static tanımlı fonksiyonlar override edilemezler
	 * burarda normal fonksiyon gibi algılanır
	@Overrride
	 public static void Yasadıgıyer() {
		 System.out.println("hayvan.yasadıgıyer tetiklendi");
	 }
	 */
	public void  EtcilGöster() {
		super.Goster(); // en üst sınıfın ismininin yerini tutan özel tanımlamadır
	}
	
}
class Otcul extends Hayvan{
	
	public Otcul() {
	System.out.println("Otcul sınıfının parametresiz kurucu tetiklendi");
	}
	
	// kalıtıldığı sınıfta var olan fonksiyonun üzerine  bindirmek
	// yeni özellikle eklemek
	@Override
	public void Beslenme() {
		System.out.println("otcul.beslenme tetiklendi. otla beslenirler");
	}
	@Override
	 public void Ceneyapısı() {
		 System.out.println("otcul.cene yapısıı fonksiyonu tetiklendi,otcul hayavanların öğütücü dişleri gelişmiştir");
			 
	 }
}
class Kuslar extends Etcil {
	public Kuslar() {
		System.out.println("Etçilden türeyen kuşlar sınıfının kurucusu tetiklendi");
	}
	@Override 
	public void Beslenme() {
		System.out.println("kuşlar beslenme fonksiyonu çalıştırıldı.etcil kuşlar etle beslenir");
	}
	@Override 
	public void Ceneyapısı() {
		System.out.println("kuşlar ceneyapısı fonksiyonu çalıştırıldı.etcil kuşlar sivri gagalıdır");
		
	}
	public void  KuslarGöster() {
		super.Goster(); // en üst sınıfın ismininin yerini tutan özel tanımlamadır
	}
}




