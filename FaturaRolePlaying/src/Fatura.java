
public class Fatura {
	int uniqueID;
	double odemetutar;
	Platform PlatformRolu;
	ChatBot ChatBotRolu;
	public void ekleBordro(int fiyat[]) {}
	Fatura(int uniqueID){
		this.uniqueID=uniqueID;
	}

}
abstract class ChatBot extends Fatura {
	int LLM_NO;
	double ucret;

	ChatBot(int uniqueID) {
		super(uniqueID);

	}
	public abstract void addButce(int soru,double sure,String user);
	public abstract void setUcret(double ucret);
	
} 

class ChatGPT extends ChatBot{

	ChatGPT(int uniqueID) {
		super(uniqueID);
		// TODO Auto-generated constructor stub
	}
	double ucret=140.55;

	@Override
	public void addButce(int soru, double sure, String user) {
	
		double tutar=0;
		tutar = ucret+ soru*2.15+sure*0.45;
		if(user.equals("Öğrenci")){
			tutar-=tutar*0.15;
			
		}
		System.out.println(tutar);
		
	}

	@Override
	public void setUcret(double ucret) {
		this.ucret=ucret;
		
		
	}
	
}
class Gemini extends ChatBot{

	Gemini(int uniqueID) {
		super(uniqueID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addButce(int soru, double sure, String user) {
	ucret=105.33;
		double tutar=0;
		tutar = ucret+ soru*3.84+sure*0.11;
		if(user.equals("Kurumsal")){
			tutar+=tutar*0.15;
			
		}
		
	}

	@Override
	public void setUcret(double ucret) {
		this.ucret=ucret;
		
		
	}
	
}

    abstract class Platform extends Fatura{
    	String PlatformAd;
    	double ucret;
		Platform(int uniqueID,String PlatformAd,double ucret) {
			super(uniqueID);
			this.PlatformAd=PlatformAd;
			this.ucret=ucret;
		}
		
		abstract void addFiyat(double sure,double abonman);
		abstract void gosterTutar();
    	
    }
    class  Digiturk extends Platform{
       double tutar;
		Digiturk(int uniqueID,String PlatformAd,double ucret) {
			super(uniqueID,PlatformAd,ucret);
			// TODO Auto-generated constructor stub
		}

		@Override
		void addFiyat(double sure, double abonman) {
			if(sure> abonman*1.11 && sure<abonman*1.2) {
				tutar=ucret+150;
				
			}
			else if(sure> abonman*1.21 && sure<abonman*1.5) {
				tutar = (350+ ucret)*0.13;
			}
			else tutar=ucret;
			
			
		}

		@Override
		void gosterTutar() {
	System.out.println(tutar);
			
		}}
    class  Netflix extends Platform{
        double tutar;
 		Netflix(int uniqueID,String PlatformAd,double ucret) {
 			super(uniqueID,PlatformAd,ucret);
 			// TODO Auto-generated constructor stub
 		}

 		@Override
 		void addFiyat(double sure, double abonman) {
 			if(sure> abonman*1.09 && sure<abonman*1.35) {
 				tutar=ucret+420;
 				
 			}
 			else if(sure> abonman*1.51 && sure<abonman*1.8) {
 				tutar = 1400+ ucret;
 			}
 			else tutar=ucret;
 			
 			
 		}

 		@Override
 		void gosterTutar() {
 	System.out.println(tutar);
 			
 		}}





