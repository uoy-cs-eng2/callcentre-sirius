package callcentre;

public class Welcome {
	
	public void run(CallCentre CallCentre) {
		System.out.println("Welcome to the Call Centre");
		CallCentre.getMainSupport().run(CallCentre);
	}
	
}

