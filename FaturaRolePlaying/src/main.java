
public class main {

	public static void main(String[] args) {
	Fatura  deneme =new Fatura(1) ;
	deneme.ChatBotRolu = new ChatGPT(1);
	deneme.ChatBotRolu.setUcret(150);
	
	 deneme.ChatBotRolu.addButce(4, 5, "Öğrenci");
	 Fatura deneme1=new Fatura(2);
	 deneme1.PlatformRolu=new Digiturk(2, "Digiturk", 100);

	 deneme1.PlatformRolu.addFiyat(3.5, 3);
	 deneme1.PlatformRolu.gosterTutar();

	}

}
