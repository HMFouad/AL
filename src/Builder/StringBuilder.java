package Builder;

public class StringBuilder implements Builder<String> {
	private String statement = "";

	@Override
	public void setTitle(String s) {
		statement += "Title: " + s; 

	}

	@Override
	public void beginParagraph(String s) {
		statement += " \n begin paragraph : \n " + s;

	}

	@Override
	public void beginParagraph() {
		statement += "\n";

	}

	@Override
	public void endParagraph() {
		statement += "\n";

	}

	@Override
	public String getStatement() {
		return statement;
	}

}
