
public class Employee {
	public String name;
	public double salary;
	public int workhours,hireyear;
	
	Employee(String name ,double salary ,int workhours,int hireyear){
		this.name=name;
		this.salary=salary;
		this.workhours=workhours;
		this.hireyear=hireyear;
		
	}
	public double tax() {
		if(this.salary>=1000) {
			return salary*0.03;
		}
		return 0.00;
	}
	public double bonus() {
		int extrahours = this.workhours-40;
		if(extrahours>0) {
			return 30*extrahours;
		}
		return 0.00;
	}
	public double incrase() {
		int year = 2024 - this.hireyear;
		if(year<10) {
			return salary*0.5;
		}
		else if (year>=10&& year<20){
			return salary*0.10;
		}
		return salary*0.15;
	}
	

}
