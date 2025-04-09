
public class çıktıbulma {

	public static void main(String[] args) {
		int i = 7, j = 1, k = 4;
        j += --k + 5; // k önce 1 azalır, sonra 5 eklenir.

        for (i = 0; i < j; i++) {
            k += 14 % 3; // 14 % 3 = 2, k'ya 2 eklenir.
            if (k > 12 && k < 32)
                break; // k 12 ile 32 arasına gelirse döngüden çıkılır.
        }

        k -= 3 - --i + j++; // i önce 1 azalır, sonra 3, i ve j kullanılır.
        System.out.println(i + " " + j + " " + k); // i, j v
	}

}
