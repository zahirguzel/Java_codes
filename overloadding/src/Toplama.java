import java.util.Scanner;

public class Toplama {

	public static int sum(int x,int y) {
		return x+y;
	}
	public static int sum(int x , int y, int z ) {
		int result =0;
		result=x+y+z;
		
		return result;
	}
	public static double sum(double x , double  y) {
		double result =0;
		result = x+y;
		return result;
	}
	static int sc(int x) {
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		return x;
	}
	static double sc (double y) {
		Scanner scan = new Scanner(System.in);
		y= scan.nextDouble();
		return y;
	}
	public static void main(String[] args) {
		int x =0 ;
		int y=0;
		int z=0;
		double d=0;
		double e=0;
		System.out.println("birinci sayı giriniz ");
		x = sc(x);
		System.out.println("ikinci sayı giriniz ");
		y=sc(x);
		System.out.println(sum(x,y));
		System.out.println("--------------------------");
		System.out.println("3 sayı giriniz ");
		x = sc(x);
		y=sc(y);
		z=sc(z);
		System.out.println(sum(x,y,z));
		System.out.println("--------------------------");
		System.out.println("iki ondalıklı sayı giriniz");
		d =sc(d);
		e=sc(e);
		System.out.println(sum(d,e));
	}

}
