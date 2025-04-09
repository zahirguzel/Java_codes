import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		int n=5;
		ArrayList<String> listem=new ArrayList<>();
		ArrayList<String> listem2=new ArrayList<String>(5);
		ArrayList<Integer> listem3=new ArrayList<Integer>();
		
		for(int i=0; i<10;i++) {
			listem2.add(i + ( ".elemean"));
			// sona ekler 
			//5 verilse dahi dinamik bellek yapısına sahip olduğu için bir sıkıntı olmaz
			
		}
		System.out.print(listem2);
		 listem2.add(2,"deneme");
		 //araya ekleme
		 
		 System.out.print( "\n" + listem2 + "\n");
		 System.out.println(listem2.indexOf("deneme"));
		 // deneme ilk hangi indexte olduğunu verir
		 System.out.println(listem2.lastIndexOf("deneme"));
		 // ssın denemeyi siler
		 System.out.println(listem2.contains("deneme2"));
		 // listede deneme2 var mı
		 listem2.remove("deneme");
		 // ilk denmeyi siler
		listem2.remove(5);
		for (String değer : listem2) {
			System.out.print(" "+ değer );
			
		}
		System.out.println();
		System.out.println(listem2.size());
		
for (int i = 0; i < listem2.size(); i++) {
	System.out.print(listem2.get(i));
	
}
listem2.set(2, "deneme");
listem2.clear();
listem2.isEmpty(); // içinde değer var mı
Collections.sort(listem2); // a dan z ye sıralma
Collections.sort(listem2, Collections.reverseOrder());// z den aya sıralama
	}

}
