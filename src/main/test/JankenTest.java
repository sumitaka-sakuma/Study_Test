package test;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class JankenTest {

	@RunWith(Theories.class)
	public static class test {

		@DataPoints
		public static String[] HAND = {"GU", "TYOKI", "PA"};
		public static String[] RESULT = {"WIN", "LOSE", "DRAW"};

		@Theory
		public void testMethod (String HAND, String RESULT) throws Exception{
			System.out.println(HAND + "/" + RESULT);
		}
	}
}
