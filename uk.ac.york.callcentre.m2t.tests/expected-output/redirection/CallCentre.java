package callcentre;

public class CallCentre {
	
	protected Welcome Welcome = createWelcome();
	protected MainSupport MainSupport = createMainSupport();
	
	public static void main(String[] args) {
		new CallCentre().run();
	}
	
	public void run() {
		getWelcome().run(this);	
	}
	
	protected Welcome createWelcome() {
		return new Welcome();
	}
	
	public Welcome getWelcome() {
		return Welcome;
	}
	
	protected MainSupport createMainSupport() {
		return new MainSupport();
	}
	
	public MainSupport getMainSupport() {
		return MainSupport;
	}
	
	
	
	
}

