package utility;

public class AdminValidation {

	public boolean checkAdminAccess(String name, String password) {
		if (((name.equalsIgnoreCase("Haripriya")) && (password.equalsIgnoreCase("root@123"))) || ((name.equalsIgnoreCase("Admin")) && (password.equalsIgnoreCase("admin@123")))) {
			return true;
		} else {
			return false;
		}
		
	}

}