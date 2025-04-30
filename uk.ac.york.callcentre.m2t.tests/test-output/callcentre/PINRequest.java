package callcentre;

import java.util.Scanner;

public class PINRequest {
	
	protected String value;
	
	public void run(CallCentre CallCentre) {
	
		boolean validValue = false;
		while (!validValue) {
			System.out.println("Please enter your PIN");
			value = new Scanner(System.in).nextLine();
			validValue = validate(CallCentre);
		}
		CallCentre.getAuthenticatedRedirect().run(CallCentre);
	}
	
	protected boolean validate(CallCentre CallCentre) {
		/* protected region validate-body on begin */
		return true;
		/* protected region validate-body end */
	}
	
	public String getValue() {
		return value;
	}
	
}

