
public class cıktı3 {

	public static void main(String[] args) {
		int i = 3, j = 2, k = 0;
		j += k-- + 11;
		for (i = 0; i < j; i++) {
		    k += 5 % 3;
		    if (k > 12 && k < 19) break;
		  
		}
		  k -= 2 - ++i + j--;
		System.out.println(i + "," + j + "," + k); 
	}

}
