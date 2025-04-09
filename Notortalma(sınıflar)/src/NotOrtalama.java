import java.util.Scanner;

public class NotOrtalama {

	public static void main(String[] args) {
	int [] notlar =notlariAl();
		double ortalama =ortalama(notlar);
		System.out.println("ortalamanız: " + ortalama);

	}
	public static int[] notlariAl() {
		Scanner scan =new Scanner(System.in);
		int[] notlar=new int[7];
		String[] dersler ={"Matematik", "Türkçe", "Fizik", "Tarih", "Kimya", "Beden", "Müzik"};
		System.out.println("hoş geldiniz notları sırasıyla giriniz");
		for(int i =0;i<notlar.length;i++) {
			System.out.print(dersler[i]+":");
			notlar[i]= scan.nextInt();
			
		}
		return notlar;
	}
	public static double ortalama(int [] notlar) {
		double toplam=0 ;
		for(int not:notlar) {
			toplam+=not;
			
		}
		return toplam/notlar.length;
	}
	

}
