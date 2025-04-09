
public class Book {
private String kitapadı , yazar , yayıncı;
private int sayfasayısı;

Book(String kitapadı , int sayfasayısı,String yazar,String yayıncı ){
	this.kitapadı=kitapadı;

	this.yazar=yazar;
	this.yayıncı=yayıncı;
	if(sayfasayısı<1) {
		System.out.println("sayfa sayısı negatif olamaz");
		this.sayfasayısı=10;
	}
	else {
		this.sayfasayısı=sayfasayısı;
	}
}
public void sayfagöster() {
	System.out.println(sayfasayısı);
}
public void  göster() {
	System.out.println(kitapadı +","+sayfasayısı +","+yazar+","+yayıncı );
}


public String getKitapadı() {
	return kitapadı;
}

public void setKitapadı(String kitapadı) {
	this.kitapadı = kitapadı;
}

public String getYazar() {
	return yazar;
}

public void setYazar(String yazar) {
	this.yazar = yazar;
}

public String getYayıncı() {
	return yayıncı;
}

public void setYayıncı(String yayıncı) {
	this.yayıncı = yayıncı;
}

public int getSayfasayısı() {
	return sayfasayısı;
}

public void setSayfasayısı(int sayfasayısı) {
	
	if(sayfasayısı<1) {
		System.out.println("sayfa sayısı negatif olamaz");
		this.sayfasayısı=10;
	}
	else {
		this.sayfasayısı=sayfasayısı;
	}
} 

}
