package Composite;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.OperationNotSupportedException;

public class Main {
	private static Logger log = Logger.getLogger("logger");
	
	public static void main(String[] args) {
		Employee emp1 = new Developer("Fouad");
		Employee emp2 = new Developer("Oussama");
		
		Employee mng = new Manager("HMFouad");
		
		try {
			mng.addEmplyee(emp1);
			mng.addEmplyee(emp2);
		} catch (OperationNotSupportedException e) {
			log.log(Level.INFO, e.getMessage());
		}
		mng.printName();
	}

}
