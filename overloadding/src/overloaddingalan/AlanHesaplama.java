package overloaddingalan;

import java.util.Scanner;

public class AlanHesaplama {
 public static double alan(double yaricap) {
	 return  Math.PI * Math.pow(yaricap, 2); 
 }
 public static double alan(double kenar1 ,double kenar2) {
	 return kenar1*kenar2;
 }
 public static double alan (double taban,double yükseklik,boolean ücgen ) {
	 if(!ücgen) {
		 throw new IllegalArgumentException("Bu metot sadece ücgenin alanını hesaplar");
		 }
	 return taban*yükseklik*0.5;
 }
 
	public static void main(String[] args) {
		double dairealan = alan(5.0);
		System.out.println("dairenin alanı: "+ dairealan);
		
		double dörtgenalan = alan(4.0,5.0);
		System.out.println("dörtgenin alanı: "+ dörtgenalan);
		double ücgenalan = alan(10.0,8.0,true);
		System.out.println("ücgenin alanı: "+ ücgenalan);
		System.out.println("-----------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Hnagisinin alanını almak istiyorsunuz?");
		System.out.println("1- Daire");
		System.out.println("2-ücgen");
		System.out.println("3- Dörtgen");
		int secim = scan.nextInt();
		switch(secim) {
		case 1: 
			System.out.println("Dairenin yarıçapını giriniz");
			double yaricap  = scan.nextDouble();
			double sonuc= alan(yaricap);
			System.out.println("dairenin yarıçapı: "+ sonuc);
			break;
		case 2: 
			System.out.println("Tabanı giriniz: ");
			double taban = scan.nextDouble();
			System.out.println("Yüksekliği giriniz: ");
			double yükseklik = scan.nextDouble();
			double sonuc1 = alan(taban,yükseklik,true);
			System.out.println("ücgenin alanı: "+ sonuc1);
			break;
		case 3:
			System.out.println("kenar 1 i giriniz: ");
			double kenar1 = scan.nextDouble();
			System.out.println("kenar 2 yi giriniz");
			double kenar2 = scan.nextDouble();
			double sonuc3 = alan(kenar1,kenar2);
			System.out.println("Dörtgenin alanı: " + sonuc3);
			break;
			default: 
				System.out.println("Geçersiz işlem!!!");
		}

	}

}
