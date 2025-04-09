
public enum Whois {
	gokhan("www.gkh.iste"), zahir("zhz.com"), google("www.google.com");

	public String url = "";

	Whois(String a) {
		this.url = a;
	}

	public String urlgoster() {
		return url;
	}

}
