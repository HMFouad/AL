package Composite;

import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

/*
 * 
 * @author HMFouad
 * 		2017
 */
public class Developer implements Employee {
	private String name;

	public Developer(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println(this.name);

	}

	@Override
	public void addEmplyee(Employee employee) throws OperationNotSupportedException{
		throw new OperationNotSupportedException();

	}

	@Override
	public void removeEmployee(Employee employee) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();

	}

	@Override
	public Employee getEmployee(int i) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

}
