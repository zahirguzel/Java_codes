import java.util.Scanner;
public class AtmProjesi {

	public static void main(String[] args) {
		int bakiye=1000,input,miktar;
		Scanner scan= new Scanner(System.in);
		System.out.println("Atmye hoş geldiniz"+"\ngüncel bakiyeniz:"+bakiye+"tl");
		while (bakiye>0) {
			
			System.out.println("\n1-Para yatır");
			System.out.println("2-Para çek");
			System.out.println("3-bakiye sorgula");
			System.out.println("4-çıkış yap");
			System.out.print("Yapmak istediğiniz işlemi seciniz:");
			input=scan.nextInt();
			if(input==1) {
				System.out.print("Yatırmak istediğniz tutar:");
				miktar= scan.nextInt();
				bakiye+=miktar;
			}
			else if(input==2) {
				System.out.print("Çekmek istediğniz tutar:");
				miktar=scan.nextInt();
				
				if(miktar>bakiye) {
					System.out.println("yetersiz bakiye!!!");
				}
				else {
					bakiye-=miktar;
				}
				}
				else if(input==3) {
					System.out.print("güncel bakiyeniz: "+ bakiye+"tl");
				}
				else if(input==4) {
					System.out.println("çıkış yapılıyor");
					break;
				}
				else {
					System.out.println("hatalı tuşlama yaptınız");
				}
				
			}
		}
		


	}


