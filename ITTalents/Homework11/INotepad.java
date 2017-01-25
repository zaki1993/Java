
public interface INotepad {
	void addText(String text, int pageNumber);
	void rewriteText(String text, int pageNumber);
	void deleteText(int pageNumber);
	void printPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
