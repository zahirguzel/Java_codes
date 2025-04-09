
public class yerelsınıflar {
	public String regularIfade = "^[0-9]";
	
	public static void TelefonDogrula(String tlfno) {
		final int numuzunluk =10;
		int numdeger=0;
		//
		//yerel class başladı
		  class TelefonNumarası{
			  public String regularIfade = "^[0-9]";
			  String temizlenennumara= null;
			  TelefonNumarası(String tlfno){
				  temizlenennumara =tlfno.replaceAll(regularIfade, " "); 
				  if (temizlenennumara.length()==numuzunluk) {
					  this.temizlenennumara=temizlenennumara;
					
				}else {
					this.temizlenennumara=null;
				}
				   
			  }
			  public String getTlfno(){
				  return temizlenennumara;
			  }
			  public void numaragoster() {
				  System.out.println(temizlenennumara);
			  }
			  
		  }
		  //yerel class bitti
		  //
		  TelefonNumarası numara=new TelefonNumarası(tlfno);
		  if (numara.getTlfno()==null) {
			  System.out.println("hatalı numara");
			
		}else {
			System.out.println(numara.getTlfno());
		}
	}
	
	
	public static void main(String[] args) {
		TelefonDogrula("454542542");
		TelefonDogrula("05318967852");
	

	}

}
