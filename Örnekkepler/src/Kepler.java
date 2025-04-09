import java.util.Scanner;

public class Kepler {
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
	
return	Math.sqrt(1-Math.pow(b/a, 2));

	
}
public double Polar () {
	double e  =Eksentri();
	return a*(1-Math.pow(e,2)) / 1+(e*Math.cos(Math.toRadians(q)));
	
	
}
 static double sc(double x) {
	 Scanner scan=new Scanner(System.in);
	 x = scan.nextDouble();
	 return x;
 }

	public static void main(String[] args) {
		double a=0;
		double b=0;
		double q=0;
		double result=0;
		System.out.print("Büyük açıyı giriniz: ");
	    a =sc(a);
       System.out.print("kücük açıyı giriniz: ");
        b=sc(b);
        System.out.print("Açıyı giriniz: ");
        q=sc(q);
         Kepler kepler = new Kepler(a,b,q) ;
         result=kepler.Polar();
         System.out.print("Gezegenin yörüngedeki mesafesi: "+ result);
	}

}
