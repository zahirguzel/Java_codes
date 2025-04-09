
public class MAİN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				EYT e1 =new EYT(20,2020);
			
				e1.emeklilikRolu=new kadınemekli();
				System.out.println(e1.emeklilikRolu.getsgkGiris());
				System.out.println("Kadın emeklilik durumu :"+e1.emeklilikRolu.sorgula(7000, "4A"));
				EYT e2 = new EYT();
				e2.ucretRolu=new isci();
				System.out.println("Alacagınız ucret miktarı :"+e2.ucretRolu.setMaas(8000, 5900));
	}

}
