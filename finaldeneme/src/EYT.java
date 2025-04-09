
public class EYT {
	Ucret UcretRolu;
	Emeklilik EmeklilikRolu;
	int yas;
	int sgkyil;
	
	EYT (int yas,int sgkyil) {
		this.yas=yas;
		this.sgkyil=sgkyil;
				
	}
	EYT(){
		this.yas=0;
		this.sgkyil=0;
	
	}
	

}


abstract class Emeklilik extends EYT{
	public int calısmasüresi ;
	public String meslek;
	
	public abstract  boolean emekliolabilir(int calısmasüresi,String meslek);
}
class kadınemekli extends Emeklilik{
	

	@Override
	public boolean emekliolabilir(int calısmasüresi ,String meslek) {
	if(meslek=="4A") {
		calısmasüresi+=calısmasüresi*0.15;
	}
		return calısmasüresi>5000 && ((2025-sgkyil)>20);
	}
}

class erkekemekli extends Emeklilik{
	

	@Override
	public boolean emekliolabilir(int calısmasüresi,String meslek) {
		if(meslek == "4A") {
			calısmasüresi+=calısmasüresi*0.2;
		}
		else if (meslek =="4B" ||meslek=="4B") {
			calısmasüresi+=calısmasüresi*0.07;
		}
		return calısmasüresi>5500 && ((2025-sgkyil)>25);
	}
}
abstract class Ucret{
	int  primgünü;
	double primtl;
	
	
	abstract  double setMaas(double primgünü);
	
}

class ıscı extends Ucret{

	

	@Override
	double setMaas(double primgünü) {
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

	

	@Override
	double setMaas(double primgünü) {
		if(primgünü>5572 && primgünü<6040) {
			primtl=7500-(7500*0.03);
		}
		else if(primgünü>6292&& primgünü<7600) {
			primtl=8300-(8300*0.06);
		}
		
	
		return primtl;
	}	
}
