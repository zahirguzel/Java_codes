
public class main {

	public static void main(String[] args) {
		// kendikendine override eder 1. yöntem
	Lamdaİfadeler obj1 = new Lamdaİfadeler() {
		
		@Override
		public void goster1(int a) {
			// TODO Auto-generated method stub
			System.out.println("");
		}
		
		@Override
		public void goster() {
	System.out.println("nesne oluşturulmak için llocal clastan türetilen goster");
			
		}
	};
	
	// 2. yöntem
	Lamdaİfadeler obj2 =new Deneme();
	obj1.goster();
	obj2.goster();
	//3.yöntem
	Deneme obj3 =new Deneme();
	obj3.goster();
	// 4.yöntem
	lamdareturn obj4 =(int a)-> {return a*a;};
	System.out.println(obj4.kareal(5));
    lamdadeneme obj5 =(int a, int b)->{
    	int sum = a+b;
    	return sum;
    };
   System.out.println( obj5.merhaba1(2, 3));	
	

	}

}


// interfacede abstract fonksiyon olur onları cağıramın bir yönetmi kalıtımı kullanarak clas oluşturup override etmektir

class Deneme implements Lamdaİfadeler{
	
	@Override 
	public void goster() {
		System.out.println("deneme clasından gelen goster");
		
	}
	@Override
	public void goster1(int a) {
		System.out.println("deneme clasından gelen goster1");
	} 
}