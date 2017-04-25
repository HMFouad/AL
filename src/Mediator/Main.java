package Mediator;

public class Main {

	public static void main(String[] args) {
		User HMFouad = new User("HMFouad");
		User Oussama = new User("Oussama");
		
		HMFouad.sendMessage("Hi! Oussama");
		Oussama.sendMessage("Hello! Fouad");

	}

}
