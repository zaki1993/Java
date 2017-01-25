
public class SimpleNotepad implements INotepad{
	private Page[] pages;
	private final int MAX_PAGES;
	private int currentPageNumber;
	
	public SimpleNotepad(final int MAX_PAGES) {
		this.MAX_PAGES = MAX_PAGES;
		this.currentPageNumber = 0;
		this.pages = new Page[this.MAX_PAGES];
	}
	
	Page[] getPages(){
		return this.pages;
	}
	
	int getMaxPages(){
		return this.MAX_PAGES;
	}
	
	int getCurrentPages(){
		return this.currentPageNumber;
	}
	
	void addPage(Page newPage){
		if(this.currentPageNumber + 1 >= this.MAX_PAGES){
			return;
		}
		this.pages[this.currentPageNumber++] = newPage;
	}
	
	@Override
	public void addText(String text, int pageNumber) {
		if(pageNumber < this.MAX_PAGES){
			pages[pageNumber].addText(text);
		}
	}

	@Override
	public void rewriteText(String text, int pageNumber) {
		if(pageNumber < this.MAX_PAGES){
			pages[pageNumber].deleteText();
			pages[pageNumber].addText(text);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if(pageNumber < this.MAX_PAGES){
			pages[pageNumber].deleteText();
		}
	}

	@Override
	public void printPages() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i] != null){
				pages[i].printPage();
			}
		}
	}
	
	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i] != null){
				if(pages[i].searchWord(word)){
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i] != null){
				if(pages[i].containsDigits()){
					pages[i].printPage();
				}
			}
		}
	}

}
