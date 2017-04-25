package Visitor;

public class Computer implements ComputerPart {
	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[]{new Keyboard(), new Mouse(), new Monitor()};
	};


	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i =0; i< parts.length; i++){
			parts[i].accept(computerPartVisitor);

		}
		computerPartVisitor.visit(this);
	}
}
