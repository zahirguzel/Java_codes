import java.util.Scanner;

public class ÜsAlma {

	public static double usAlma(int taban, int üs) {
		if(üs==1) {
			return 1;
		}else {
		return  Math.pow(taban, üs);} 
		// return taban*üsAlma(taban,üs-1);  recursive(özyinelemeli)
	}
	static int sc(int x) {
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		return x;
	}
		
	
	
	public static void main(String[] args) { 
		int taban =0;
		int üs=0;
		double result=1;
		System.out.println("taban giriniz: ");
		taban = sc(taban);
	System.out.println("üs giriniz: ");
	üs =sc(üs);
	result = usAlma(taban,üs);
	System.out.println("sonuc: " + result);
	}

}
