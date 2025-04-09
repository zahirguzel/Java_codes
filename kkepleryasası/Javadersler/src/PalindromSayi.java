
public class PalindromSayi {

	
	static boolean isPalindrom(int input) {
		int kalan,tersayi=0,temp;
		temp=input;
		while(temp != 0) {
			kalan=temp%10;
			tersayi=tersayi*10+kalan;
			temp/=10;
			
		}
		if (input==tersayi) 
		return true;
		else 
			return false;
		
		
	}
	public static void main(String[] args) {
		System.out.println(isPalindrom(121));
	
	}

}
