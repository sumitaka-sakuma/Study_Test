package sample;

public class Sample {

	public static void main(String args[]){

		int num1 = 2;
		int num2 = 5;

		int result = sum(num1, num2);

		System.out.println(result);

	}

	public static int sum(int num1, int num2){

		int result = num1 + num2;

		return result;
	}
}
