
public class kitaplar {

	public static void main(String[] args) {
		Book b1 = new Book("Sol ayağım ", -150 , "christy brown","yayıncı");
		b1.sayfagöster();
		b1.setSayfasayısı(350);
		System.out.println(b1.getSayfasayısı());
		b1.göster();
		b1.setSayfasayısı(-5);
		b1.göster();
	}
	

}
