package com.techment.Day12.NewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeDemo {

	List<Employee> filterByDept(ArrayList<Employee> employees , String dept) {
		
		List<Employee> empDepts = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		return empDepts;
	}
	
	public static void main(String[] args) {

		ArrayList<Employee> employees =  new ArrayList<Employee>();
		employees.add(new Employee(1, "Bob", "Sales", 45000, 25));
		employees.add(new Employee(2, "Mike", "HR", 48000, 42));
		employees.add(new Employee(3, "John", "Developer", 55000, 28));
		employees.add(new Employee(4, "Ajay", "Marketing", 25000, 29));
		employees.add(new Employee(5, "Piyush", "Operations", 50000, 33));
		employees.add(new Employee(6, "Ravi", "Developer", 60000, 30));
		
//		employees.stream().forEach(s->System.out.println(s));
		
		long empCount = employees.stream().count();
		System.out.println("Employee Count = " + empCount);
		long developerCount = employees.stream().filter(e->e.getDept().equals("Developer")).count();
		System.out.println("Developer Count" + developerCount);
		
		employees.stream().filter(e->e.getDept().equals("Developer")).forEach(s->System.out.println(s));
		
		System.out.println("Employees with Salary > 50000 : ");
		List<Employee> emp = employees.stream().filter(e->e.getSalary()>50000).collect(Collectors.toList());
		System.out.println(emp);
		
		StreamEmployeeDemo obj = new StreamEmployeeDemo();
		List<Employee> empDepts = obj.filterByDept(employees, "Sales");
		System.out.println("Sales Dept : " + empDepts);
		
		long totalSalary = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("Total Salary = " + totalSalary);
		
		int maxSalary = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
		System.out.println("Max Salary = " + maxSalary);
		
		
	}

}
