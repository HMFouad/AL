package Builder;

public class HtmlBuilder implements Builder<String> {
	private String statement = "";

	@Override
	public void setTitle(String s) {
		statement += "<H1>" + s + "</H1>";

	}

	@Override
	public void beginParagraph(String s) {
		statement += "<br> <p>"+s;

	}

	@Override
	public void beginParagraph() {
		statement += "<br> <p>";

	}

	@Override
	public void endParagraph() {
		statement += "</p>";

	}

	@Override
	public String getStatement() {
		return statement;
	}

}
