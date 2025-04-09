import java.util.Scanner;

public class faktöriyel {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int a ;
	int result =1;
	System.out.println("say giriniz: ");
	a = scan.nextInt();
	for (int i=1;i<=a;i++) {
		
		result =result*i;
		
	}
	System.out.println(result);
	}

}
