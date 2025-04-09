
public class enumuygulama {

	public static void main(String[] args) {
	System.out.println(islemler.topla.Hesapla(2, 3));

	}
	enum islemler{
		topla , çıkar ,çarp,böl;
		
		public double Hesapla(double sayi1 ,double sayi2) {
			double sonuc=0;
			switch(this) {
			case topla:
				sonuc=sayi1+sayi2;
				break;
			case çıkar:
				sonuc= sayi1-sayi2;
				break;
				default:
					sonuc=-1;
					break;
			}
			return sonuc;
		}
		
	}

}
