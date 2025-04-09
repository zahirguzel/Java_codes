
public class EmployeDriver {

	public static void main(String[] args) {
		Employee emp1= new Employee("Ahmet",2000.0,45,1985);
		System.out.println("tax:"+ emp1.tax());
		System.out.println("bonus"+ emp1.bonus());
		System.out.println("incrasesalary"+emp1.incrase());
		double totalsalary= emp1.salary-emp1.tax()+emp1.bonus();
		System.out.println("Total salary"+totalsalary);
		System.out.println("incrase saalary"+ (emp1.salary+emp1.incrase()));
		
	}

}
