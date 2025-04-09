
public interface Deeptech { 
	 
	public void setButceekle(double tutar);
	public void operations();

}
  class DT2025  implements Deeptech{
	  int projeıd;
	  double projebutce;
	  String  projead;
	  DT2025(int projeıd ,double projebutce ,String projead ){
		  this.projeıd=projeıd;
		  this.projebutce=projebutce;
		  this.projead=projead;
	  }
	  
	  
	  @Override
	  public void setButceekle(double tutar) {
		  projebutce+=projebutce+tutar;
		  
	  }
	  @Override
		public void operations() {
		 Runnable r1 =()->System.out.println(projeıd + projebutce + projead);
		 r1.run();
		  
	  }
  }
