
public interface BasitInterface {
	final int a = 10;

	// abstract fonksiyon
	void goruntule();

	int degergetir(int a, double b);

	double degerler();
	// ınterfacede final tanımlama yapılamaz
	// final double deneme();
	// ınterfacede static tanımlı fonksiyon kullanılmaz
	// static double deneme2();
	// interfacede abstract tanımlama dışında fonksiyon tanımı yapılamaz
	/*
	 * public String deneme3(){ system.out.println("deneme"); return ""; }
	 * 
	 */

}

interface BasitInterface2 {
	int durum1();

	double durum2(double a);

	// ınterfacede doğrudan nese türetilmez dolayısıyla class türetilerek
	// gerçekleştirilir
}

class testınterface implements BasitInterface {
	@Override
	public void goruntule() {
		System.out.println("goruntule fonksiyonu tetiklendi");

	}

	@Override
	public int degergetir(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double degerler() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class testınterface2 implements BasitInterface, BasitInterface2 {
	@Override
	public void goruntule() {
		System.out.println("goruntule fonksiyonu tetiklendi");

	}

	@Override
	public int degergetir(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double degerler() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int durum1() {
		return 0;
	}

	@Override
	public double durum2(double a) {
		return 0;
	}

}
