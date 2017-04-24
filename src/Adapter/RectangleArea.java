package Adapter;

public class RectangleArea implements Rectangle {
	private int lenght, width;

	@Override
	public void setLenght(int lenght) {
		this.lenght = lenght;

	}

	@Override
	public void setWidth(int width) {
		this.width = width;

	}

	@Override
	public void printAreaofReactangle() {
		System.out.println("Area of Rectangle is: " + lenght*width);

	}

}
