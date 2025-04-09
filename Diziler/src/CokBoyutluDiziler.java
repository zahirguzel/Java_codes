
public class CokBoyutluDiziler {

	public static void main(String[] args) {
	  int[][] tablo = new int[][] {
		  {1,2,3},
		  {4,5,6},
		  {7,8,9},
		  {10,11,12},
		  {13,14,15}
		  
	  };
	  int [][] tablo2= new int [5][3];
	  tablo2[0][0]=1;
	  tablo2[0][1]=2;
	  for(int i=0;i<tablo.length;i++) {
		  for(int j=0;j<tablo[0].length;j++) {
			  System.out.print(tablo[i][j]+" ");
			
		  }
		  System.out.println();
	  }
	  System.out.println("---------");
	  for(int[] sutun : tablo) {    // foreach şeklinde kullanımı!!!
		  for(int value : sutun) {
			  System.out.print(value+" ");
			  
		  }
		  System.out.println();
	  }
	  
	  
	}

}
