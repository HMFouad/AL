package Proxy;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("fileName.jpg");
		
		//Image will be loaded from disk
		image.display();
		
		//Image will not be loaded from disk
		image.display();

	}

}
