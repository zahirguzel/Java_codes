
public class Kalıtım {

	public static void main(String[] args) {
		Hayvan a = new Hayvan();
		System.out.println("----------------");
		Etcil b = new Etcil();
		System.out.println("----------------");
		b.Ceneyapısı();
		b.Beslenme();
		b.Ceneyapısı();
		System.out.println("----------------");
		Otcul c= new Otcul();
		c.Beslenme();
		c.Ceneyapısı();
		System.out.println("------------");
		Kuslar d = new Kuslar();
		d.Beslenme();
		d.Ceneyapısı();
		d.EtcilGöster();
		System.out.println("------------");
		Hayvan e = new Hayvan(45);
		Etcil f= new Etcil();
		System.out.println(f.kilo);
		b.Goster();
	}

}
