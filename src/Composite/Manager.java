package Composite;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 * @author HMFouad
 * 		2017
 */
public class Manager implements Employee {
	private String name;
	private List<Employee> employees = new ArrayList<Employee>();

	public Manager(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println("Manager name : " + name);
		System.out.println("Developpers names :");
		employees.forEach(emp -> emp.printName());

	}

	@Override
	public void addEmplyee(Employee employee) {
		employees.add(employee);

	}

	@Override
	public void removeEmployee(Employee employee) {
		employees.remove(employee);

	}

	@Override
	public Employee getEmployee(int i) {
		return employees.get(i);
	}

}
