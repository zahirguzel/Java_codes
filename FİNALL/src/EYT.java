  abstract class Emeklilik{
	public int calısmasüresi ;
	public String meslek;
	public Emeklilik(int calısmasüresi , String meslek) {
		this.calısmasüresi=calısmasüresi;
		this.meslek=meslek;
	}
	public abstract  boolean emekliolabilir(int sgk_girisyili);
}
class kadınemekli extends Emeklilik{
	public kadınemekli(int calısmasüresi, String meslek) {
		super(calısmasüresi, meslek);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean emekliolabilir(int sgk_girisyili) {
	if(meslek=="4A") {
		calısmasüresi+=calısmasüresi*0.15;
	}
		return calısmasüresi>5000 && (2025-sgk_girisyili>20);
	}
}

class erkekemekli extends Emeklilik{
	public erkekemekli(int calısmasüresi, String meslek) {
		super(calısmasüresi, meslek);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean emekliolabilir(int sgk_girisyili) {
		if(meslek == "4A") {
			calısmasüresi+=calısmasüresi*0.2;
		}
		else if (meslek =="4B" ||meslek=="4B") {
			calısmasüresi+=calısmasüresi*0.07;
		}
		return calısmasüresi>5500 && (2025-sgk_girisyili>25);
	}
}
abstract class Ucret{
	int  primgünü;
	double primtl;
	public Ucret(int primgünü ) {
		this.primgünü=primgünü;
		
	}
	
	abstract  double setMaas();
	
}

class ıscı extends Ucret{

	public ıscı(int primgünü, int primtl) {
		super(primgünü);
	}

	@Override
	double setMaas() {
		if(primgünü>5550 && primgünü<6000) {
			primtl=5500+(5500*0.11);
		}
		else if(primgünü>6050&& primgünü<7500) {
			primtl=6750+(6750*0.11);
		}
		
	
		return primtl;
	}	
}
class memur extends Ucret{

	public memur(int primgünü, int primtl) {
		super(primgünü);
	}

	@Override
	double setMaas() {
		if(primgünü>5572 && primgünü<6040) {
			primtl=7500-(7500*0.03);
		}
		else if(primgünü>6292&& primgünü<7600) {
			primtl=8300-(8300*0.06);
		}
		
	
		return primtl;
	}	
}



public class EYT { 
	Ucret UcretRolu;
	Emeklilik EmeklilikRolu;
	int yas;
	int sgkyil;
	 
	  

}
