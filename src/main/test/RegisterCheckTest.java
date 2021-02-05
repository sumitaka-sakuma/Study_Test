package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import test_practice.RegisterCheck;

@RunWith(Enclosed.class)
@SuppressWarnings("static-access")
public class RegisterCheckTest {

	public static class isSpecialMember {

		private static RegisterCheck rc;
		private static int age ;
		private static boolean isRegisterMailMagazine;
		private static int userPastMonth;

		@Before
		public void setUp () {
			rc = new RegisterCheck();
			age = 20;
			isRegisterMailMagazine = true;
			userPastMonth = 1;
		}

		@Test
		public void specialMemberSuccess () {

			boolean actual = rc.isSpecialMember(age, isRegisterMailMagazine, userPastMonth);
			assertTrue(actual);
		}
	}

	public static class isNotSpecialMemberAge {

		private static RegisterCheck rc;
		private static int age ;
		private static boolean isRegisterMailMagazine;
		private static int userPastMonth;

		@Before
		public void setUp () {
			rc = new RegisterCheck();
			age = 19;
			isRegisterMailMagazine = true;
			userPastMonth = 1;
		}

		@Test
		public void specialMemberFalse () {

			boolean actual = rc.isSpecialMember(age, isRegisterMailMagazine, userPastMonth);
			assertFalse(actual);
		}
	}

	public static class isNotSpecialMemberRegister {

		private static RegisterCheck rc;
		private static int age ;
		private static boolean isRegisterMailMagazine;
		private static int userPastMonth;

		@Before
		public void setUp () {
			rc = new RegisterCheck();
			age = 20;
			isRegisterMailMagazine = false;
			userPastMonth = 1;
		}

		@Test
		public void specialMemberFalse () {

			boolean actual = rc.isSpecialMember(age, isRegisterMailMagazine, userPastMonth);
			assertFalse(actual);
		}
	}

	public static class isNotSpecialMemberUserPostMonth {

		private static RegisterCheck rc;
		private static int age ;
		private static boolean isRegisterMailMagazine;
		private static int userPastMonth;

		@Before
		public void setUp () {
			rc = new RegisterCheck();
			age = 20;
			isRegisterMailMagazine = true;
			userPastMonth = 0;
		}

		@Test
		public void specialMemberFalse () {

			boolean actual = rc.isSpecialMember(age, isRegisterMailMagazine, userPastMonth);
			assertFalse(actual);
		}
	}
}
