package final2;

import java.util.ArrayList;
import java.util.Collections;

// Generic Dizi sınıfı
public class Dizi<T extends Comparable<T>> {
    private T[] dizi;

    // Donustur fonksiyonu: ArrayList'i diziye dönüştürür
    public void Donustur(ArrayList<T> arrayList) {
        // Generic bir array oluşturmak için casting yapıyoruz
        dizi = (T[]) new Comparable[arrayList.size()];
        
        for (int i = 0; i < arrayList.size(); i++) {
            dizi[i] = arrayList.get(i);
        }
    }

    // OrtancaBul fonksiyonu: Ortanca değeri bulur
    public T OrtancaBul() {
        if (dizi == null || dizi.length == 0) {
            throw new IllegalStateException("Dizi boş veya tanımlı değil.");
        }

        // Diziyi bir ArrayList'e dönüştürüp sıralıyoruz
        ArrayList<T> sortedList = new ArrayList<>();
        Collections.addAll(sortedList, dizi);
        Collections.sort(sortedList);

        int ortancaIndex = sortedList.size() / 2;
        if (sortedList.size() % 2 == 0) {
            // Çift sayıda eleman varsa iki ortanca eleman arasında tercih yapabilirsiniz.
            return sortedList.get(ortancaIndex); // İkinci ortanca elemanı döndürüyoruz
        } else {
            return sortedList.get(ortancaIndex);
        }
    }

    // Diziyi yazdırmak için bir yardımcı fonksiyon
    public void Yazdir() {
        if (dizi == null || dizi.length == 0) {
            System.out.println("Dizi boş veya tanımlı değil.");
            return;
        }

        for (T eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }

    // Test kodu
    public static void main(String[] args) {
        // Bir ArrayList oluştur
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);

        // Dizi sınıfını kullan
        Dizi<Integer> dizi = new Dizi<>();
        dizi.Donustur(arrayList);

        System.out.print("Dizi: ");
        dizi.Yazdir();

        // Ortanca değeri bul ve yazdır
        System.out.println("Ortanca Değer: " + dizi.OrtancaBul());
    }
}
