
public class ornek {

	public static void main(String[] args) {
		 int i = 2, j = 0, k = 3;

	        j += 10 + ++k;   

	       
	        k *= 5 + j++ - --k;  
System.out.println(i+"-"+j+"-"+k);
	       
	        System.out.println((i |= --k)); 
	       
	}

}
