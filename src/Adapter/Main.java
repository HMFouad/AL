package Adapter;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new RectangleArea();
		Square square = new RectangleAdapter(rectangle);
		
		rectangle.setLenght(10);
		rectangle.setWidth(5);
		rectangle.printAreaofReactangle();
		
		square.setSide(5);
		square.PritAreaOfSquare();

	}

}
