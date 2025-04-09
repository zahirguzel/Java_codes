
public class Çıktı2 {

	public static void main(String[] args) {
		   int i = 2, j = 0, k = 3;
	        j += 10 + ++k; // k önce 1 artar, sonra 10 ile toplanır
	        k *= 5 + j++ - --k; // j önce kullanılır, sonra 1 artar, k önce 1 azalır, işlem yapılır
	        System.out.println((i |= --k)); // k önce 1 azalır, sonra i ile bitwise OR yapılır
	}

}
