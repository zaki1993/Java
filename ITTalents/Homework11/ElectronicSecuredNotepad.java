
public class ElectronicSecuredNotepad extends SecureNotepad implements IЕlectronicDevice{
	private boolean isStarted;
	
	public ElectronicSecuredNotepad(int MAX_PAGES, String PASSWORD) throws Exception {
		super(MAX_PAGES, PASSWORD);
		this.isStarted = false;
	}

	@Override
	public void start() {
		this.isStarted = true;
	}

	@Override
	public void stop() {
		this.isStarted = false;
	}
	
	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

}
