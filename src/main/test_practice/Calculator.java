package test_practice;

public class Calculator {

	// 掛け算メソッド
	public int multiply(int num1, int num2){

		int result = num1 * num2;
		return result;
	}

	// 割り算メソッド
	public int divide(int num1, int num2){

		// 0除算
		if (num2 == 0) {
			throw new IllegalArgumentException("divided by zero");
		}
		int result = num1 / num2;
		return result;
	}

}
