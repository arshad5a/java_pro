package day3;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.setEid(101);
		e1.setEname("Almaazin");
		e1.setSalary(200000.0d);
		e1.setCity("Puducherry");
		
		System.out.println(e1);
		
		Employee e2=new Employee();
		
		e2.setEid(102);
		e2.setEname("Rajan E");
		e2.setSalary(175000.0d);
		e2.setCity("Bangalore");
		
		//Object Printing : it calls the toString()
		System.out.println(e2);
		
		
	}

}