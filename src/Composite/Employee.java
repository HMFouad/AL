package Composite;

import javax.naming.OperationNotSupportedException;

public interface Employee {
	public void printName();
	public void addEmplyee(Employee employee) throws OperationNotSupportedException;
	public void removeEmployee(Employee employee) throws OperationNotSupportedException;
	public Employee getEmployee(int i) throws OperationNotSupportedException;
}
