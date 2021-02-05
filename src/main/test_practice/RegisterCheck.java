package test_practice;

public class RegisterCheck {

	public static void main(String[] args) {

		int age = 0;
		boolean isRegisterMailMagazine = false;
		int userPastMonth = 0;

		isSpecialMember(age, isRegisterMailMagazine, userPastMonth);
	}

	public static boolean isSpecialMember(int age, boolean isRegisterMailMagazine, int userPastMonth) {

		if (age < 20) {
			return false;
		}

		if (!isRegisterMailMagazine) {
			return false;
		}

		if (userPastMonth < 1) {
			return false;
		}
		return true;
	}
}
