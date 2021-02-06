package test;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import test_practice.Janken;
import test_practice.Janken.Hand;
import test_practice.Janken.Result;

@RunWith(Enclosed.class)
public class JankenTest {

	@RunWith(Theories.class)
	public static class test {

		private static Janken jan = new Janken();

		@DataPoints
		public static Hand[] HAND1 = Hand.values();
		public static Hand[] HAND2 = Hand.values();
		public static Result[] RESULT = Result.values();

		@Theory
		public void testMethod (Hand HAND1, Hand HAND2) throws Exception{

			Result result = jan.judge(HAND1, HAND2);
		}

	}
}
