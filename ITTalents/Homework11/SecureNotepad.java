import java.util.Scanner;

public class SecureNotepad extends SimpleNotepad{

	private final String PASSWORD;
	private final Scanner sc = new Scanner(System.in);
	private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}";
	
	public SecureNotepad(final int MAX_PAGES,final String PASSWORD) throws Exception {
		super(MAX_PAGES);
		if(!PASSWORD.matches(PASSWORD_REGEX)){
			throw new Exception("Too weak password!");
		}
		else{
			this.PASSWORD = PASSWORD;
		}
	}
	
	boolean matchPasswords(){
		System.out.println("Enter a password: ");
		String passwd = sc.nextLine();
		if(this.PASSWORD.equals(passwd)){
			System.out.println("Access granted!");
			return true;
		}
		System.out.println("Access denied!");
		System.out.println("Please, enter again: ");
		return matchPasswords();
	}
	
	@Override
	void addPage(Page newPage){
		if(matchPasswords()){
			super.addPage(newPage);
			return;
		}
	}
	
	@Override
	public void addText(String text, int pageNumber) {
		if(matchPasswords()){
			super.addText(text, pageNumber);
			return;
		}
	}

	@Override
	public void rewriteText(String text, int pageNumber) {
		if(matchPasswords()){
			super.rewriteText(text, pageNumber);
			return;
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if(matchPasswords()){
			super.deleteText(pageNumber);
			return;
		}
	}

	@Override
	public void printPages() {
		if(matchPasswords()){
			super.printPages();
			return;
		}
	}
	
}
