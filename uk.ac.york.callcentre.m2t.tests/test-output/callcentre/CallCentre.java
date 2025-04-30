package callcentre;

public class CallCentre {
	
	protected PINRequest PINRequest = createPINRequest();
	protected AuthenticatedRedirect AuthenticatedRedirect = createAuthenticatedRedirect();
	
	public static void main(String[] args) {
		new CallCentre().run();
	}
	
	public void run() {
		getPINRequest().run(this);	
	}
	
	protected PINRequest createPINRequest() {
		return new PINRequest();
	}
	
	public PINRequest getPINRequest() {
		return PINRequest;
	}
	
	protected AuthenticatedRedirect createAuthenticatedRedirect() {
		return new AuthenticatedRedirect();
	}
	
	public AuthenticatedRedirect getAuthenticatedRedirect() {
		return AuthenticatedRedirect;
	}
	
	
	
	
}

