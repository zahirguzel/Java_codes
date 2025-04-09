
public class VoidFonksiyon {
	
	public static void main(String[] args) {
		power(2,3);

	}
	static void power(int n1,int n2) {
		int result=1;
		for(int i=1 ;i<=n2;i++) {
			result*=n1;
		
		}
		System.out.println(result);
	}
	
	

}
