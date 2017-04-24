package Builder;

public interface Builder<T> {
	public void setTitle(String s);
	public void beginParagraph(String s);
	public void beginParagraph();
	public void endParagraph();

	T getStatement();
}
