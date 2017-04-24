package Adapter;

public class SquareArea implements Square {
	private int sideLenght;

	@Override
	public void setSide(int sideLenght) {
		this.sideLenght = sideLenght;

	}

	@Override
	public void PritAreaOfSquare() {
		System.out.println("Area of Square is: " + sideLenght*sideLenght);

	}

}
