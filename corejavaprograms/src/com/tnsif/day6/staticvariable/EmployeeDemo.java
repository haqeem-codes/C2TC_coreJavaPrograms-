package com.tnsif.day6.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		System.out.println(Employee.companyName);
		Employee e = new Employee("Albi", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Dhivya", 321);
		System.out.println(e);
	}
}
