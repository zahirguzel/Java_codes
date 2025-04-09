import java.util.Scanner;

class Kepler{
	public double a,b,q;
	
	Kepler(){
		this.a=0;
		this.b=0;
		this.q=0;
	}
	public Kepler(double a,double b,double q) {
		
		this.a=a;
		this.b=b;
		this.q=q;
		
	}
	
	public double Eksentri() {
		
	return	Math.sqrt(1-(Math.pow(b/a, 2)));
	
		
	}
	public double Polar () {
		double e  =Eksentri();
		return a*(1-Math.pow(e,2)) / 1+(e*Math.cos(q));
		
		
	}
	 static double sc(double x) {
		 Scanner scan=new Scanner(System.in);
		 x = scan.nextDouble();
		 return x;
	 }
	 
	
}


public class Kepleryasasi {

	public static void main(String[] args) {
		
		System.out.print("Büyük yarı çapı giriniz");
		double  a =sc(a);
		
Kepler nesne = new Kepler();

	}

}
