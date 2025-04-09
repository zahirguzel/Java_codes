
public class EYT {
  int yaş;
  int sgkGiris;
  Emeklilik emeklilikRolu;
  Ucret ucretRolu;
 
  EYT(int yaş,int sgkGiris){
	  this.yaş=yaş;
	  this.sgkGiris=sgkGiris;
  }
  EYT(){
	  this.yaş=0;
	  this.sgkGiris=0;
  }
  public int getsgkGiris() {
	  return sgkGiris;
  }
}
abstract class Emeklilik extends EYT{
	public int getsgkGiris() {
		  return sgkGiris;
	  }
	public abstract boolean sorgula(int CalismaSuresi,String Meslek);
	
}
class kadınemekli extends Emeklilik{
	public int getsgkGiris() {
		  return sgkGiris;
	  }
	public boolean sorgula(int CalismaSuresi, String Meslek) {
		if(Meslek=="4A")
			CalismaSuresi+=CalismaSuresi*(15/100);
		return CalismaSuresi>5000 && ((2025-getsgkGiris())>20);
	}
}
class erkekemekli extends EYT{
	public int getsgkGiris() {
		  return sgkGiris;
	  }
    public boolean sorgula(int CalismaSuresi,String Meslek) {
    	if(Meslek=="4A")
    		CalismaSuresi+=CalismaSuresi*(2/10);
    	else if(Meslek=="4B"||Meslek=="4C")
    		CalismaSuresi+=CalismaSuresi*(7/100);
    	return CalismaSuresi>5500 && ((2025-getsgkGiris())>25);
    }
}
abstract class Ucret extends EYT{
	int primGunu;
	double primTL;
	abstract double setMaas(double primGunu,double primTL);
	
}
class isci extends Ucret{
	double setMaas(double primGunu,double primTL) {
		if(primGunu>5550 && primGunu<6000) {
			primTL=5500+(primTL*0.11);
			return primTL;
		}
		else if(primGunu>6050&& primGunu<7500) {
			primTL=6750+(primTL*0.11);
			return primTL;
		}
		else {
			primTL=0;
		}
		return primTL;
	}
	
}
class memur extends Ucret{
	double setMaas(double primGunu,double primTL) {
		if(primGunu>5572 && primGunu<6040) {
			primTL=7500-(primTL*0.03);
		}
		else if(primGunu>6292&& primGunu<7600) {
			primTL=8300-(primTL*0.06);
		}
		else
			System.out.println("Prim yok");
		return primTL;
	}
}

