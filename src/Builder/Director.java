package Builder;

public class Director {
	public String createBuilder(Builder<String> b){
		b.setTitle("Title");
		b.beginParagraph("This is the paragraph");
		b.endParagraph();
		
		return b.getStatement();
	}
}
