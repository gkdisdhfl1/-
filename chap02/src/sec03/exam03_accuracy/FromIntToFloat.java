package sec03.exam03_accuracy;

public class FromIntToFloat {
	public static void main(String [] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		float num3 = num2;
		num2 = (int)num3;
		
		int result = num1-num2;
		System.out.println(result);
	}
}
