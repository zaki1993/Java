
public class Page {
	private String title;
	private String content;
	
	Page(String title, String content){
		this.title = title;
		this.content = content;
	}
	
	void addText(String text){
		content += content.concat(" " + text);
	}
	
	void deleteText(){
		content = "";
	}
	
	void printPage(){
		System.out.println("Title: " + title + ", content: " + content);
	}
	
	boolean searchWord(String word){
		String[] words = content.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(word)){
				return true;
			}
		}
		return false;
	}
	
	boolean containsDigits(){
		return content.matches(".*[0-9].*");
	}
}
