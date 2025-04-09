import java.util.Scanner;

public class TEKCİFT {

	public static void main(String[] args) {
		System.out.println("tek mi cift mi?");
		Scanner scan =new Scanner(System.in); 
		System.out.println("Kaç sayı girmek istiyorsunuz");
		int dizilenght =scan.nextInt();
		int[] sayilar = new int[dizilenght];
		for(int i =0;i<sayilar.length;i++) {
			sayilar[i] = scan.nextInt()	;
			scan.nextLine();
			}
   for(int değer:sayilar) {
	   tekmiciftmi(değer);
   }
   
	}
	public static void tekmiciftmi(int sayi) {
		if (sayi%2==0) System.out.println( sayi +"sayı çifttir");
		else System.out.println( sayi + "sayı tektir");
		
		
	}

}
