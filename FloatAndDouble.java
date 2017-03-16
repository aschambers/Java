public class FloatAndDouble {
	public static void main(String[] args) {
		int myIntValue = 5 / 2; // width of int = 32 (4 bytes)
		float myFloatValue = 5f; // width of float = 32 (4 bytes)
		// we will only be using doubles later on in the course
		double myDoubleValue = 5d; // width of double = 64 (8 bytes)
		// typing sout is a shortcut for system.out.println
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue); // 7 digits of precision
		System.out.println("myDoubleValue = " + myDoubleValue); // 16 digits of precision (faster on modern computers).

		double numPounds = 200d;
		double getPoundsInKilograms = numPounds * 0.45359237d;
		System.out.println("Kilograms = " + getPoundsInKilograms);
		// can use underscores like commas to make code cleaner - example:
		double pi = 3_000_000.1415927d;
		System.out.println("value of pi = " + pi);
	}
}