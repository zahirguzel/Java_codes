import java.util.Scanner;
public class EbobEkok {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int s1 ,s2,min,obeb=1,ekok;
		s1=input.nextInt();
		s2=input.nextInt();
		// ekok=(s1*s2)/ebob
		min=(s1<s2)? s1:s2;
		for(int i=min;i>0;i--) {
			if((s1%i)==0 && (s2%i)==0) {
				obeb=i;
				break;
			}
				
		}
		ekok=(s1*s2)/obeb;
		System.out.println("ebob: "+obeb +"\nekok: "+ekok);
		
		
		
	}

}
