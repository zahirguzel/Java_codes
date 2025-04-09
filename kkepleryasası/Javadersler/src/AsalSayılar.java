import java.util.Scanner;

public class AsalSayılar {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int sayi;
		boolean asal = true ;
		do {
			System.out.print("sayı giriniz: ");
			sayi=input.nextInt();
			
		}
		while(sayi<2);
		for(int i=2;i<sayi;i++) {
			if(sayi %i ==0) {
				asal=false;
				break;
				
			}
			
			
		}if(asal) {
			System.out.println("girilen sayı asal sayıdır");
		}else {
			System.out.println("asal değildir");
		}

	}

}
