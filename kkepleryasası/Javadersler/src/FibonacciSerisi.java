
public class FibonacciSerisi {

	public static void main(String[] args) {
		System.out.println(fibo(7));
	

	}
	static int fibo(int n) {
		if(n==1 || n==2) 
			return 1;
		return fibo(n-1)+fibo(n-2);
	}

}
