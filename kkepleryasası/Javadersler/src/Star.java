import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int star; 
		star=input.nextInt();
		int i = 1;
		while(i<=star) {
			int k =1;
			
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();
		}
		
	}

}
