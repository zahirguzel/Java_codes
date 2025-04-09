
public class ArmstrongSayı {

	public static void main(String[] args) {
		int temp ,birler,onlar,yüzler,toplam;
		for(int i=100;i<1000;i++) {
			temp=i;
		birler = temp%10;
		temp = temp/10;
		onlar=temp%10;
		temp=temp/10;
		yüzler=temp%10;
		temp =temp/10;
		
			toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(yüzler*yüzler*yüzler);
			if(toplam==i) {
				System.out.println(i);
		}
		}
		

	}

}
