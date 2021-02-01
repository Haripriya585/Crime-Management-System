package utility;

public class OfficerValidation {
	public boolean checkOfficerAccess(String name, String password) {
		if (((name.equalsIgnoreCase("priya")) && (password.equalsIgnoreCase("priya@123"))) || ((name.equalsIgnoreCase("officer")) && (password.equalsIgnoreCase("officer@123")))) {
			return true;
		} else {
			return false;
		}
		
	}

}
