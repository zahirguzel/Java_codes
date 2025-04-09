import java.util.Scanner;

public class ÜslüSayi {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.print("sayı giriniz:");
	int sayi1 ,sayi2 ,sonuc=1;
	sayi1=input.nextInt();
	System.out.print("üssü giriniz");
	sayi2=input.nextInt();
	for(int i = 1;i<=sayi2;i++) {
		sonuc = sonuc *sayi1;
	}
	System.out.println("sonuc "+sonuc);
	
	}

}
