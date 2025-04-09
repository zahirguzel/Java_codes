class ATM{
	private String hesapsahibi;
	private double bakiye;
	private String usd;
	private String euro;
	
	public ATM() {
		this.hesapsahibi ="bilinmiyor";
		this.bakiye= 0.0;
		this.euro="euro";
		this.usd="usd";
		
	}
	public ATM(String hesapsahibi,double bakiye, String usd ,String euro) {
		this.hesapsahibi=hesapsahibi;
		this.bakiye=bakiye;
		this.usd=usd;
		this.euro=euro;
	}
	public final void bakiyegöster() {
		System.out.println(hesapsahibi +" kullanıcıya ait bakiye bilgisi:" + bakiye);

	}
	public void parayatır(int miktar) {
		bakiye+=miktar;
		System.out.println(hesapsahibi + " adlı musterinin hesabina " + miktar + " TL yatirilmistir.");
		System.out.println("Yeni bakiye : " + bakiye);
	}
	public void paraçek(int miktar) {
		bakiye-=miktar;
		System.out.println(hesapsahibi + " adlı musterinin hesabindan " + miktar + " TL çekilmiştir.");
		System.out.println("Yeni bakiye : " + bakiye);
		
	}
	public static void atmInfo() {
		System.out.println("*****************************************************************");
		System.out.println("ATM'ye Hos geldiniz!");
		System.out.println("Bu ATM ile bakiye goruntuleyebilir, para yatirip, cekebilirsiniz.");
		System.out.println("*****************************************************************");
	}
	public  void parayatır(int miktar ,String tür) {
		switch(tür) {
		case "usd":
			bakiye = bakiye + (miktar*30);
			System.out.println(hesapsahibi + " adlı musterinin hesabina " + miktar + " USD yatirilmistir.");
			System.out.println("Yeni bakiye : " + bakiye);
			break;
		case "euro":
			bakiye = bakiye + (miktar*35);
			System.out.println(hesapsahibi + " adlı musterinin hesabina " + miktar + " euro yatirilmistir.");
			System.out.println("Yeni bakiye : " + bakiye);
			break;
			default:
				System.out.println("geçersiz işlem");
		
		
		}
	}

	
}



public class AtmProjesi {

	public static void main(String[] args) {
	ATM nesne1 =new ATM();
	ATM nesne2 = new ATM("ZAHİR",1000.0,"","");
	nesne1.bakiyegöster();
	ATM.atmInfo();
	nesne2.bakiyegöster();
	nesne2.parayatır(500);
	nesne2.parayatır(10,"usd");
	nesne2.parayatır(10,"euro");
	nesne2.paraçek(1000);


	}

}
