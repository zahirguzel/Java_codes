import java.util.ArrayList;

public class rektörlük {
public int x =5;
	public static void main(String[] args) {

		rektörlük r1=new rektörlük();
		r1.x=55;
		rektörlük.fakulteler fk=r1.new fakulteler();
		fk.xgoster(111);
		rektörlükbirimi rb =new rektörlükbirimi("dddddd");// static olduğu için nesne türetilir
	System.out.println(rb.getRektör());
	}
	
	public class fakulteler{
		int x=10;
		public ArrayList<String> fakulte =new ArrayList<String>();
		public void ekle(String fadı) {
			fakulte.add(fadı);
		}
		public void xgoster(int x) {
			System.out.println("parametre olan x" + x);
			System.out.println("this.x"+ this.x);
			System.out.println("rektorlukteki x " + rektörlük.this.x);
			
			
			
		}
		
		
	}

	public class dairebaskanlıgı{
		int x=10;
		public ArrayList<String> baskanlıklar =new ArrayList<String>();
		public void ekle(String badı) {
			baskanlıklar.add(badı);
		}
		public void xgoster(int x) {
			System.out.println("parametre olan x" + x);
			System.out.println("this.x"+ this.x);
			System.out.println("rektorlukteki x " + rektörlük.this.x);
		}
	}

	  public static class rektörlükbirimi{
		  public String rektoradı="zahir güzel";
		  rektörlükbirimi(String adı){
			  this.rektoradı=adı;	  
		  }
		  public String getRektör(){
			  return this.rektoradı;
		  }
		  
	  }
}
