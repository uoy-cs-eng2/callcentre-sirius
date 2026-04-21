package acmebank;

public class PINInput extends PINInputBase {

	@Override
	protected boolean validate(AcmeBank AcmeBank) {
		return value.equals("1234");
	}

}
