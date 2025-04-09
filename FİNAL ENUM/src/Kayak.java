
public enum Kayak { 
	kar(0.21),taslik(0.34),toprak(0.47);
	double fs ;
	
	Kayak(double fs ){
		this.fs=fs;
	}
	public void hesapla(double m ,double alpha) {
		double result=0;
		
		result= m*9.18*Math.sin(Math.toRadians(alpha))-fs;
		System.out.println(result+"N");
	}

}
