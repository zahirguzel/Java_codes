
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Generaller a = new Generaller();
       a.enUstKomuta("Savaş");
	}

}
abstract class asker{
	int yas=18;

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	public abstract void yetki();
	public final void enUstKomuta(String durum) {
		if(durum=="Savaş") {
			System.out.println("Askeriyeyi Cumhurbaşkanı yönetir");
		}
		else {
			System.out.println("Askeriyeyi genel kurmay başkanı yönetir");
		}
	}
	
}
class Generaller extends asker{
	@Override
	public void yetki() {
		System.out.println("Komuta zincirinin en üstünde");
	}
	class er extends asker{
		@Override
		public void yetki() {
			System.out.println("Komuta zincirinin en altı");
		}
}
}