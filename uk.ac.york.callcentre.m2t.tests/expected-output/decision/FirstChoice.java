package callcentre;

import java.util.Scanner;

public class FirstChoice {
	
	public void run(CallCentre CallCentre) {
		System.out.println("Choose department");
		
		System.out.println("1. Sales");
		System.out.println("2. Support");
		
		while (true) {
			String response = new Scanner(System.in).nextLine();
			if (response.equals("1")) {
				CallCentre.getSalesRedirect().run(CallCentre);
				return;
			}
			if (response.equals("2")) {
				CallCentre.getSupportRedirect().run(CallCentre);
				return;
			}
			System.out.println("Invalid option selected. Please select a valid option");
		}
		
	}
	
}